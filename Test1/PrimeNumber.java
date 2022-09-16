package Test1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=15;
		String isPrime=" ";
		for (int i=2; i<a; i++) {
			if(a%i==0) {
				isPrime ="yes";
			}
		}
		if (isPrime.equals("yes")) {
			System.out.println("not prime");
			
		}
		else {
			System.out.println("prime");
		}
	}
}


