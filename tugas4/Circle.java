/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class Circle implements GeometricObject {


    /**
     * @param args the command line arguments
     */

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea(){
       return Math.PI * radius * radius;  
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
    return "\nRadius lingkaran: "+this.radius+
           "\nLuas: "+this.getArea()+
           "\nkeliling: "+this.getPerimeter();
    }
}