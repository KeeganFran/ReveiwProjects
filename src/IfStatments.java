import java.util.ArrayList;
import java.util.Scanner;

public class IfStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fv = new Scanner(System.in);
		System.out.println("Give a numer to count up to");
		int M = fv.nextInt();
		ArrayList<String> thing = new ArrayList<String>(M);
		for ( int i =1; i <= M; i++) {
			if(i%3==0 && i%5==0)
			{
				thing.add("FizzBuzz");
			}
			else if(i%3==0)
			{
				thing.add("Fizz");
			}
			else if(i%5==0)
			{
				thing.add("Buzz");
			}
			else {
				
				String s2=Integer.toString(i);
				thing.add(s2);
			}
		}
		System.out.println(thing);
		fv.close();
	
	}
}
