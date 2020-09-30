import java.util.ArrayList;

class Minimum implements Runnable{
    
    private ArrayList<Integer> nums; //Declare a varible to store input in.

    public Minimum(ArrayList nums){
        this.nums = nums; //Set local varible to the value of the recived varible.
    }
    public void run() {
        try {
            Stats.min = (int)nums.get(0);
            for(int i = 1; i<nums.size(); i++){
               if(Stats.min>(int)nums.get(i))
                    Stats.min = (int)nums.get(i);
            }
        }
        catch (final Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}