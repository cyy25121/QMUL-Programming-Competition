/*
 * 	Breaking Death Star Encryption
 */

import java.util.Scanner;

public class QMUL_2016_B {

	static int codeword = 0b01101110;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputS = "";
		int i = 0;
		while(in.hasNext()){
			if(i == 8){
				int t = Integer.parseInt(inputS, 2);
				System.out.println(Integer.toString(t ^ codeword));
				i = 0;
				inputS = "";
			}
			inputS += in.next();
			System.out.println(inputS);
			i++;
		}
	}

}
