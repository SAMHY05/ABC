/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Random;
public class T6Q1f {
    public static void main(String[] args) {
    int randomNumbers[]=new int[10];
       randnum(randomNumbers);
        System.out.println("Generated random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
      
    
    public static void randnum(int[] num){
        Random r=new Random();
        for(int i=0;i<10;i++){
            num[i]=r.nextInt(101);
        }
    }
    
    
}
