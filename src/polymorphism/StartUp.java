/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author nstokesbeamon
 */
public class StartUp {
    public static void main(String[] args){
        Object[] shapes = new Object[3];
            shapes[0] = new Circle();
            shapes[1] = new Rectangle();
            shapes[2] = new Square();
            
            for(int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Circle) {
                ((Circle)shapes[i]).color();
            } else if(shapes[i] instanceof Rectangle) {
                ((Rectangle)shapes[i]).color();
            }else if(shapes[i] instanceof Square) {
                ((Square)shapes[i]).color();
            }
            }
    }
    }

