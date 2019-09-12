package gui;

import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cooler
 */
public class HtmlHighlighter {
    private static final String HighLightTemplate = "<span style='background:yellow;'>$1</span>";

    public static String highlightText(String text, String textToHighlight) {
        if(textToHighlight.length()==0){
            return text;
        }

        try {
            text = text.replaceAll("(?i)(" + Pattern.quote(textToHighlight) + ")", HighLightTemplate);
        } catch (Exception e) {
            return text;
        }
        return "<html>" + text + "</html>";
    }
}