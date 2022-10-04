package users;

public class Prisoners {
    
    public int prisoner_id;
    public String prisoner_name;
    private String offence;
    protected int prison_time;
    private int bail;
    public String work;
   
   
   public Prisoners(int prisoner_id){
   this.prisoner_id = prisoner_id;
}
   //setters
   public void setPrisonerName( String prisoner_name){
       this.prisoner_name = prisoner_name;
   }
   public void setOffence(String offence){
       this.offence = offence;
   }
   public void setPrisonTime(int prison_years){
       this.prison_time = prison_years;
   }

    public int getPrisoner_id() {
        return prisoner_id;
    }
   
   //getters
   public String getOffence(){
       return this.offence;
   }
   public int getPrisonTime(){
       return this.prison_time;
   }
   public String getPrisonerName(){
       return this.prisoner_name;
   }
   
   public void Introduce(){
        System.out.println("My name is "+prisoner_name);
        System.out.println("My prison ID is: "+ prisoner_id);
        System.out.println("I am in jail for "+prison_time + " years.");
        System.out.println("Reason for my jail term is "+offence);
    }
   
    public void Bail_Money(){
        System.out.println("Your bail amount is "+bail);
    }
   
    public void Assigned_Job(){
        System.out.println("Your assigned job is "+work);
    }
   
}


/*public int prisoner_id;
    public String prisoner_name;
    private String offence;
     protected int prison_time;
    private int bail;
    public String work;
   
   
    public void Introduce(){
        System.out.println("My name is "+prisoner_name);
        System.out.println("I am in jail for "+prison_time);
        System.out.println("Reason for my jail term is "+offence);
    }
   
    public void Bail_Money(){
        System.out.println("Your bail amount is "+bail);
    }
   
    public void Assigned_Job(){
        System.out.println("Your assigned job is "+work);
    }*/