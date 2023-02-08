package week1.day1;

public class Mobile {
	
	public void makecall() {
		String mobileModel= "Realme";
		float mobileWeight= 10.5f;
		
		 System.out.println("Model of the mobile" + mobileModel);
		 System.out.println("Weight of the mobile" + mobileWeight);
		 System.out.println("From realme");
	}
		
	public void sendsms() {
		boolean fullycharged = true;
		int mobilecost= 21000;
		
		System.out.println("Is the mobile fully charged" + fullycharged);
		System.err.println("Cost of the mobile" + mobilecost);
		System.out.println("calling my friend");
		 
		
	}
		 
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendsms();
		obj.makecall();
		System.out.println("This is my mobile");
		
		
		
		
		 
	}
		
		 
		
		 
	}
	
