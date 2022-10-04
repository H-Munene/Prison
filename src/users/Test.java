package users;

import java.util.HashMap;
import java.util.Map;
import users.Guards;
import java.util.Scanner;

public class Test {
    
    public static void PickUser() {
        Scanner src = new Scanner(System.in);
        String user = src.nextLine();
        switch(user) {
            case "1": 
                IfGuard();
                break;
            case "2":
                IfPrisoner();
                break;
            case "3":
                IfWarden();
                break;
            default:
                System.out.println("Invalid user input. Try again.");
                System.out.println("Enter user \n 1. prisoner \n 2. guard \n 3. warden" );
                PickUser();
        }
        
    }
    
    public static void IfGuard() {
        Scanner gid = new Scanner(System.in);
        System.out.println("Enter Guard ID: ");
        int guardId = gid.nextInt();
        Guards g001 = new Guards(guardId);
        
        Scanner dep = new Scanner(System.in);
        System.out.println("Enter your patrol area: ");
        String patrolDepartment = dep.nextLine();
        g001.setPartolArea(patrolDepartment);
        g001.getGuardPatrolArea();
        
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter guard name: ");
        String username = obj1.nextLine();
        g001.setGuardUsername(username);
        g001.getGuardUsername();
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your shift hours: ");
        int hours  = inp.nextInt();
        
        g001.setShiftHours(hours);
        g001.getShiftHours();
        
        
        g001.introduce();
        g001.guardShiftHours();
        g001.guardPatrol();
    }
    
    public static void IfPrisoner() {
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter the prisoner ID: ");
        int pris = pr.nextInt();
        Prisoners p001 = new Prisoners(pris);
        
        Scanner pr_nam = new Scanner(System.in);
        System.out.println("Enter prisoner name: ");
        String pris_name = pr_nam.nextLine();
        p001.setPrisonerName(pris_name);
        
        Scanner pr_off = new Scanner(System.in);
        System.out.println("Enter prisoner offence: ");
        String pris_off = pr_off.nextLine();
        p001.setOffence(pris_off);
        
        Scanner dur= new Scanner(System.in);
        System.out.println("Enter prison duration: ");
        int pris_time = dur.nextInt();
        p001.setPrisonTime(pris_time);
        
        p001.getOffence();
        p001.getPrisonTime();
        p001.getPrisonerName();
        
        p001.Introduce();
        
        Map<Integer, Object> prisonerData = new HashMap<Integer, Object>();
        
        Map<String, Object> pData = new HashMap<String, Object>();
        
        pData.put("id", p001.getPrisoner_id());
        pData.put("name", p001.getPrisonerName());
        pData.put("offence", p001.getOffence());
        pData.put("duration", p001.getPrisonTime());
        prisonerData.put(p001.getPrisoner_id(), pData);
        System.out.println(prisonerData);
        
        storeUser(Integer.toString(p001.getPrisoner_id()), p001);
            
    }
    
    public static void IfWarden(){
        Scanner war = new Scanner(System.in);
        System.out.println("Enter Warden ID: ");
        int warden_id = war.nextInt();
        
        Scanner st= new Scanner(System.in);
        System.out.println("Enter your prison station: ");
        String prison_name = st.nextLine();
        Wardens w001 = new Wardens(warden_id, prison_name);
        
        Scanner inp_name = new Scanner(System.in);
        System.out.println("Enter Warden name: ");
        String warden_name = inp_name.nextLine();
        w001.setWardenName(warden_name);
        
        Scanner hrs = new Scanner(System.in);
        System.out.println("Enter your shift hours: ");
        int hour = hrs.nextInt();
        w001.setShiftHours(hour);
        
        Scanner report_day = new Scanner(System.in);
        System.out.println("I have reported on: ");
        String report = report_day.nextLine();
        w001.setDay(report);
        
        Scanner count = new Scanner(System.in);
        System.out.println("Enter current prisoner count: ");
        int  pris_count = count.nextInt();
        w001.setPrisonerCount(pris_count);
        
        w001.getDay();
        w001.getWardenName();
        w001.getShiftHours();
        
        w001.introduce();
        w001.patrol();
        w001.attendance();
    }
    
    public static void storeUser(String userId, Prisoners user){
        Map<String, Prisoners> userData = new HashMap<String, Prisoners>();
        userData.put(userId, user);
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter user \n 1. prisoner \n 2. guard \n 3. warden" );
       
        PickUser();
     
    }
}