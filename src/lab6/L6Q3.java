/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Scanner;
public class L6Q3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]numbers=new int[10];
        
        System.out.println("Please enter 10 integers: ");
        for(int i=0;i<10;i++){
            System.out.print("Enter integer "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        System.out.print("\nOriginal Arrays: ");
        printArray(numbers);
        reverseDigitsInArray(numbers);
        System.out.print("\nArray after reverse in digits: ");
        printArray(numbers);
        sc.close();
    }
    public static void reverseDigitsInArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=reverseNumber(arr[i]);
        }
    }
    public static int reverseNumber(int num){
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return reversed;
        
    }
    public static void printArray(int[]arr){
        for (int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
}
