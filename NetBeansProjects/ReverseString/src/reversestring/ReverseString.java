/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author esoli
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String a = scanner.nextLine();
        
        
        for(int i = a.length() - 1; i >= 0 ; i--){
            System.out.print(a.charAt(i));
                           
        }
        System.out.print(a.length());
    }
    
}
//