package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  public static String triangulo(int a, int b, int c) {


    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    
    if ((a * a) + (b * b) == (c * c)) {
    return "es un triangulo Pitagorico";
    }
    if (a == b && a == c && b == c) {
      return "es un triangulo Equilatero";
    }
    if (a == b || a == c || b == c) {
      return "es un triangulo Isoceles";
    }
    
    if (a != b || a!= c || b != c){
     return "Es un triangulo Escaleno"; 
    }
      
    
    return "ERROR, no es un triangulo";
  }

  
  public static void main(String[] args) {
    System.out.println("Hello mundo! - modificado cvo");
  }
}
