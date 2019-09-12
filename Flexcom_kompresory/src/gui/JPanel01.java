/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.Pobocka_DAO;
import dao.Stroj_DAO;
import dao.Zakaznik_DAO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cooler
 */
public class JPanel01 extends JPanel{
    private JComboBox<String> combox1,combobox2,comboBox3;
    private JButton submitbuton;
    private JLabel customerText,bussnisText,text1,text2,text3;
    private Zakaznik_DAO zakaznik;
    private Pobocka_DAO pobocka;
    private Stroj_DAO stroj;
    
    public JPanel01() {
        zakaznik = new Zakaznik_DAO();
        pobocka = new Pobocka_DAO();
        stroj = new Stroj_DAO();
        List<String> zakaznici = zakaznik.getAllNames();
        combox1 = new JComboBox<>(zakaznici.toArray(new String[zakaznici.size()]));
        combobox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        ComboBoxFilterDecorator<String> decorate = ComboBoxFilterDecorator.decorate(combox1,
              JPanel01::myfilter);
        combox1.setRenderer(new CustomComboRenderer(decorate.getFilterLabel()));
        combox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()== ItemEvent.DESELECTED && combox1.getSelectedItem() != null ){
                    System.out.println(combox1.getSelectedItem());
                    String name = combox1.getSelectedItem().toString();
                    List<String> pobocky = pobocka.getPobocka(zakaznik.getID(name));                 
                    combobox2.removeAllItems();comboBox3.removeAllItems();
                    System.out.println(pobocky);
                    for(String i : pobocky){
                        combobox2.addItem(i);
                    }
                    //
                }
            }
        });
        combobox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(combobox2.getSelectedItem() != null ){
                    System.out.println(combox1.getSelectedItem());
                    String name = combobox2.getSelectedItem().toString();
                    String idname = combox1.getSelectedItem().toString();
                    if(idname != null){
                        List<String>    pobocky = stroj.getStroj(pobocka.getId(zakaznik.getID(idname),name));
                        comboBox3.removeAllItems();
                        System.out.println(pobocky);
                        for(String i : pobocky){
                            comboBox3.addItem(i);
                        }    
                    }             
                                      
                }
            }
        });
        submitbuton = new JButton("NAJDI");
        add(combox1);
        add(combobox2);
        add(comboBox3);
        add(submitbuton);
        
    }
    private static boolean myfilter(String a,String textToFilter){
        if(textToFilter.isEmpty()){
            return true;
        }
        return a.toLowerCase().contains(textToFilter.toLowerCase());
    }
    
}
