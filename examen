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

public class ejercisio5  {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int suma = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese un número entero: ");
      int numero = scanner.nextInt();
      suma += numero;

      if (numero > mayor) {
        mayor = numero;
      }

      if (numero < menor) {
        menor = numero;
      }
    }

    scanner.close();
    double promedio = (double) suma / 5;

    System.out.println("Mayor: " + mayor);
    System.out.println("Menor: " + menor);
    System.out.println("Promedio: " + promedio);
  }
}
    

