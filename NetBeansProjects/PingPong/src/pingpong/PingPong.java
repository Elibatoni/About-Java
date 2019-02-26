
    package pingpong;

import java.util.Scanner;
public class PingPong {


    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("juguemos al ping pong");
        System.out.println("Escribe un numero");
        
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
         
        for( int a = 0; a<=numero; a++) {
            
            if ( a % 5  == 0 && a % 10 != 0 && a !=0  )  {
                System.out.println("ping");
            }
            if( a % 10  == 0 && a !=0  )  {
                System.out.println("pong");
            }
            else {
               System.out.println(a); 
            }
        }
    }
}
    
}
