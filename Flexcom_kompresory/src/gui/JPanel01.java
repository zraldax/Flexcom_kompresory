/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.Zakaznik_DAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Cooler
 */
public class JPanel01 extends JPanel{
    FilterComboBox filtercombo;
    JButton submitbuton;
    public JPanel01() {
        Zakaznik_DAO zakaznik = new Zakaznik_DAO();
        List<String> zakaznici = zakaznik.getAllNames();
        zakaznici.add(0,"");
        filtercombo = new FilterComboBox(zakaznici);
        add(filtercombo);
        submitbuton = new JButton("Hledej");
        submitbuton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(filtercombo.getSelectedItem());
                filtercombo.setVisible(false);
            }
        });
        add(submitbuton);
    }
    
    
}
