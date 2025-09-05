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
public class ejercisio1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // EXAMEN PRIMER PUNTO
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO PROFESOR");
        System.out.println("Registrate");
        System.out.println("Ingresa tu usuario");
        String User;
        User = sc.nextLine();
        System.out.println("Usuario registrado");
        System.out.println("Ingresa tu contraseña");
        String Pass;
        Pass = sc.nextLine();
        System.out.println("Contraseña registrada");
            
      // Boll
         Boolean Acceso = false;
        for(int i = 1; i <= 3; i++) {
        System.out.println("Ingresa tu usuario");
        String UserLog = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        String PassLog = sc.nextLine();
        
        if (UserLog.equals(User) && PassLog.equals (Pass)){
            System.out.println("Benvenido profesor");
            Acceso = true ;
            break;
            }
            else 
             {
            System.out.println("DATOS INVALIDOS");
            }
            if(!Acceso){
            System.out.println("Haz intentado muchas veces, ingresa mas tarde");
            sc.close();
            }
         
         
     
    }
    }
}

