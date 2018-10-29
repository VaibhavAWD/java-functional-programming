/**
 * Q.1 What will the following bock of Java code print?
 */
public class QuestionOne {
    public static void main(String[] args) {
        double balance = 0;
        balance = balance + 20; // balance = 20
        balance = balance - 25; // balance = -5
        balance = balance + 30; // balance = 25
        balance = balance -25; // balance = 0
        
        if (balance < 0) {
            System.out.println("We're in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            // This would be the anser
            System.out.println("We broke even."); // This is the correct answer
        }
    }
}