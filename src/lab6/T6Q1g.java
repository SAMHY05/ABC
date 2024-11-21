/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
import java.util.Scanner;
public class T6Q1g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double[]result=circleProperties(radius);
        System.out.printf("The area of the circle is %.2f ",result[0]);
        System.out.printf("\nThe circumference of the circle is %.2f ",result[1]);
    }
    public static double[]circleProperties(double radius){
        double[]result=new double[2];
        
        double area=Math.PI*Math.pow(radius,2);
        double circumference=2*Math.PI*radius;
        
        result[0]=area;
        result[1]=circumference;
        
        return result;
    }
        
        
    
    
    
}
