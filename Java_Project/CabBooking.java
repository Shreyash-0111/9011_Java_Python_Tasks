
import java.util.Scanner;
import java.util.Random;

class Process{
	
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	
	public void getOptconfirm() {
		Random rand = new Random();
		
		do {
			System.out.println("Choose/ Press the Option | 1. Confirm & ShareOTP | 2. Cancel Ride ");
			System.out.println("!!Once the OTP has been shared, the ride cannot be cancelled.!!");
			int choice = sc.nextInt();
			switch (choice)
			{
			//case 1 : int otp = min + rand.nextInt(max - min + 1) ;break;
			case 1 : {
						int otp = rand.nextInt(1000,10000); 
						System.out.println("Your Booking is Confirmed And Here is your OTP : " + otp);
						System.out.println("## Enjoy Your Ride ##");
						flag = false;break;
					 }
			case 2 : {
						System.out.println("!!Cab Booking Cancled!!\n");
						flag = false; break;
					 }
			default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
			}
		} while(flag);
		
	}
	
	public void getAuto()
	{
		int rate = 12;
		int total_fare = 0;
		do {
			System.out.println("Select Source And Destination: ");
			System.out.println("Press 1.Pune Station To Shivajinagar");
			System.out.println("Press 2.Pune Station To Kothrud");
			System.out.println("Press 3.Pune Station To Wakad");
			System.out.println("Press 4.Swargate To Shivajinagar");
			System.out.println("Press 5.Swargate To Kothrud");
			System.out.println("Press 6.Swargate To Wakad");
			System.out.println("Press 7.Hinjawadi To Shivajinagar");
			System.out.println("Press 8.Hinjawadi To Kothrud");
			System.out.println("Press 9.Hinjawadi To Wakad");
			
			int choice = sc.nextInt();
			
		switch (choice)
		{
		case 1 : {
					 int distance = 5; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Pune Station To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 2 : {
					 int distance = 8; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Pune Station To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 3 : {
					 int distance = 10; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Pune Station To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 4 : {
					 int distance = 5; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Swargate To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 5 : {
					 int distance = 8; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Swargate To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 6 : {
					 int distance = 10; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Swargate To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 7 : {
					 int distance = 5; total_fare = distance * rate;
					 System .out.println("\nCabType : Auto | (Hinjawadi To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					 getOptconfirm();flag = false;break;
				 }
		case 8 : {
					int distance = 8; total_fare = distance * rate;
					System .out.println("\nCabType : Auto | (Hinjawadi To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
				 }
		case 9 : {  
					int distance = 10; total_fare = distance * rate;
					System .out.println("\nCabType : Auto | (Hinjawadi To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
				 }
		default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
		}
		} while(flag);
	}
	
	public void getSedan()
	{
		int rate = 18;
		int total_fare = 0;
		do {
			System.out.println("Select Source And Destination: ");
			System.out.println("Press 1.Pune Station To Shivajinagar");
			System.out.println("Press 2.Pune Station To Kothrud");
			System.out.println("Press 3.Pune Station To Wakad");
			System.out.println("Press 4.Swargate To Shivajinagar");
			System.out.println("Press 5.Swargate To Kothrud");
			System.out.println("Press 6.Swargate To Wakad");
			System.out.println("Press 7.Hinjawadi To Shivajinagar");
			System.out.println("Press 8.Hinjawadi To Kothrud");
			System.out.println("Press 9.Hinjawadi To Wakad");
			
			int choice = sc.nextInt();
			
		switch (choice)
		{
		case 1 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Pune Station To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 2 : {
			 		int distance = 8; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Pune Station To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 3 : {
			 		int distance = 10; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Pune Station To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 4 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Swargate To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 5 : {
			 		int distance = 8; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Swargate To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 6 : {
			 		int distance = 10; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Swargate To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 7 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : Sedan | (Hinjawadi To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
		case 8 : {
					int distance = 8; total_fare = distance * rate;
					System .out.println("\nCabType : Sedan | (Hinjawadi To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
		 		 }
		case 9 : {  
					int distance = 10; total_fare = distance * rate;
					System .out.println("\nCabType : Sedan | (Hinjawadi To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
		 	 	 }
		default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
		}
		} while(flag);
	}
	
	public void getSUV()
	{
		int rate = 25;
		int total_fare = 0;
		do {
			System.out.println("Select Source And Destination: ");
			System.out.println("Press 1.Pune Station To Shivajinagar");
			System.out.println("Press 2.Pune Station To Kothrud");
			System.out.println("Press 3.Pune Station To Wakad");
			System.out.println("Press 4.Swargate To Shivajinagar");
			System.out.println("Press 5.Swargate To Kothrud");
			System.out.println("Press 6.Swargate To Wakad");
			System.out.println("Press 7.Hinjawadi To Shivajinagar");
			System.out.println("Press 8.Hinjawadi To Kothrud");
			System.out.println("Press 9.Hinjawadi To Wakad");
			
			int choice = sc.nextInt();
			
		switch (choice)
		{
		case 1 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Pune Station To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		    	 }
	    case 2 : {
			 		int distance = 8; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Pune Station To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 3 : {
			 		int distance = 10; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Pune Station To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 4 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Swargate To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 5 : {
			 		int distance = 8; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Swargate To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 6 : {
			 		int distance = 10; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Swargate To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 7 : {
			 		int distance = 5; total_fare = distance * rate;
			 		System .out.println("\nCabType : SUV | (Hinjawadi To Shivajinagar) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
			 		getOptconfirm();flag = false;break;
		 		 }
	    case 8 : {
					int distance = 8; total_fare = distance * rate;
					System .out.println("\nCabType : SUV | (Hinjawadi To Kothrud) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
		 		 }
	    case 9 : {  
					int distance = 10; total_fare = distance * rate;
					System .out.println("\nCabType : SUV | (Hinjawadi To Wakad) | Distance= " + distance+"km" + "| Rate= "+ rate+"km/hr" + "| Total_Fare= "+ total_fare); 
					getOptconfirm();flag = false;break;
		 		 }
		default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
		}
		} while(flag);
	}
}

class OptionMenu {
	 
	Process p = new Process();
	Scanner sc = new Scanner(System.in);
	int choice;
	boolean flag = true;
	
	public void getMainMenu()
	{
		System.out.println("Welcome to Cab Booking Bot!!!!");
		do {
			System.out.println("Choose/ Press the Option | 1. BookRide | 2. Exit ");
			choice = sc.nextInt();
			switch (choice)
			{
			case 1 : getBookRide();flag = true;break;
			case 2 : System.out.println("\nGood Bye!!! | Have A Nice Day! | Visit Again!!"); flag = false; break;
			default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
			}
		} while(flag);
    }
	public void getBookRide() {
		
		System.out.println("Choose Cab Type: ");
		
		do {
			System.out.println("Press 1. Auto | 2. Sedan | 3. SUV ");
			int choice = sc.nextInt();
		switch (choice)
		{
		case 1 : p.getAuto(); flag = false ;break;
		case 2 : p.getSedan(); flag = false; break;
		case 3 : p.getSUV(); flag = false; break;
		default : System.out.println("Invalid Choice!!! | Enter Valid choice!!!");
		}
		} while(flag);
	}
}

public class CabBooking {

	public static void main(String[] args) {
	
		OptionMenu op = new OptionMenu();
		op.getMainMenu();

	}

}
