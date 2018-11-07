/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_02_string;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_02_string {

    
    public static void main(String[] args) {
      String s ="indul a görög aludni.";
        char menuPont;
        do {
            menuPont=menu();
            switch(menuPont){
                case 'a':System.out.println(s.toUpperCase());break;
                case 'b':System.out.println(s.toLowerCase());break;
                case 'c':System.out.println(s.length());break;
                case 'd':System.out.println(s.equals("sajt")); break;
                case 'e':System.out.println(s.substring(3, 6)); break;
                case 'f':break;
                default: System.out.println("Helytelen menüpont!");break;
            }
        } while (menuPont !='f');
        
    }
   public static char menu(){
   Scanner sc = new Scanner(System.in);
       System.out.println(
               "a - Nagybetüsse alakít\n"+
               "b - kisbetüssé alakít\n"+
               "c - lekérdezni a hosszát\n"+
               "d - összehasonlítani egy másik stringel(string2 bekérése)\n"+
               "e - egy részét kiiratni a stringnek (a, b intervallum bekérése)\n"+
               "f - kilépni\n\n"+
               "kérem válaszzon menü pontot:"
       );
       char m = sc.nextLine().charAt(0);
       
       return m;
   } 
    
}
