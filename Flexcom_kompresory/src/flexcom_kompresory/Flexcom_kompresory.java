/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexcom_kompresory;

import gui.MainGui;
import javax.swing.JFrame;

/**
 *
 * @author Kancl
 */
public class Flexcom_kompresory {

    public static void main(String[] args) throws Exception {

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //makeUI();
        MainGui a = new MainGui();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(500,500);
        a.setVisible(true);
    }
}
    

