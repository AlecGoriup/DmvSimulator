import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {

        int max = 200;
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

            if (count == 200) {
                count = 1;
                wrapAround = false;
            } else {
                count++;
            }

        }

        System.out.println("You do not have the required paperwork");

    }
}