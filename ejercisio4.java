/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Sala 101
 */

    import java.util.Scanner;

public class ejercisio4 {
  public static long calcularFactorial(int n) {
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int n = scanner.nextInt();
    scanner.close();

    if (n < 0) {
      System.out.println("El factorial no está definido para números negativos.");
    } else {
      long factorial = calcularFactorial(n);
      System.out.println(n + "! = " + factorial);
    }
  }
}
    

