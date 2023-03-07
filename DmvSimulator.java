import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {

        int max = 100;
        int min = 1;
        int range = max - min + 1;

        System.out.println("Welcome to the DMV.");
        int numberGiven = (int) (Math.random() * range) + min;
        System.out.println("Here is your number: " + numberGiven + ". Please wait until your number is called.");

        int startNext = numberGiven + 1;
        int count = startNext;
        boolean wrapAround = true;

        while (count != numberGiven + 1 || wrapAround) {
            System.out.println("Number: " + count + "!");

            if (count == 100) {
                count = 1;
                wrapAround = false;
            } else {
                count++;
            }

        }

        int allGood = (int) (Math.random() * (100 - 1 + 1)) + 1;

        if (allGood == 1) {
            System.out.println("You have all the required paperwork! You're all set!");
        }

        else {
            System.out.println("You need to bring the correct paperwork. We can't help you.");
        }

    }
}