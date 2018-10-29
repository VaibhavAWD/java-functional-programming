/**
 * Find the error in this Java code. (Hint: think about scope!)
 * Imagine that the variables rewinding and playbackPosition could have different values
 * depending on the situation.
 */
public class QuestionSeven {
    public static void main(String[] args) {
        double playbackPosition = 120;
        boolean rewinding = true;
        
        if (rewinding) {
            double rewindAmount = 0.1;
        }
        // This line of code may have error as there is no such variable called rewindAmount
        // It is available only in if statement above
        playbackPosition = playbackPosition - rewindAmount; // This is the correct answer
    }
}