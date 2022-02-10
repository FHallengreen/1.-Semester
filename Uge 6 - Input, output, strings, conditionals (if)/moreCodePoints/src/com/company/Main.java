package com.company;

import java.util.stream.IntStream;

public class Main {

  private static IntStream IntStream;

  public static void main(String[] args) {
    String name1 = "Frederik";

    final int name1_lengthtotal = name1.substring(0).length();

    final int length = name1.length();

    System.out.println("Navnet er " + name1_lengthtotal + " bogstaver langt");

    int name1CP_0 = name1.codePointAt(0);
    int name1CP_1 = name1.codePointAt(1);
    int name1CP_2 = name1.codePointAt(2);
    int name1CP_3 = name1.codePointAt(3);
    int name1CP_4 = name1.codePointAt(4);

    System.out.printf("De %s codepoints for %s er %04x, %04x, %04x, %04x & %04x \n \n", name1_lengthtotal, name1, name1CP_0, name1CP_1, name1CP_2, name1CP_3, name1CP_4);

    // VERSION 2 - LOOP til flere navne.

    for (int offset = 0; offset < name1_lengthtotal; ) {
      final int codepoint = name1.codePointAt(offset);
      if (codepoint < 96) {
        System.out.printf("%04x ,", codepoint);
      } else {
        System.out.printf("%04x, ", codepoint);
      }
      offset += Character.charCount(codepoint);
    }

    // DEN AVANCERET UDGAVE MED BRUG AF Int Stream:

    IntStream = name1.codePoints();

    System.out.print("\nCode point værdierne for " + name1 + " er:");

    IntStream.forEach(value -> System.out.printf(" %04x,", value));
  }
}
