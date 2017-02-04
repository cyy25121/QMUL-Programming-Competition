import java.lang.System;
import java.util.Scanner;
import java.lang.Math;

public class E {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		
		Boolean found = false;
		
		for(int idx = 1; idx <= s1.length(); idx++){
			if(Math.abs(s1.charAt(idx-1)-s2.charAt(idx-1)) != 19 && Math.abs(s1.charAt(idx-1)-s2.charAt(idx-1)) != 4 ){
				System.out.println("First error at position " + Integer.toString(idx));
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("No error detected");
		}

	}

}
