import java.lang.System;
import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		in.close();
		
		int sum = 0;
		
		while(n > 0){
			sum += n % 10;
			n /= 10;
		}
		
		System.out.println(sum);
		
	}

}
