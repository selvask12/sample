package Test1;

public class UseBike {
	public static void main(String[] args) {
		Bike bike =new Bike();
		bike.brand="ktm";
		bike.price=25000;
		bike.color="orange";
		
		Bike bike1=new Bike();
		bike1.brand="tvs";
		bike1.price=45000;
		bike1.color="blue";
		
		Bike[] bikes= {bike,bike1};
		int max=0;
		String maxName=" ";
		int index=0;
		for (int i=0; i<bikes.length; i++) {
			
			if (bikes[i].price>max) {
				max=bikes[i].price;
				maxName=bikes[i].brand;
				index=i;
			
			
				System.out.println(maxName);
			System.out.println(bikes[i].brand+" "+bikes[i].color+" "+bikes[i].price);	
				
			}		
			}
		
		 
		
		
		
		
	}

}
