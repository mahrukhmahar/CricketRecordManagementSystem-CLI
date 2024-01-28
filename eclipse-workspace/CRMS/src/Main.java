
import java.io.*;
import java.util.Scanner;



class Menu{
	Menu(){
	   System.out.println("--------------------------------------");
	   System.out.println("|  Cricket Record Management System  |");
	   System.out.println("--------------------------------------");
	}
	
	public void LoadTest(String teamName) {
		 String line;
		 Boolean teamFound=false;
		 try {
			 BufferedReader buffer=new BufferedReader(new FileReader("C://Users//lenovo//eclipse-workspace//CRMS//src//Test.txt"));
			 while ((line = buffer.readLine()) != null) {
	                
	                if (line.toLowerCase().contains(teamName.toLowerCase())) {
	                    teamFound = true;
	                    System.out.println("Team Record Found:");
	                    while ((line = buffer.readLine()) != null && !line.trim().isEmpty()) {
	                        System.out.println(line);
	                    }

	                    break; 
	                }
	                else if(teamFound){
	                	System.out.println("Record not Found");
	                	
	                }
		 }
		 		
		 }catch(Exception e) {
			 System.err.println("Error Loading File");
		 }
		 }
	
	
	public void LoadODI(String teamName) {
		 String line;
		 Boolean teamFound=false;
		 try {
			 BufferedReader buffer=new BufferedReader(new FileReader("C://Users//lenovo//eclipse-workspace//CRMS//src//ODI.txt"));
			 while ((line = buffer.readLine()) != null) {
	                
	                if (line.toLowerCase().contains(teamName.toLowerCase())) {
	                    teamFound = true;
	                    System.out.println("Team Record Found:");
	                    while ((line = buffer.readLine()) != null && !line.trim().isEmpty()) {
	                        System.out.println(line);
	                    }

	                    break; 
	                }
	                else if(teamFound=false){
	                	System.out.println("Record not Found");
	                	break;      }
		 }
		 }catch(Exception e) {
			 System.out.println("Error Loading File");
			 }
		 }
	
	
	
	public void LoadT20(String teamName) {
		 String line;
		 Boolean teamFound=false;
		 try {
			 BufferedReader buffer=new BufferedReader(new FileReader("C://Users//lenovo//eclipse-workspace//CRMS//src//T20.txt"));
			 while ((line = buffer.readLine()) != null) {
	                
	                if (line.toLowerCase().contains(teamName.toLowerCase())) {
	                    teamFound = true;
	                    System.out.println("Team Record Found:");
	                    while ((line = buffer.readLine()) != null && !line.trim().isEmpty()) {
	                        System.out.println(line);
	                    }

	                    break; 
	                }
	                else if(teamFound=false){
	                	System.out.println("Record not Found");
	                	break;
	                }
	 
		 }
		 		
		 }catch(Exception e) {
			 System.out.println("Error Loading File");
			 }
		 
			
		 }
	
	public void LoadPlayer(String playername) {
		 String line;
		 Boolean playerFound=false;
		 try {
			 BufferedReader buffer=new BufferedReader(new FileReader("C://Users//lenovo//eclipse-workspace//CRMS//src//player.txt"));
			 while ((line = buffer.readLine()) != null) {
	               
	                if (line.toLowerCase().contains(playername)) {
	                    playerFound = true;
	                    System.out.println("Player Record Found:");
	                    while ((line = buffer.readLine()) != null && !line.trim().isEmpty()) {
	                        System.out.println(line);
	                    }

	                    break; 
	                }
	                else if(playerFound=false){
	                	System.out.println("Player Record Not Found");
	                	break;
	                }
	 
		 }
		 		
		 }catch(Exception e) {
			 System.out.println("Error Loading File");
			 }
	}
	
	public void loadTeam(int choice) {
		 String line;
		 Boolean playerFound=false;
		 String value=String.valueOf(choice);
		 try {
			 BufferedReader buffer=new BufferedReader(new FileReader("C://Users//lenovo//eclipse-workspace//CRMS//src//Team.txt"));
			 while ((line = buffer.readLine()) != null) {
	               
	                if (line.contains(value)) {
	                    while ((line = buffer.readLine()) != null && !line.trim().isEmpty()) {
	                        System.out.println(line);
	                    }

	                    break; 
	                }
	                else if(playerFound=false){
	                	System.out.println("Invalid Choice");
	                	break;
	                }
	 
		 }
		 		
		 }catch(Exception e) {
			 System.out.println("Error Loading File");
			 }
			
	}
	
	
	}

class userMenu extends Menu{
	Scanner scan=new Scanner(System.in);
	int choice;
	String name;
	
	userMenu(){
		super();
		System.out.println("1.   Show Stats");
		System.out.println("2.   Search Player");
		System.out.println("3.   Show All Teams");
		System.out.println("4.   Exit");
	}
	public void showStats() {
		while(true) {
		System.out.println("1. Test Matches");
		System.out.println("2. One-Day Internationals");
		System.out.println("3. Twenty20 Internationals");
		System.out.println("4. Back");
		choice=scan.nextInt();
		scan.nextLine();
		
		if(choice==1) {
		 System.out.println("Enter Team Name: ");
		 name=scan.next();
		 System.out.println();
	   	 super.LoadTest(name);
	   	 System.out.println();
	   	 scan.nextLine();
		 
		}
		else if(choice==2) {
			System.out.println("Enter Team Name");
			name=scan.next();
			super.LoadODI(name);
			System.out.println();
			 scan.nextLine();
			
		}
		else if(choice==3) {
			System.out.println("Enter Team Name");
			name=scan.next();
			super.LoadT20(name);
			System.out.println();
			 scan.nextLine();
			
		}
		else if(choice==4) {
			break;
		}
		else {
			System.out.println("Invalid Choice");
			System.out.println();
			 scan.nextLine();
		}
		
		}
				
	}
	
	public void showPlayer(){
		
		System.out.println("Enter Player Name: ");
		String playerName=scan.nextLine();
		super.LoadPlayer(playerName);
		
	}
	
	public void showTeam() {
		while(true) {
		System.out.println("\t\tTeams: ");
		System.out.println();
		System.out.println("1. POPULAR MEN'S INTERNATIONAL TEAMS");
		System.out.println("2. POPULAR WOMEN'S INTERNATIONAL TEAMS");
		System.out.println("3. BBL TEAMS");
		System.out.println("4. BPL TEAMS");
		System.out.println("5. IPL TEAMS");
		System.out.println("6. ILT20 TEAMS");
		System.out.println("7. PSL TEAMS");
		System.out.println("8. SA20 TEAMS");
		System.out.println("9. WPL TEAMS");	
		System.out.println("10. WBBL TEAMS");
		System.out.println("11. Back");

		
		
		System.out.println();
		System.out.println("Select Any (1,2,3..) : ");
		 choice=scan.nextInt();
		 if(choice==11) {
			 break;
		 }
		 else {
		loadTeam(choice);
		System.out.println();
		}
		
	}
	
	
	
}
}





class CRSM{
	Scanner scan=new Scanner(System.in);
	
	int choice;
	
      public void start() {
    	  
    	
      
    	  System.out.println("Enter  Your Name: ");
    	  String username=scan.nextLine();
    	  System.out.println("");
    	  System.out.println("\t\tWelcome "+username);
    	  System.out.println();
    	  
    	 while(true) {
    	   	 
    	    	  userMenu admin=new userMenu();
    	    	  System.out.println("Enter Your Choice");
    	    	  choice=scan.nextInt();
    	    	  if(choice==1) {
    	    		  admin.showStats();
    	    	  }
    	    	  else if(choice==2) {
    	    		  admin.showPlayer();
    	    	  }
    	    	 
    	    	  else if(choice==3) {
    	    		  admin.showTeam();
    	    		  
    	    	  }
    	    	  else if(choice==4) { 
    	    		  System.out.println("Thanks For Using Our Cricket Management System "+username);
    	    		  
    	    	  break;  
    	    	  }
    	    	  else
    	    		  System.out.println("Invalid Choice");
    	      }
    	 
    	      }
    	      
    	  }
    	     
    	        

      

    	  

public class Main {
	public static void main(String[] args) {
	
	CRSM crsm=new CRSM();
	crsm.start();
	}

}
