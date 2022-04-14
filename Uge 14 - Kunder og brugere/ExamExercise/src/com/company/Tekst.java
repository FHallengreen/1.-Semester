package com.company;

import java.util.ArrayList;

public class Tekst {
    public ArrayList <String> textLines;

    public Tekst (){
        this.textLines = new ArrayList<String>();
    }

    public void addText (String text){
        textLines.add(String.valueOf((text)));
        System.out.println(textLines);
    }

    public int uniqueLines(){
        ArrayList <String> uniqueLine = new ArrayList<>();
        for (int i = 0; i < textLines.size(); i++) {
            if (!uniqueLine.contains(textLines.get(i))){
                uniqueLine.add(textLines.get(i));
            }
        }
        return uniqueLine.size();
    }
}
