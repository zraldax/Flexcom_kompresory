/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

/**
 *
 * @author Cooler
 */

public class BoxItemListenr implements ItemListener {
  // This method is called only if a new item has been selected.
  @Override
  public void itemStateChanged(ItemEvent evt) {
    JComboBox cb = (JComboBox) evt.getSource();

    Object item = evt.getItem();

    if (evt.getStateChange() == ItemEvent.SELECTED) {
      // Item was just selected
        System.out.println("ble");
    } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
      // Item is no longer selected
    }
  }
}