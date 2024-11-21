/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Scanner;
import java.util.Random;
public class L6Q5 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int ans=0,score=0;
        while (true){
         int randnum1=r.nextInt(13);
         int randnum2=r.nextInt(13);
        
         System.out.println("Enter negative number to quit. ");
         System.out.print(randnum1+"x"+randnum2+"=");
         ans=sc.nextInt();
         if(ans<0){
             break;
         }
        
        if(multiplication(randnum1,randnum2,ans)){
            score++;
             
        }

    }
        System.out.print("Your score is "+score);
    }
    public static boolean multiplication(int a,int b, int c){
        return c==(a*b);
          
    }
}
    

