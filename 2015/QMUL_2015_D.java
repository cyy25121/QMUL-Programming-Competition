import java.lang.System;
import java.util.Scanner;

public class QMUL_2015_D
{

	static int[] FNumbersArr = new int[]{2,3,5,7};
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Get the number
		int n = in.nextInt();
		in.close();
		
		//System.out.println("The number is " + (isDecentNum(n)?"Decent":"Not Decent"));
		
		int i = 1;
		int num = 1;
		while(i < n)
		{
			num++;
			if (isDecentNum(num)) i++;
		}
		
		String NumStr = Integer.toString(n);
		switch(n)
		{
			case 1: NumStr += "st"; break;
			case 2: NumStr += "nd"; break;
			case 3: NumStr += "rd"; break;
			default: NumStr += "th"; break;
		}
		
		System.out.println("The " + NumStr + " decent number is "+Integer.toString(num));
	}
	
	private static boolean isDecentNum(int num)
	{
		if (num == 1) return true;
		
		for(int i=0;i<FNumbersArr.length;i++)
		{
			if (num % FNumbersArr[i] == 0)
				return isDecentNum(num / FNumbersArr[i]);
		}
		
		return false;
	}

}
