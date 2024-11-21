/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;
public class T6Q1e {
    public static void countLettersAndDigits(String str){
        int letterCount=0;
        int digitCount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                letterCount++;
            }else if(Character.isDigit(c)){
                digitCount++;
            }
        }
    
        System.out.println("Number of letter: "+letterCount);
        System.out.println("Number of digit: "+digitCount);
    }
    
         
    public static void main(String[] args) {
         String testString="HelloWorld12345";
         countLettersAndDigits(testString);
    }
    
}
