package Welcome;
import java.util.Scanner;  // import_stmt
import Billgeneration.*;
//grp no 4

import Billgeneration.*;
class Menu
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to our canteen!!!!!");
		System.out.println("What do you want to order?");
		Bill b1=new Bill();
		System.out.println("\t1)MAHARASHTRIAN\n\t2)SOUTH INDIAN\n\t3)RAJASTHANI\n\t4)GUJRATI\n\t5)BENGALI\n\t6)DESSERTS");
		Scanner s= new Scanner(System.in);
		int selection = s.nextInt();
		boolean flag=true;
		switch(selection)
		{
		case 1:   
			   
				while(flag)
				{
					System.out.println("Select among following");
					System.out.println("1)Misal\n2)vadapav\n3)panipuri");
					int choice= s.nextInt();
					switch(choice)
					{
					case 1: b1.AddToBill(30);break;
					case 2: b1.AddToBill(15);break;
					case 3: b1.AddToBill(20);break;
					default:System.out.println("Enter correct choice");
					}
					System.out.println("Do you want anything else?(Yes|no)");
					String anything=s.next();

					if(anything.equals("no"))
						break;

				}
			
			
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your Final Bill is "+ b1.GetBill());
			b1.toBePaid();
			break;

		case 2:
			try{//Exception_handling_concept
				while(flag){
					System.out.println("Select among the following");
					System.out.println("1)Idli\n2)Dosa\n3)Vada");
					int choice=s.nextInt();
					switch(choice){
					case 1: b1.AddToBill(30);break;
					case 2: b1.AddToBill(25);break;
					case 3: b1.AddToBill(20);break;
					default:System.out.println("Enter correct choice");
					}
					System.out.println("Do you want else?(Yes|No)");
					String anything=s.next();

					if(anything.equals("no"))
						break;
				}
			}
			catch(Exception e){}
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your final bill is "+ b1.GetBill());
			b1.toBePaid();
			break;
		case 3:
			try{
				while(flag){
					System.out.println("Select among the following");
					System.out.println("1)Dal Baati Churma\n2)Laal mass\n3)Mohan Thaal");
					int choice=s.nextInt();
					switch(choice){
					case 1: b1.AddToBill(100);break;
					case 2: b1.AddToBill(70);break;
					case 3: b1.AddToBill(45);break;
					}
					System.out.println("Do you want else?(Yes|no)");
					String anything=s.next();

					if(anything.equals("no"))
						break;
				}
			}
			catch(Exception e){}
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your final bill is "+ b1.GetBill());
			b1.toBePaid();
			break;
		case 4:
			try{
				while(flag){
					System.out.println("Select among the following");
					System.out.println("1)Dhokla\n2)Khandvi\n3)Methi ka Thepla");
					int choice=s.nextInt();
					switch(choice){
					case 1: b1.AddToBill(30);break;
					case 2: b1.AddToBill(25);break;
					case 3: b1.AddToBill(25);break;
					}
					System.out.println("Do you want else?(Yes|no)");
					String anything=s.next();

					if(anything.equals("no"))
						break;
				}
			}
			catch(Exception e){}
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your final bill is "+ b1.GetBill());
			b1.toBePaid();
			break;
		case 5:
			try{
				while(flag){
					System.out.println("Select among the following");
					System.out.println("1)Aalu Luchi\n2)Maach Bhaat\n3)Tangra Macher Jhol");
					int choice=s.nextInt();
					switch(choice){
					case 1: b1.AddToBill(80);break;
					case 2: b1.AddToBill(130);break;
					case 3: b1.AddToBill(100);break;
					}
					System.out.println("Do you want else?(Yes|no)");
					String anything=s.next();

					if(anything.equals("no"))
						break;
				}
			}
			catch(Exception e){}
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your final bill is "+ b1.GetBill());
			b1.toBePaid();
			break;
		case 6:
			try{
				while(flag){
					System.out.println("Select among the following");
					System.out.println("1)Rasmalai\n2)Rasgulla\n3)Emarti\n4)Gajar ka Halwa");
					int choice=s.nextInt();
					switch(choice){
					case 1: b1.AddToBill(45);break;
					case 2: b1.AddToBill(40);break;
					case 3: b1.AddToBill(20);break;
					case 4: b1.AddToBill(60);break;
					}
					System.out.println("Do you want else?(Yes|no)");
					String anything=s.next();

					if(anything.equals("no"))
						break;
				}
			}catch(Exception e){}
			System.out.println("Your previous bill is"+b1.getbalance());
			System.out.println("Your final bill is "+ b1.GetBill());
			b1.toBePaid();
			break;
		}
    s.close();
	}

}






