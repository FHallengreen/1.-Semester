package com.company;

public class Main {

  public static void main(String[] args) {
    String name1 = "Harry";
    String name2 = "Ron";
    String name3 = "Hermione";

    // The java.lang.String.codePointAt() method returns the character (Unicode code point) at the specified index.
    // The index refers to char values (Unicode code units) and ranges from 0 to length() - 1.

    String name1CP = name1.substring(0, 2);
    int name1CP_F = name1.codePointAt(0);
    int name1CP_S = name1.codePointAt(1);

    System.out.printf("De første 2 code points for %s er %04x og %04x \n", name1, name1CP_F, name1CP_S);

    String name2CP = name2.substring(0, 2);
    int name2CP_F = name2.codePointAt(0);
    int name2CP_S = name2.codePointAt(1);

    System.out.printf("De første 2 code points for %s er %04x og %04x \n", name2, name2CP_F, name2CP_S);

    String name3CP = name3.substring(0, 2);
    int name3CP_F = name3.codePointAt(0);
    int name3CP_S = name3.codePointAt(1);

    System.out.printf("De første 2 code points for %s er %04x og %04x \n", name3, name3CP_F, name3CP_S);
  }
}
