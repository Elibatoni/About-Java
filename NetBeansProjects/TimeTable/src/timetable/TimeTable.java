package timetable;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Juguemos");
        System.out.println("Cuantas filas y columnas quieres multiplicar?");
        int a = scanner.nextInt();

        System.out.println("");

        imprimirtabla(a);
    }

    public static void imprimirtabla(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {
                int c = i * j;

                System.out.print(c + "|" );

            }
            System.out.println();
        }

        System.out.println();

    }

}
