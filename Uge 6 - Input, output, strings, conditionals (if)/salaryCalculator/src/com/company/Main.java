package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

  public static void main(String[] args) {
    Scanner salaryScanner = (new Scanner(in));
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String input = "nej";
    int salary;
    int workingHours;
    double grossSalary;

    do {
      System.out.println("Hvad er din timeløn?");
      salary = salaryScanner.nextInt();
      System.out.println("Hvor mange timer arbejder du?");
      workingHours = salaryScanner.nextInt();

      System.out.printf("Du har indtastet du får %s kr. i timen og arbejder %s timer om ugen, er dette korrekt? (ja/nej) \n", salary, workingHours);
      Scanner in = (new Scanner(System.in));
      input = in.nextLine().toLowerCase(Locale.ROOT);
    }
    while (input.equalsIgnoreCase("nej"));

    // En normal arbejdsuge er på 37 timer, så hvis man har arbejdet mere end 37 timer, modtager man tillæg på 1.5 * den normale timeløn.
    if (workingHours > 37) {
      int overtime = workingHours - 37;
      double overtimeFee = overtime * 1.5;
      grossSalary = (salary * workingHours) + overtimeFee;
    } else {
      grossSalary = (salary * workingHours);
    }

    System.out.printf("Bruttoløn: %44s \n", fmt.format(grossSalary));

    double amBidrag = 0.08;
    double calAmBidrag = amBidrag * grossSalary;
    double personFradrag = 896;
    double aSkat = 0.37;
    double calASkat = (aSkat * (grossSalary - calAmBidrag - personFradrag));
    double netSalary = (grossSalary - calAmBidrag - calASkat);
    System.out.printf("Arbejdsmarkedsbidrag der skal betales er: %13s \nPersondraget lyder på: %32s \n" +
            "A-skat lyder på: %38s \n\nDu får følgende udbetalt i nettoløn: %18s"
        , fmt.format(calAmBidrag), fmt.format(personFradrag), fmt.format(calASkat), fmt.format(netSalary));


  }
}

