/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
public class T6Q2 {
    public static void main(String[] args) {
        Descending(9,8,10);
    }
    public static void Descending(int a,int b,int c){
        int[]num=new int[3];
        num[0]=a;
        num[1]=b;
        num[2]=c;
        
        for(int pass=1;pass<=3;pass++){
            for(int i=0;i<2;i++){
                if(num[i]<num[i+1]){
                    int hold=num[i];
                    num[i]=num[i+1];
                    num[i+1]=hold;
                }
            }
    }
        System.out.println("Array in descending order: ");
        for(int i=0;i<2;i++){
            System.out.print(num[i]+",");
        }
        System.out.println(num[2]);
    }
    
}
