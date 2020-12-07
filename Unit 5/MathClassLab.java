import java.lang.Math;
/**
 * class MathClassLab runs 4 programs the first is a fair coin toss to see the number of tails, the second is a program that returns
 * the total number of rolls needed to fill a specific dice quota, the third program is a magic * ball response,and the last program
 * is a program to determine the number of participants that should be assigned to each treamtnet in a medical study
 *
 * @Ishika Patel
 * @01/10/2019
 */
public class MathClassLab
// MathLab or MathClassLab? both are stated in the instructions
{
   public int numTails(int flips) {
      // do not need heads for this program
      // the following are local variable
       int tails = 0;
       double toss;
       for (int i = 0; i<=flips; i++) {
           toss = Math.random();
       if (toss>0.50) {
           tails++;
        }
        // .50 for 50-50 chance to get either heads or tails
    }
    return tails;
}
    
    public int countRolls(int diceNumb, int timesNeeded) {
       // the following variable is the number of times the program has rolled the needed number
        int rolls = 0;
        // the following variable is the total number of rolls made
        int count = 0;
        double nextRoll;
        // rohin suggested making the entire program an if-else statement as opposed to the one if statement I originally had
        if (diceNumb<1 || diceNumb>6 || timesNeeded<0) {
            count--;
        }
        else {
        // while loop works best for this situation because we don't know when the program will end specifically
        while (rolls<timesNeeded) {
            nextRoll = (int) (6*Math.random()+ 1);
            if (nextRoll==diceNumb) {
                rolls++;
            }
            count ++;
        }
      
    }
    return count;
}
    
    public String magic8Ball(String response) {
        String saying = "general output";
        double value;
        // equalsIgnoreCase is a boolean String method
        if(response.equalsIgnoreCase("yes")) {
            //the following generates a random number from 1 to 10
            value = (int) (10*Math.random() + 1);
            // the following is what to output given the response is "yes" (nested statment)
                if (value==1) {
                    saying = "Concentrate and Ask Again";
                }
                  if (value==2) {
                    saying = "Don't Count on It";
                }
                  if (value==3) {
                    saying = "It Is Certain";
                }
                  if (value==4) {
                    saying = "Most Likely";
                }
                  if (value==5) {
                    saying = "My Reply is No";
                }
                  if (value==6) {
                    saying = "My Sources Say No";
                }
                  if (value==7) {
                    saying = "No";
                }
                  if (value==8) {
                    saying = "Outlook Good";
                }
                  if (value==9) {
                    saying = "Yes, Definitely";
                }
                  if (value==10) {
                    saying = "You May Rely on It";
                }
                
    }
    else { saying = "Thank you, good bye!"; }
    
    return saying;
}

public String medicalStudy(int totalParticipants) {
//user will input the total number of people participating in the study
// the program will output the number of participants needed to be assined to each treatment
//Treatment 1 is a 100mg shot,Treatment 2 is a 10mg shot, Treatment 3 is the placebo (as named)

int treatment1 = 0;
int treatment2 = 0;
int placebo = 0;
double participantSelection;
for( int i=0; i<totalParticipants;i++) {
    participantSelection = (int) (3*Math.random() + 1);
    if (participantSelection == 1) {
        treatment1++;
    }
    if (participantSelection == 2) {
        treatment2++;
    }
    if (participantSelection == 3) {
        placebo++;
    }
    
}
return "There should be " + treatment1 + " participants given Treatment 1." +
"There should be " + treatment2 + " participants given Treatment 2. " +
"There should be " + placebo + " participants given the placebo.";

}
}