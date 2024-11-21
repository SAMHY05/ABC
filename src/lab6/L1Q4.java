/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
public class L1Q4 {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return(a);
                
    }
    public static void main(String[] args) {
        int a1=24,b1=8;
        int a2=200,b2=625;
        
        System.out.println("GCD of "+a1+","+b1+"is "+gcd(a1,b1));
        System.out.println("GCD of "+a2+","+b2+"is "+gcd(a2,b2));
    }
    
}
