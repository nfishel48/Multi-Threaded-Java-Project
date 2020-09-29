
//This class will extend the thread class so that 
//multithreading can be implemented in this program
class StatsThread extends Thread{
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
}

//This is the main class of the program and will contain the main method
public class Stats{
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            StatsThread object = new StatsThread(); 
            object.start(); 
        } 
    } 
}