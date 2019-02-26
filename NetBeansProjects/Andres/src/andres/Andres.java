
package andres;


import java.util.Scanner;
        
public class Andres {


    public static void main(String[] args) {
        System.out.println("Hola Andres");
        System.out.println("Escribe el nombre del amor de tu vida");
        
        Scanner scanner = new Scanner(System.in);
        
        String zorra = scanner.next();
        String a = "eliana";
        
        if (zorra == null ? a == null : zorra.equals(a)){
            System.out.println("Muy bien");
        }
        
            if (zorra != a){
            System.out.println("Zorra");
            System.out.println("Otra oportunidad.. piensalo bien");
            String zorra2 = scanner.next();
            if (zorra2 == null ? a == null : zorra2.equals(a)){
            System.out.println("Muy bien");
        }
            else{
             if (zorra != a){
             System.out.println("Zorraaaaaaaaaaaaaaaaaaaaaa");
        }
              
               
    }
    
}
}
