package Test1;

public class UseElection {
	public static void main(String[] args) {
		Election a =new Election();
		a.name="Selva";
		a.age=25;
		a.isElegible=true;
		
		Election b =new Election();
		b.name="praveen";
		b.age=15;
		b.isElegible=false;
		
		Election c=new Election();
		c.name="vijay";
		c.age=45;
		c.isElegible=true;
		
		Election d=new Election();
		d.name="ajith";
		d.age=60;
		d.isElegible=true;
		
		Election[] e= {a,b,c,d};
		int max=18;
		String num=" ";
		
		for(int i=0; i<e.length; i++) {
			if(e[i].age>max) {
				max=e[i].age;
				num=e[i].name+num;
			System.out.println(e[i].name+" is eligible");
			
			}
			else {
				System.out.println(e[i].name+" is not eligible");	
			}
				
				
			}
		}
		
		
	}


