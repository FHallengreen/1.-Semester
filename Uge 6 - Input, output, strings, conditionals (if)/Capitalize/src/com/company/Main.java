package com.company;

public class Main {

    public static void main(String[] args) {
        String sarcasm = "dU eR SøRme gOd TiL aT KoDe";
/*      int length      = Sarcasm.length(27);
        System.out.println(length);*/

        // Capitalize //
        System.out.println(sarcasm);

        String Capital = (sarcasm.substring(0, 1).toUpperCase());
        String lowercase = sarcasm.substring(1, 27).toLowerCase();

        System.out.println(Capital + lowercase);

        // 3caPitalization //
        String duEr = sarcasm.substring(0, 6).toLowerCase();
        String sørme = sarcasm.substring(6, 11).toUpperCase();
        String godTil = sarcasm.substring(11, 27).toLowerCase();

        System.out.println(duEr + sørme + godTil);
    }
}
