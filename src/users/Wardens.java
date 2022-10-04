package users;

public class Wardens {
    
    private String warden_name;
    public int warden_ID;
    static String prison_in_charge;
    private int shift_hours;
    private int prisoner_count;
    private String day;
    
    //constructor
    public Wardens( int warden_ID , String prison_in_charge){
      this.warden_ID = warden_ID;
      this.prison_in_charge = prison_in_charge;
    }
    
    //gettors
    public int getShiftHours(){
        return this.shift_hours;
    }
    public String getWardenName(){
        return this.warden_name;
    }
    public String getDay(){
        return this.day;
    }
    public int getPrisonerCount(){
        return this.prisoner_count;
    }
    
    //settors
    public void setShiftHours(int shift_hours){
        this.shift_hours = shift_hours;
    }
    public void setWardenName( String warden_name){
        this.warden_name = warden_name;
    }
    public void setDay( String day){
        this.day = day;
    }
    public void setPrisonerCount(int prisoner_count){
        this.prisoner_count = prisoner_count;
    }
    
    //methods
    
    public void introduce(){
        System.out.println("My name is: "+ warden_name);
        System.out.println("I am incharge of: "+ prison_in_charge);
}
    public void patrol(){
            
            System.out.println("My shift hours are: "+ shift_hours);
            System.out.println("The number of prisoners present are"+ prisoner_count);
          
        }
    public void attendance(){
            System.out.println("I have reported on"+ day);
        
        }
}
