/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Machine
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first, second;

        System.out.println("Enter first number:");
        first = input.nextInt();
        System.out.println("Enter second number:");
        second = input.nextInt();

        System.out.print("Add : ");
        System.out.println(first + second);
        System.out.print("Sub : ");
        System.out.println(first - second);
        System.out.print("Mul : ");
        System.out.println(first * second);
        System.out.print("Div : ");
        System.out.println(first / second);

    }

}
