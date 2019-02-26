
package pintartablero;
import java.util.Scanner;

public class PintarTablero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas columnas quieres pintar?");
        int c = scanner.nextInt();
        System.out.println("Cuantas filas quieres pintar?");
        int f = scanner.nextInt();
        printTab(c,f);     
    }
    public static void printTab(int c , int f){
        for ( int  a = 1; a <= c ; a++) {
            for ( int  b = 1; b <= f ; b++) {
                if (a % 2 == 0 );
                 System.out.print("#");
                if (a % 2 != 0 );
                 System.out.print("-");
            }
            System.out.println();
        }   
    } 
  
}
