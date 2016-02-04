/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author nstokesbeamon
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diet d = new Diet();
        
        System.out.print("So you want to lose weight then follow this week long diet!! \n");
        d.start(10);
    }
    
}
