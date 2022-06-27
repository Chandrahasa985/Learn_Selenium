package tables;

public class Fibonacci {

	public static void main(String[] args) {


		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print("First 10 Fibonacci Numbers are 0 1");
		
		int count = 0;
		for(int i =3; i<=10; i++) {
			c=a+b;
			a= b;
			b=c;
			
			if(c>0) {
				count++;
			}
			//System.out.print(" "+c+" ");
			//if(count==7) {
				System.out.print(" "+c+" ");
			//}
			
		 
			
		}

	}

}
