/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii_code;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Ascii_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter your word");
            Scanner input =new Scanner(System.in) ;
            
       char ascii ;
       ascii= input.next().charAt(0);
       System.out.println((int)ascii);
      
    }
    
}
