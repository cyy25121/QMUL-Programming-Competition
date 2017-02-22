import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class QMUL_2016_A
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		List<String> LinksList = new ArrayList<String>();
		
		// read all text from input
		String AllText = in.nextLine();
		while(in.hasNext()) AllText += in.nextLine();
		in.close();
			
		// parse string
		for(int i=0;i<AllText.length();i++)
		{
			int LinkStartPos = AllText.indexOf(" href=\"", i);
			if (LinkStartPos > -1)
			{
				int LinkEndPos = AllText.indexOf("\"", LinkStartPos + 7);
				if (LinkEndPos < 0) LinkEndPos = AllText.length() - 1;
				
				LinksList.add(AllText.substring(LinkStartPos + 7, LinkEndPos));
				
				i = LinkEndPos + 1;
			}
			
		}
		
		// print links
		for(int i=0;i<LinksList.size();i++)
			System.out.println(LinksList.get(i));
	}
}
