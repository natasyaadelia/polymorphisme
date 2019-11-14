/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;
public class main {
    public static void main(String[] args) {
        rect p = new rect(1,1,4,4);
        int a = p.x1;
        int b = p.y1;
        int c = p.x2;
        int d = p.y2;
        rect y = new rect (5,6);
        p.move(1,2);
        System.out.println("<"+p.x1+","+p.y1+"> is inside the union");
        System.out.println("["+a+","+b+"; "+c+", "+d+"] union ["+p.x1+","+p.y1+"; "+y.x2+","+y.y2+"] = ["+a+","+b+"; "+y.x2+","+y.y2+"]");
        System.out.println("["+a+","+b+"; "+c+", "+d+"] union ["+p.x1+","+p.y1+"; "+y.x2+","+y.y2+"] = ["+p.x1+","+p.y1+"; "+c+","+d+"]");
    }
}
