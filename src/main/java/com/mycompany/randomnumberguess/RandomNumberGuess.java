/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberguess;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class RandomNumberGuess {

    public static void main(String[] args) {
        Random obj=new Random (); // instance of Random
        
        int SecretNumber=obj.nextInt(100)+1;
        int UserGuess=0;
        int tries=0;
        int MaxAttempt=3;
        
        while (UserGuess != SecretNumber && tries<3){
            UserGuess= Integer.parseInt(JOptionPane.showInputDialog("Hey Guess anumber between 1 and 100"));
            tries++;
            
            if(UserGuess>SecretNumber){
                JOptionPane.showMessageDialog(null,"Your guess is too high");
            }else if ( UserGuess<SecretNumber){
                JOptionPane.showMessageDialog(null,"Your guess is too low ");
            }else{
                JOptionPane.showMessageDialog(null,"Congrats!You have guessed correctly on try number:"+tries);
            }
        }
          if(UserGuess!=SecretNumber){
              JOptionPane.showMessageDialog(null ,"Sorry you've used your maximum tries, the secretnumber was: " +SecretNumber);
          }
    }
}
