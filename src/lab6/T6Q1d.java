/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
public class T6Q1d {
    public static boolean pentagonalNum(int num){
        for (int i=1;i<=num;i++){
            int penta=(i*(3*i-1))/2;
            if (penta==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is 1 a pentagonal number? " + pentagonalNum(1));  
        System.out.println("Is 5 a pentagonal number? " + pentagonalNum(5));  
        System.out.println("Is 12 a pentagonal number? " + pentagonalNum(12)); 
        System.out.println("Is 22 a pentagonal number? " + pentagonalNum(22)); 
        System.out.println("Is 35 a pentagonal number? " + pentagonalNum(35)); 
    
    }
    
}
