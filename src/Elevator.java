public class Elevator {
    private States aktState;
    public static int current_Floor= 5;
    int dest_Floor;

    public Elevator (int dest_Floor){

        this.dest_Floor=dest_Floor;
        States aktState = States.IDLE;

        if(current_Floor<dest_Floor){
            go_up();
        } else if(current_Floor>dest_Floor){
            go_down();
        }else{
            exit();
        }
    }
    public void arrive_to_floor(){
        aktState = States.IDLE;
        exit();
    }
    public void exit(){
        System.out.println("Your current floor is your destinated floor " + dest_Floor);
    }
    private void go_up(){
        while(current_Floor<dest_Floor){
            current_Floor+=1;
            aktState = States.MOVING_UP;
            System.out.println("Your are currently at Floor " + current_Floor);
        }
        if(current_Floor== dest_Floor){
            arrive_to_floor();
        }
    }
    private void go_down(){
        while(current_Floor>dest_Floor){
            current_Floor-=1;
            aktState = States.MOVING_DOWN;
            System.out.println("Your are currently at Floor" + current_Floor);
        }
        if(current_Floor== dest_Floor){
            arrive_to_floor();
        }

    }

}
