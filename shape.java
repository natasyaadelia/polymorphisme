/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;
public class shape {
    // private member variable
    private String color;
    // constructor
    public shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "shape[color=" + color + "]";
    }
    // All shapes must have a method called getArea()
    public double getArea(){
        // we need to return some value to compile the progam
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
