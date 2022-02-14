package com.company;

public class Main {
    public void langtUde(){
        System.out.println("Bjerget ligger langt ud' i skoven. \n");
    }
    public void aldrigSåDejlig(){
        System.out.print("aldrig så jeg så dejlig en ");
    }
    public void aldrigSåDejligt(){
        System.out.print("aldrig så jeg så dejligt et ");
    }
    public void lille(){
        System.out.print("lille ");
    }
    public void enLille(){
        System.out.print("en lille ");
    }
    public void etLille(){
        System.out.print("et lille ");
    }
    public void bjerg(){
        System.out.print("bjerg");
    }
    public void påDet(){
        System.out.print("På det ");
    }
    public void stodDer(){
        System.out.print(" stod der ");
    }
    public void derSad(){
        System.out.print(" der sad ");
    }
    public void træ(){
        System.out.print("træ");
    }
    public void et(){
        System.out.print("et ");
    }
    public void en(){
        System.out.print("en ");
    }
    public void mellemrum(){
        System.out.println(" ");
    }
    public void på(){
        System.out.print("på ");
    }
    public void gren(){
        System.out.print("gren");
    }
    public void vers3(){
        System.out.println("På det lille træ der sad en lille gren,\naldrig så jeg så dejlig en gren. \nGrenen på træet.\nTræet på bjerget.");
    }
    public void omkvæd(){
        System.out.println("Bjerget ligger langt ud' i skoven. \n");
    }
    public void vers4(){
        System.out.println("På den lille gren der sad en lille kvist,\n" +
                "aldrig så jeg så dejlig en kvist.\n" +
                "Kvisten på grenen.\n" +
                "Grenen på træet.\n" +
                "Træet på bjerget.");
    }
    public static void main(String[] args) {
        System.out.println("Langt ud' i skoven lå et lille bjerg,");
        Main obj = new Main();
        obj.aldrigSåDejlig();
        obj.bjerg();
        obj.mellemrum();
        obj.langtUde();
        obj.påDet();
        obj.lille();
        obj.bjerg();
        obj.stodDer();
        obj.etLille();
        obj.træ();
        obj.mellemrum();
        obj.aldrigSåDejlig();
        obj.træ();
        obj.mellemrum();
        obj.træ();
        obj.et();
        obj.på();
        obj.bjerg();
        obj.et();
        obj.mellemrum();
        obj.langtUde();

        obj.påDet();
        obj.lille();
        obj.træ();
        obj.derSad();
        obj.enLille();
        obj.gren();
        obj.mellemrum();
        obj.aldrigSåDejlig();
        obj.gren();
        obj.mellemrum();
        obj.gren();
        obj.en();
        obj.på();
        obj.træ();
        obj.et();
        obj.træ();
        obj.et();
        obj.på();
        obj.bjerg();
        obj.et();
        obj.mellemrum();
        obj.langtUde();

        obj.vers3();
        obj.omkvæd();

        obj.vers4();
        obj.omkvæd();


    }
}