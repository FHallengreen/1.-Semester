package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner input = new Scanner(System.in);

  public void findLargestNumber(int[] numbers, int largestNumber) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter next number: ");
      numbers[i] = input.nextInt();
      if (numbers[i] > largestNumber) {
        largestNumber = numbers[i];
      }
    }
    System.out.println("Det største tal er: "+ largestNumber);
  }

  public void findSmallestNumber(int[] numbers, int smallestNumber) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter next number: ");
      numbers[i] = input.nextInt();
      if (numbers[i] < smallestNumber) {
        smallestNumber = numbers[i];
      }
    }
    System.out.println("Det mindste tal er: "+ smallestNumber);
  }

  public static void main(String[] args) {

    int[] numbers;
    numbers = new int[8];
    int largestNumber = numbers[0];
    int smallestNumber = numbers[0];
    Main obj = new Main();
    obj.findLargestNumber(numbers, largestNumber);
    obj.findSmallestNumber(numbers,smallestNumber);
  }

}