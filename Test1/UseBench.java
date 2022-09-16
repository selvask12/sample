package Test1;

public class UseBench {
	public static void main(String[] args) {
		Bench a =new Bench();
		a.brand="ply";
		a.price=250;
		a.color="orange";
		
		Bench b=new Bench();
		b.brand="wood";
		b.price=450;
		b.color="blue";
		
		Bench []benches= {a,b};	
		int max=benches[0].price;
		String maxName="";
		for(int i=0; i<benches.length; i++ ) {
			if(max<benches[i].price) {
				max=benches[i].price;
				maxName=benches[i].brand;
				
			}
		}
		System.out.println(max+" "+maxName);
	}
			
		}
		
		
	
