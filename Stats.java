import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

// This is the main class of the program and will contain the main method
public class Stats {
    public static int min = 0;
    public static int max = 0;
    public static double avg = 0;

    public static void main(final String[] args) {
        ArrayList<Integer> nums = prompt(); //Get numbers from the user
        Thread worker1 = new Thread(new Average(nums)); //Declare new thread to find average
        Thread worker2 = new Thread(new Maximum(nums)); //Declare new theread to find the Maximum
        Thread worker3 = new Thread(new Minimum(nums)); //Declare new theread to find the Minimum
        worker1.start();
        worker2.start();
        worker3.start();
        
        //Wait for threads to finish
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The average value is "+avg);
        System.out.println("The maximum value is "+max);
        System.out.println("The minimum value is "+min);
    }

    // This method will prompt the user for input and recive a line of intergers
    public static ArrayList prompt() {

        Scanner in = new Scanner(System.in);  // init Scanner to be used for reading user input
        
        System.out.println("Please enter a line of intergers sepperated by spaces.");// Prompt the user for input
        System.out.print(">");// Prompt the user for input

        ArrayList<Integer> nums = new ArrayList<Integer>(); //Create a new array list object
        String input = in.nextLine();    // get the entire line after the prompt 
        String[] numbers = input.split(" "); // split by spaces
        
        //loop through array to convert strings too ints
        for(int i = 0; i<= numbers.length-1; i++){
            nums.add(i, Integer.parseInt(numbers[i]));
        }

        in.close(); //close the scanner to avoid memory leaks 
        return nums; // Return ArrayList
    }

}
