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
public class Formula {
    
    private int num1;
    private int num2;
    
    public Formula(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int add(){
        return this.num1 + this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public int div(){
        return this.num1 / this.num2;
    }
    
}
