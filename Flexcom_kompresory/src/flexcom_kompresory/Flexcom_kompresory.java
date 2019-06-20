/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexcom_kompresory;

import gui.FilterComboBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Kancl
 */
public class Flexcom_kompresory {

    public static List<String> populateArray() {
        List<String> test = new ArrayList<String>();
        test.add("");
        test.add("Mountain Flight");
        test.add("Mount Climbing");
        test.add("Trekking");
        test.add("Rafting");
        test.add("Jungle Safari");
        test.add("Bungie Jumping");
        test.add("Para Gliding");
        return test;
    }

    public static void makeUI() {
        JFrame frame = new JFrame("Adventure in Nepal - Combo Filter Test");
        FilterComboBox acb = new FilterComboBox(populateArray());
        frame.getContentPane().add(acb);
        acb.getSelectedItem();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        makeUI();
    }
}
    

