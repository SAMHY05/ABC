/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Random;
public class T6Q1h {
    public static int generateFirstDuplicate(){
       Random r=new Random();
       int []generateNumbers=new int[11];
       while(true){
        int num=r.nextInt(11);
        if(generateNumbers[num]==1){
            return num;
        }
        generateNumbers[num]=1;
       }
       
    }
    public static void main(String[] args) {
        int firstDuplicateNumbers=generateFirstDuplicate();
        System.out.println("The first duplicate random numbers is "+firstDuplicateNumbers);
    }
        
    }
    

