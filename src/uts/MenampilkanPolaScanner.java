/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class MenampilkanPolaScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Masukan Jumlah Baris : ");
        int a = in.nextInt();
        
        for (int j = 1; j <= a; j++) {
            for (int k = 1; k < j; k++)
            {
                System.out.print(" ");
            }
            for (int l = j; l<= a; l++)
            {
                System.out.print("# ");
            }
            System.out.println(" ");
        }
        for (int j = a; j >= 1; j--) {
            for (int k = 1; k < j; k++)
            {
                System.out.print(" ");
            }
            for (int l = j; l<= a; l++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
