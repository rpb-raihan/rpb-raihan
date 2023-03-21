import java.io.*;
import classes.*;
import interfaces.*;
import java.util.Scanner; 
import fileio.*;
public class Start
{
	public static void main(String[]args)
	{
	System.out.println("-----------------------------------------");
	System.out.println("**************************************|");
	System.out.println("**Welcome to ABCD University**");
	System.out.println("**************************************|");
	System.out.println("-----------------------------------------");
	boolean choice = true;
	String name=null;
                   int nid=0,price =0,number =0;

	
	Scanner sc = new Scanner(System.in);
	Form f = new Form();
	verifying verify=new verifying();
	FileReadWriteDemo frwd = new FileReadWriteDemo();


		while(choice)
		{
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1.Admission Requirement");
			System.out.println("	2.Online  Application");
			System.out.println("	3.Grading System");
			System.out.println("**************************");
			System.out.print("What do you want to do? : ");
			int first1 = sc.nextInt();


		switch(first1)
		{
		case 1:
					
			System.out.println("You have selected Admission Requirement");
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Undergraduate Program");
			System.out.println("	2. Graduate Program");
			System.out.println("	3. Go Back");
			System.out.println("*****************");
			System.out.print("What do you want to do? : ");

	                                     int second1 = sc.nextInt();
               		 	 switch(second1)
			 {
			  case 1:
				System.out.println("You have Selected to Undergraduate Program\n");

				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. BBA");
				System.out.println("	2. LLB");
				System.out.println("	3. BSc");
				System.out.println("	4. Go Back");
				    int third1 = sc.nextInt();
               		 		   switch(third1)
					{
					case 1:
					BBA bba=new BBA();
					bba.displayinfo_BBA();
					break;
					
					case 2:
					LLB llb=new LLB();
					llb.displayinfo_LLB();
					break;
					
					case 3:
					BSc bsc=new BSc();
					bsc.displayinfo_BSc();
					break;
					case 4:
					System.out.println("You have Selected to Go Back");	
					break;
					default:		
					System.out.println("Invalid Input");
					break;
					}

				break;
			 case 2:
				
				System.out.println("You have Selected to Graduate Program\n");

				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. MBA");
				System.out.println("	2. MSc");
				System.out.println("	3. Go Back");
				  int third2 = sc.nextInt();
               		 		  switch(third2)
					{
					case 1:
					   MBA mba=new MBA();
                         				   mba.displayinfo_MBA();
					   break;
					case 2:
					   MSc msc=new MSc();
                            				   msc.displayinfo_MSc();
					   break;
					case 3:
					   System.out.println("You have Selected to Go Back");	
					    break;
					default:		
					    System.out.println("Invalid Input");
					    break;
					 }
				 break;
			case 3:
				System.out.println("You have Selected to Go Back");	
				 break;
			default:		
				System.out.println("Invalid Input");
				break;
			}
			break;	
		case 2:
			
				System.out.println("You have selected Online  Application");
				System.out.println("Here are Some Options for You: \n");
				System.out.println("1.Apply Now");
				System.out.println("2.See all Student");
				System.out.println("3.Remove Application");
				System.out.println("4.Payment");
				System.out.println("5.See Selected Student");
				System.out.println("6.Go Back");
				System.out.print("What do you want to do? : ");
				
			 int second2 = sc.nextInt();
               		 	 switch(second2)
			{
			case 1:
				Login login=new Login();
				login.Login();
				
				System.out.print("Enter Student Name : ");
				String sname = sc.next();
				System.out.println("...............................");

				System.out.print("Enter Student Date of Birth :");
				String DOB = sc.next();
				System.out.println("...............................");

				System.out.print("Enter Student HSC Registation Id: ");
				String regi = sc.next();
				System.out.println("...............................");

				System.out.print("Enter Student HSC Roll No: ");
				String roll = sc.next();
				System.out.println("...............................");

				System.out.print("Enter Department: ");
				String dep = sc.next();
				System.out.println("...............................");

				Student s=new Student();

				s.setName(name);
				s.setDOB(DOB);
				s.setRegi(regi);
				s.setRoll(roll);
				s.setDep(dep);
				f.insertStudent(s);
				break;

			case 2:
				System.out.println("You have Selected to See all Student Infomation");
				f.showAllStudentForm();
				break;			
				
			case 3:
				System.out.println("You have Selected to remove an existing");
				System.out.print("Enter Student regi: ");
				f.removeStudent(f.getStudent(sc.next()));
							
				break;
			case 4:
				System.out.println("You have Selected to Payment Option");
				 {
				System.out.print("Enter Student regi for Verifying: ");
				verify.getStudent(sc.next());

        				Fee obj = new Fee();
        				Scanner myObj = new Scanner(System.in);
		
        				System.out.println("Enter Your Registation number :");
        				int sr = myObj.nextInt();
        				myObj.nextLine();
		
				System.out.println("Enter Student name :");
				String n=myObj.nextLine();
		
				System.out.println("Enter Amount Of Fee :");
 				float fee=myObj.nextFloat();
		
				System.out.println("Enter Account Number :");
				int a=myObj.nextInt();
				myObj.nextLine();
		
				System.out.println("Enter Your Account PIN:");
        				int pin = myObj.nextInt();
		
				System.out.println("Enter Phone Number :");
        				int p=myObj.nextInt();
				myObj.nextLine();
	   
	   
		
        				obj.set_details(sr,n,fee,a,pin,p);
        				obj.get_details();

         frwd.writeInFile("Registation number :\n"+sr+"Student name :\n"+n+"Account Number :\n"+a+"Phone Number :\n"+p+"********************\n");

				}
				
	      			
				

				


				break;

			case 5:

				frwd.readFromFile();
				break;
			case 6:
				System.out.println("You have Selected to Go Back");	
				
				break;

			       default:
				System.out.println("Invalid Input");
				break;
		                   }
			break;

		case 3:

			System.out.println("You have Selected to Grading System of ABCD University");
			
			Grading grade=new Grading();
			grade.Grading();

			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		

	}
		

}
}
				