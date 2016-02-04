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
public class Diet {
    private int pounds;
    
    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        if(pounds <= 0 || pounds > 15) {
            throw new IllegalArgumentException("pounds must be greater than 0...");
            //System.exit(1);
        }
        this.pounds = pounds;
    }
    
    public void start(int pounds){
        this.setPounds(pounds);
        this.monday();
        this.tuesday();
        this.wednesday();
        this.thursday();
        this.friday();
        this.saturday();
        this.sunday();
        this.done();
    }
    
    private void monday() {
        System.out.println("Monday: Avoid carbs");
    }

    private void tuesday() {
        System.out.println("Tuesday: No more than 2000 for the day");
    }

    private void wednesday() {
        System.out.println("Wednesday: Avoid carbs and eat lots of protein");
    }

    private void thursday() {
        System.out.println("Thursday: Drink lots of water");
    }
    private void friday() {
        System.out.println("Friday: Eat lots of veggies");
    }
    private void saturday() {
        System.out.println("Saturday: Drink lots of water and exercise!!");
    }
    private void sunday() {
        System.out.println("Sunday: You can do it almost there");
    }
    private void done() {
        System.out.println("Diet Complete You should have lose " + getPounds() + " pounds");
    }
    
}
