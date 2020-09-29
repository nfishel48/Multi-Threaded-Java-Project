import java.util.Scanner;
import java.util.ArrayList;


//This class will extend the thread class so that 
//multithreading can be implemented in this program.
//Parts of this class are borrowed from https://www.geeksforgeeks.org/multithreading-in-java/
class Worker extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");

        } catch (final Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// This is the main class of the program and will contain the main method
public class Stats {
    public static int min = 0;
    public static int max = 0;
    public static double avg = 0;

    public static void main(final String[] args) {
        ArrayList<Integer> nums = prompt();
       
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

    //This method will be used to find the average of the array
    public static void average(ArrayList nums){
        double x = 0;
        for(int i = 0; i < nums.size(); i++){
            x = (int)nums.get(i) + x;
        }
        x = x/(double)nums.size();
        avg = x;
    }

    //This method will be used to find the minimum for the array
    public static void minimum(ArrayList nums){
        min = (int)nums.get(0);
        for(int i = 1; i<nums.size(); i++){
           if(min>(int)nums.get(i))
                min = (int)nums.get(i);
        }
    }
}
