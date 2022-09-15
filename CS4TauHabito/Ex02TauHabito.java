/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01TauHabito;
import java.util.Scanner;

/**
 *
 * @author carlahabito
 */
public class Ex02TauHabito {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int totalGuesses = 5;
        int limit = 10;
        boolean playing = true;
    
        while (playing == true) {
            System.out.println(playing);
            
    System.out.println("\n===============");
    System.out.println("[1] Start game");
    System.out.println("[2] Settings");
    System.out.println("[3] End game");
    System.out.println("===============");
    System.out.print("OPTION: ");
    int choice = sc.nextInt();
    
    switch (choice) {
        case 1:
            int answer = (int) Math.floor(Math.random()*limit) + 1;
            int guesses = 0;
            System.out.printf("ans: %s \n", answer);
            System.out.printf("limit: %s \n",limit);
            System.out.printf("guesses: %s \n", totalGuesses);
            
            while (guesses < totalGuesses) {
            
            System.out.printf("\n%s of %s guesses. \n", guesses, totalGuesses);
            System.out.print("Guess number: ");
            int user = sc.nextInt();
            
            if (user > answer) {
                System.out.println("\n Guess lower!");
                guesses = guesses + 1;
            }
            else if (user < answer) {
                System.out.println("\n Guess higher! ");
                guesses = guesses + 1;
            }
            else if (user == answer) {
                break;
            }
        }
            if (guesses == totalGuesses) {
                System.out.println("You lost..");
            }
            else if (guesses < totalGuesses) {
                System.out.println("\nYou guessed the number correctly!");
            }
            
            System.out.printf("The number was %s! \n", answer);
            break;
        
        case 2:
            System.out.print("Enter highest limit for number: ");
            limit = sc.nextInt();
            
            System.out.print("Enter highest number of guesses: ");
            totalGuesses = sc.nextInt();
            break;
        
        case 3:
            System.out.println("Thank you for playing.");
            playing = false;
            break;
    
        }
    
    }
        
        }
}
