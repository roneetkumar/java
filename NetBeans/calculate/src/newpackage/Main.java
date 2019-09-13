/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Machine
 */
public class Main {
    
    public static void main(String [] args){   
        Formula oper1 = new Formula(5,10);
        Formula oper2 = new Formula(22,55);
        
        System.out.println(oper1.add());
        System.out.println(oper1.mul());
        
        System.out.println(oper2.add());
        System.out.println(oper2.sub());

    }
    
}
