/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
public class T6Q1c {
    public static long factorial(int n){
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static long combination(int n,int k){
        if(k>n){
            return 0;
        }
        if(k==0||k==n){
            return 1;
        }
        long numerator=factorial(n);
        long denominator=factorial(k)*factorial(n-k);
        return numerator/denominator;
    }
    public static void main(String[] args) {
        System.out.println("C(5,2)"+"="+combination(5,2));
    }
    
}
