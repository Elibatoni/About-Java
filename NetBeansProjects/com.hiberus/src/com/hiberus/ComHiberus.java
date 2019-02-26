/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiberus;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author esolis
 */
public class ComHiberus {

    public static int[] readIntsFromFile(String path) {
        try {
            int[] ints = Files.lines(Paths.get(path))
                    .mapToInt(Integer::parseInt).toArray();

            return ints;
        } catch (IOException e) {
            return null;
        }
    }

    public static String[] readStringsFromFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return strings.toArray(new String[strings.size()]);
        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] scores = readIntsFromFile("./scores.txt");
        String[] names = readStringsFromFile("./name.txt");

        /*for (int i = 0; i < scores.length; i++) {
        System.out.println("Score: " + scores[i]);
        System.out.println("Name: " + names[i]);
        }*/
        int puntuacionM = 0;
        int ppM = 0;
        for (int i = 0; i < scores.length; i++) {
            if (puntuacionM < scores[i]) {
                ppM = i;
                puntuacionM = scores[i];
            }
        }
            System.out.println("El jugador con la puntuación más alta es " + names[ppM]);
            /*for (int i = 0; i > scores.length; i++) {
            if (puntuacionM > scores[i]) {
                ppM = i;
                puntuacionM = scores[i];
            }
        }
           System.out.println("El jugador con la puntuación más baja es " + names[ppM]); */
          int suma = 0;
          for (int i = 0; i < scores.length; i++) { 
          suma = suma + scores[i];
          }
          int mediaresul = suma / scores.length;
          System.out.println("El promedio de las puntuaciones es " + mediaresul);
    }
}
