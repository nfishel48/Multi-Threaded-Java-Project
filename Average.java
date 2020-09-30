import java.util.ArrayList;

class Average implements Runnable{
    
    private ArrayList<Integer> nums; //Declare a varible to store input in.

    public Average(ArrayList nums){
        this.nums = nums; //Set local varible to the value of the recived varible.
    }
    public void run() {
        try {
                double x = 0;
                for(int i = 0; i < nums.size(); i++){
                    x = (int)nums.get(i) + x;
                }
                x = x/(double)nums.size();
                Stats.avg = x;
            }
        
        catch (final Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}