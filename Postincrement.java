/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.postincrement;

/**
 *
 * @author fletc
 */
public class Postincrement {

    public static void main(String[] args) {
        
        int a=5, b=8;
      //System.out.println(a++); //postincrement
     // increase the value after execution 
     //System.out.println(a);
     
    // c= ++a + b -a;
         System.out.println("a++ +b - a is"+(a++ +b-a));
         System.out.println("value of a is "+a);
         //System.out.println("value of c is "+c);
         //System.out.println(++a);
//preincrement
       //Increase the value first before execution 
       boolean c;
       
       c= (a > (b*a));
       System.out.println("result is "+ c);
    }
}
