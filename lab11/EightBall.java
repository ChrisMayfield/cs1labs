import java.util.Scanner;

/**
 * Simulate a magic 8-ball. Original code by Arch Harris and Nancy Harris.
 * 
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class EightBall {
    
    public static void main(String[] args) {
        Scanner keyboard;    // Input Stream
        String  wantToAsk;   // User input: want to ask a question
        String  questionStr; // User input: the question
        int     answerIndex; // Index value returned by random generator
        String  answerStr;   // The program's answer
        
        keyboard = new Scanner(System.in);
        System.out.printf("Magic 8 Ball\n\n");
        
        // get the first input
        System.out.print("Do you want to ask a question (yes/no)? ");
        wantToAsk = keyboard.nextLine();
        System.out.println();
        if (!wantToAsk.equalsIgnoreCase("Yes")) {
            System.out.print("Goodbye\n");
            return;
        }
        
        // get the second input
        System.out.printf("What is your question?\n");
        questionStr = keyboard.nextLine();
        if (questionStr.length() > 60) {
            System.out.print("Your question is too long. Be more concise."
                                 + "\nGoodbye\n");
            return;
        }
        
        // pick a random answer
        answerIndex = (int) (Math.random() * 20 + 1);
        switch (answerIndex) {
            case 1:
                answerStr = "Signs point to yes.";
                break;
            case 2: 
                answerStr = "Yes.";
                break;
            case 3:
                answerStr = "Reply hazy, try again.";
                break;
            case 4:
                answerStr = "Without a doubt.";
                break;
            case 5:
                answerStr = "My sources say no.";
                break;
            case 6:
                answerStr = "As I see it, yes.";
                break;
            case 7: 
                answerStr = "You may rely on it.";
                break;
            case 8:
                answerStr = "Concentrate and ask again.";
                break;
            case 9:
                answerStr = "Outlook not so good.";
                break;
            case 10:
                answerStr = "It is decidedly so.";
                break;
            case 11:
                answerStr = "Better not tell you now.";
                break;
            case 12:
                answerStr = "Very doubtful.";
                break;
            case 13:
                answerStr = "Yes - definitely.";
                break;
            case 14:
                answerStr = "It is certain.";
                break;
            case 15:
                answerStr = "Cannot predict now.";
                break;
            case 16:
                answerStr = "Most likely.";
                break;
            case 17: 
                answerStr = "Ask again later.";
                break;
            case 18:
                answerStr = "My reply is no.";
                break;
            case 19:
                answerStr = "Outlook good.";
                break;
            case 20:
                answerStr = "Don't count on it.";
                break;
            default:
                answerStr = "HUH?";
                break;
        }
        
        // output the results
        System.out.printf("Question: %s\n", questionStr);
        System.out.printf("  Answer: %s\n", answerStr);
    }
    
}
