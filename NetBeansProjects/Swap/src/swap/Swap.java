
package swap;

import java.util.Scanner;


public class Swap {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero?");
        int a = scanner.nextInt();
        System.out.println("Dime otro numero?");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
      
            System.out.println( a + "-" + b);
            System.out.println( a );
          
    }
}
        