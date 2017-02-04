import java.lang.System;
import java.util.Scanner;

public class A {

	static int[] anArray = new int[65535];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			anArray[i] = in.nextInt();
		}
		in.close();
		
		Boolean swapped = true;
		int swaps = 0;
		int scans = 0;
		while(swapped){
			swapped = false;
			for(int i = 0; i < n-1; i++){
				if(anArray[i] > anArray[i+1]){
					int t = anArray[i];
					anArray[i] = anArray[i+1];
					anArray[i+1] = t;
					swapped = true;
					swaps++;
				}
			}
			scans++;
		}
		System.out.println("Scans: " + Integer.toString(scans-1));
		System.out.println("Total swaps: " + Integer.toString(swaps));
	}

}
