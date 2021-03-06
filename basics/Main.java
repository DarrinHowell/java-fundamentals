import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.now;

public class Main {
    public static void main(String[] args){
        //invoke pluralize
        String testPlural = pluralize("test", 1);
        System.out.println(testPlural);

        //invoke flipHeads
        flipHeads(3);

        //invoke clock
        clock();
    }

    // method takes in a string and an int and pluralizes that string
    // if the int is 0 or greater than 1
    public static String pluralize(String noun, int numNouns){
        // if numNouns == 0 OR numNouns > 1, then add an "s" to noun
        if(numNouns == 0 || numNouns > 1){
            noun += "s";
        }

        return noun;
    }


    // uses a random number generator to flip a coin.
    // prints the result of the coin flip after each flip.
    // prints the number of flips that it takes to get n head coin flips in a row
    public static void flipHeads(int n){
        // while numHeads is less than n, continue flipping
        // increment a numflips variable with each flip
        // increment numHeads every time rand >= 0.5
        boolean runComplete = false;
        int[] headsArr = new int[n];
        int i = 0;
        int numFlips = 0;

        // keep flipping until you get three in a row
        while(runComplete == false){
            String result;

            // generate random number between 0 and 1
            double flip = Math.random();

            if(flip >= 0.5) {
                result = "heads";
                headsArr[i] = 1;
                i++;

                // check to see if you have n in a row
                int sum = 0;
                for(int k = 0; k < headsArr.length; k++){
                    sum += headsArr[k];
                }
                if(sum == n){
                    runComplete = true;
                }

            } else {
                result = "tails";

                // reset our heads array and our i var if we get a tails
                i = 0;
                for(int j = 0; j < headsArr.length; j++){
                    headsArr[j] = 0;
                }
            }

            // print out each result after every flip
            System.out.println(result);
            numFlips++;
        }

        // after n heads in a row have been flipped, print a completion message.
        System.out.println("It took " + numFlips + " flips to get " + n + " heads in a row.");
    }


    // prints the time of the clock second by second using the LocalDateTime object
    public static void clock(){
        LocalDateTime currentTime = now();
        boolean boolTest = true;

        while(boolTest){
            LocalDateTime timeCheck = now();

            // if the previous current time is one second greater than the time
            // that was just checked, print it
            if(timeCheck.getSecond() == currentTime.getSecond()+1 || (currentTime.getSecond() == 59 && timeCheck.getSecond() == 0)){

                String time = timeCheck.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    // attribution: Michelle Ferreirae provided formatting statement via Code Fellows Lab Docs

                System.out.println(time);

                // reset the current time to the time that was just checked
                currentTime = timeCheck;
            }
        }
    }
}
