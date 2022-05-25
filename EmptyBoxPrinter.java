
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafea8846
 */
public class EmptyBoxPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int boxSizeInt = input.nextInt();
        //as long as boxSizeInt is between 1 and 10 execute
        if (boxSizeInt <= 10 && boxSizeInt >= 1) {

            //print top of box
            for (int i = 0; i < boxSizeInt; i++) {
                System.out.print("*");
            }

            //move to new line
            System.out.println("");

            //print box walls
            for (int i = 0; i < boxSizeInt - 2; i++) {
                System.out.print("*");
                //prints spaces between walls
                for (int j = 0; j < boxSizeInt - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //print Bottom of box
            for (int i = 0; i < boxSizeInt; i++) {
                System.out.print("*");
            }

        } else {
            System.out.println("Please try again");
        }
    }

}
