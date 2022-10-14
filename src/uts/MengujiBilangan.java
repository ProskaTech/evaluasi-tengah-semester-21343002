/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import javax.swing.JOptionPane;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class MengujiBilangan {
    public static void main(String[] args) {
      String bil;
      int Angka ;  
      
        bil = JOptionPane.showInputDialog("Masukan Bilangan : ");
        
        Angka = Integer.parseInt(bil);
        
        if(Angka >= 0){
            JOptionPane.showMessageDialog(null,"Angka " +Angka+  " \nMerupakan Bilangan Positif");
        }
        else{
            JOptionPane.showMessageDialog(null,"Angka " +Angka+ " \nMerupakan Bilangan Negatif ");
        }               
}
}
