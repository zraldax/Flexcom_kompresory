/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.Pobocka_DAO;
import dao.Zakaznik_DAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    private FilterComboBox filtercombo;
    private JComboBox combox1,combobox2;
    private JButton submitbuton;
    private JLabel customerText,bussnisText,text1,text2,text3;
    private Zakaznik_DAO zakaznik;
    private Pobocka_DAO pobocka;
    
    public JPanel01() {
        zakaznik = new Zakaznik_DAO();
        pobocka = new Pobocka_DAO();
        List<String> zakaznici = zakaznik.getAllNames();
        zakaznici.add(0,"");
        filtercombo = new FilterComboBox(zakaznici);
        text1 = new JLabel("Zvolte zákazníka :");
        customerText = new JLabel("");
        combox1 = new JComboBox();
        add(text1);
        add(customerText);
        add(filtercombo);
        add(combox1);
        submitbuton = new JButton("Hledej");
        submitbuton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = filtercombo.getSelectedItem().toString();
                System.out.println(a);
                customerText.setText(a);
                ArrayList<String> b = pobocka.getPobocka(zakaznik.getID(a));
                combox1.removeAllItems();
                for(String i : b){
                    combox1.addItem(i);
                }
                
                //filtercombo.setVisible(false);
                }
        });
        add(submitbuton);
    }
    
    
}
