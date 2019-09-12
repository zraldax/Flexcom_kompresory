/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;

/**
 *
 * @author Cooler
 */
public class CustomComboRenderer extends DefaultListCellRenderer{
    public static final Color background = new Color(250, 250, 255);
    private static final Color defaultBackground = (Color) UIManager.get("List.background");
    private JLabel searchLabel;

    public CustomComboRenderer(JLabel filterLabel) {
        this.searchLabel = filterLabel;
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        String emp = (String) value;
        if (emp == null) {
            return this;
        }
        String text = (String)value;
        text = HtmlHighlighter.highlightText(text, searchLabel.getText());
        this.setText(text);
        if (!isSelected) {
            this.setBackground(index % 2 == 0 ? background : defaultBackground);
        }
        return this;
    }

}
