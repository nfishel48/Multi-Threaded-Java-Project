import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

//This class will extend the thread class so that 
//multithreading can be implemented in this program.
//Parts of this class are borrowed from https://www.geeksforgeeks.org/multithreading-in-java/
class StatsThread extends Thread {
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
    public static void main(final String[] args) {
        ArrayList<Integer> nums = prompt();
        System.out.println(nums.get(0));
    }

    // This method will prompt the user for input and recive a line of intergers
    public static ArrayList prompt() {

        // init Scanner to be used for reading user input
        Scanner in = new Scanner(System.in); 
        // Prompt the user for input
        System.out.println("Please enter a line of intergers sepperated by spaces.");
        System.out.print(">");

        //Create a new array list object
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //Create a counter varible 
        int i = 0;

        //While loop to check for Intergers in the input and add them to the array list.
        while (in.hasNextInt()) {
            if (in.hasNextInt())
                nums.add(i, in.nextInt());
            else 
                in.next();
        }
        
        in.close();
        return nums;
    }
}