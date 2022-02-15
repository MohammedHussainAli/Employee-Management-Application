package controller;
import java.util.Scanner;
import utility.FileExtract;
import service.EmployeeService;
import utility.FileExtract2;

public class Main {
	
	EmployeeService service=new EmployeeService();
	static boolean order=true;

	//Menu Method Declaration
	
	public static void menu()
	{
		System.out.println();
		//System.out.println("************************* HEPTAGON TECHNOLOGIES - Employee Managment System ****************************\n"
        		//+ "\n1. Add Employee \n "
        		//+ "\n2. View Employee \n"
        	    //+ "\n3. Update Employee \n"
        		//+ "\n4. Delete Employee \n"
        		//+ "\n5. View All Employee \n"
        		//+ "\n6. Exit \n");
		FileExtract2 filereader=new FileExtract2();
	    filereader.readFile();
	}

	public static void main(String[] args) {
		String userName="Mohammed";
    	String userPass="Ali@0044";
    	String msg=("If you are a new-user kindly contact support for your new login cardential, THANK YOU !");
        Scanner sc = new Scanner(System.in);
        String sp=" ";
        FileExtract filereader=new FileExtract();
	    filereader.read();
        //System.out.println("======================================================================================================");
       // System.out.println("**************** Welcome to HEPTAGON TECHNOLOGIES - Employee Managment Application *******************");
       // System.out.println("======================================================================================================\n\n");
      //  System.out.println("**************************** Kindly LOGIN to enter into the application ******************************");
       // System.out.println("------------------------------------------------------------------------------------------------------");
    
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Enter the Username => ");
        
        String uname = sc.nextLine();
        if((uname.contains(sp)) || uname.length()<4){
            System.out.println("Invalid Username, please try again !!");
            return;
        }

        System.out.println("Enter the Password => ");
        String upass = sc.nextLine();
        if((upass.contains(sp)) || upass.length()<8){
            System.out.println("Invalid Password, please try again !!");
            return;
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
		if(uname.equals(userName) && upass.equals(userPass)){
            System.out.println("Welcome "+userName+" you have Logged-in Successfully");
            System.out.println("------------------------------------------------------------------------------------------------------");
            EmployeeService service=new EmployeeService();
		do {
			//Method call
			menu();
			System.out.println("\nEnter your Choice =>");
			int choice=sc.nextInt();
			
			//Switch case for each choice
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				 System.out.println("------------------------------------------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				 System.out.println("------------------------------------------------------------------------------------------------------");
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmployee();
				 System.out.println("------------------------------------------------------------------------------------------------------");
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				 System.out.println("------------------------------------------------------------------------------------------------------");
				break;
			case 5:
				System.out.println("View All Employee");
				service.viewAllEmps();
				 System.out.println("------------------------------------------------------------------------------------------------------");
				break;
			case 6:
				System.out.println("=======================================================================================================");
				System.out.println("Thank you for using Employee Management application  - Heptagon technologies!!");
				System.out.println("=======================================================================================================");
				System.exit(0);
				
			default:
				System.out.println("=======================================================================================================");
				System.out.println("Please enter a valid choice");
				System.out.println("=======================================================================================================");
				break;
			}
			
		}
		while(order);
		}
		else{
            System.out.println("Username or Password Mismatch, Please Try again !!" + "\n"+ "Want to register? , Contact Support for further assistance, THANK YOU !");
        }
	}	

}
	


