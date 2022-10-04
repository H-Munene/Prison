package users;

public class Guards {
    
    private String guard_username; //done
    public int guard_Id; // done
    private String patrol_area; //done
    private int shift_hours;
    
    //constructor
    public Guards(int new_guard_Id){
        guard_Id = new_guard_Id;
    }
    
    //gettors
    public void setGuardUsername(String guard_username){
        this.guard_username = guard_username;
    }
    
    public void setPartolArea(String patrol_area){
        this.patrol_area = patrol_area;
    }
    
    public void setShiftHours(int shift_hours){
        this.shift_hours = shift_hours;
    }
    
    //settors
    public String getGuardUsername(){
        return this.guard_username;
    }
    public String getGuardPatrolArea(){
        return this.patrol_area;
    }
    public int getShiftHours(){
        return this.shift_hours;
    }
    
 
    public void introduce(){
        System.out.println("My name is "+guard_username +" and my ID is "+guard_Id);
    }
    public void guardPatrol(){
        System.out.println("I have patrolled the "+patrol_area);
    }
    public void guardShiftHours(){
        System.out.println("I have "+shift_hours+" hours");
    }
}
