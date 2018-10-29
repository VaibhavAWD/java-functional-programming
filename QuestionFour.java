/**
 * Assume you have access to two boolean variables, isSnowing, and isRaining, and one
 * double variable, temperature. isSnowing is true when it’s snowing and false otherwise,
 * isRaining is true when it’s raining and false otherwise, and temperature gives the outdoor
 * temperature in degrees Fahrenheit. Write code that prints “Let’s stay home.” if it’s raining,
 * snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints “Let’s go out!”
 * otherwise.
 */
public class QuestionFour {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        
        if (isSnowing || isRaining || temperature < 50) {
            // This would be the correct answer
            System.out.println("Let’s stay home."); // This is the correct answer
        } else {
            System.out.println("Let's go out!");
        }
    }
}