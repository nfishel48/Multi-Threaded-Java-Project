import java.util.Scanner;
import java.util.ArrayList;

// This is the main class of the program and will contain the main method
public class Stats {
    public static int min = 0;
    public static int max = 0;
    public static double avg = 0;

    public static void main(final String[] args) {
        ArrayList<Integer> nums = prompt();
        Thread worker1 = new Thread(new Average(nums));
        worker1.start();
        //Add a wait 
        System.out.println(avg);
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

    //This method will be used to find the minimum for the array
    public static void minimum(ArrayList nums){
        min = (int)nums.get(0);
        for(int i = 1; i<nums.size(); i++){
           if(min>(int)nums.get(i))
                min = (int)nums.get(i);
        }
    }

    //This method will be used to find the maximum of the array     
    public static void maximum(ArrayList nums){
        max = (int)nums.get(0);
        for(int i = 1; i<nums.size(); i++){
            if(max<(int)nums.get(i))
                max = (int)nums.get(i);
            }
        }
}
