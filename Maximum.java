import java.util.ArrayList;

class Maximum implements Runnable{
    
    private ArrayList<Integer> nums; //Declare a varible to store input in.

    public Maximum(ArrayList nums){
        this.nums = nums; //Set local varible to the value of the recived varible.
    }
    public void run() {
        try {
            Stats.max = (int)nums.get(0);
            for(int i = 1; i<nums.size(); i++){
                if(Stats.max<(int)nums.get(i))
                    Stats.max = (int)nums.get(i);
                }
            }
            
        
        catch (final Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}