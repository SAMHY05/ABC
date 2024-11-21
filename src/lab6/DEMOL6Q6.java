/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author NITRO_5
 */
import java.util.Scanner;
import java.util.Random;
public class DEMOL6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ans = 0, score = 0;

        // Start the game loop
        while (true) {
            // Generate random numbers between 0 and 12
            int randnum1 = r.nextInt(13);  // Generates a number between 0 and 12
            int randnum2 = r.nextInt(13);  // Generates a number between 0 and 12

            // Display the multiplication question
            System.out.print(randnum1 + " x " + randnum2 + " = ");
            ans = sc.nextInt();

            // Exit condition: if the user enters a negative number, quit the game
            if (ans < 0) {
                break;
            }

            // Check if the answer is correct
            if (multiplication(randnum1, randnum2, ans)) {
                score++;  // Increment score for a correct answer
                System.out.println("Correct! Your score is: " + score);
            } else {
                break;
            }
        }

        // Final score when the user quits
        System.out.println("Game over! Your final score is: " + score);
    }

    // Method to check if the multiplication is correct
    public static boolean multiplication(int a, int b, int c) {
        return c == (a * b);  // Return true if correct, false if not
    }
}

    
}
