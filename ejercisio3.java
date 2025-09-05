/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Sala 101
 */


public class ejercisio3 {
  public static boolean esPerfecto(int n) {
    int sumaDivisores = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sumaDivisores += i;
      }
    }
    return sumaDivisores == n;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int n = scanner.nextInt();
    scanner.close();

    if (esPerfecto(n)) {
      System.out.println(n + " es un número perfecto.");
    } else {
      System.out.println(n + " no es un número perfecto.");
    }
  }
}

