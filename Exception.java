/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lydia
 */
public class Exception {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        try{
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            System.out.println("The quotient is " + (num1 / num2));
        }catch(InputMismatchException e){
            System.out.println("Error: Incorrect input.");
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero");
        }finally{
            System.out.println("Operation done.");
        }
    }
}
