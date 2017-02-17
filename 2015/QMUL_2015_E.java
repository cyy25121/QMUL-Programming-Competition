import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class QMUL_2015_E
{

	static String[][] WordsArr = new String[10000][2];
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Get number of occurences (it's a number, but convert is as string)
		//String WordOccurences = Integer.toString(in.nextInt());
		
		List<String, int> MainList
		
		/*
		
		// Skip non word characters (except hyphen and apostrophe)
		in.useDelimiter("[\\W&&[^'-]]+");
		int i = 0;
		// Read until EndOfText
		while(in.hasNext() && i < 10000)
		{
			String CurrentWord = in.next(); 
			if (CurrentWord.equals("EndOfText")) break;
			
			AddToArray(CurrentWord.toLowerCase());
			
			i++;
		}
		in.close();
		
		i = 0;
		String CurrWord = WordsArr[0][0];
		boolean FoundOccurence = false;
		while (CurrWord != null)
		{
			if (WordsArr[i][1].equals(WordOccurences))
			{
				FoundOccurence = true;
				System.out.println(CurrWord);
			}
			
			i++;
			CurrWord = WordsArr[i][0];
		}
		if (!FoundOccurence) System.out.println("There is no such word");
		*/
	}
	
	
	private static void AddToArray(String NewWord)
	{
		// The word can't be just hyphen or apostrophe
		if (NewWord.equals("-") || NewWord.equals("'")) return;
		
		boolean WordExists = false;
		int i=0;
		for(;i<10000 && WordsArr[i][0] != null;i++)
		{ 
			if (WordsArr[i][0].equals(NewWord))
			{
				WordExists = true;
				WordsArr[i][1] = Integer.toString(Integer.parseInt(WordsArr[i][1]) + 1);
			}
		}
		
		if (!WordExists && i < 10000)
		{
			WordsArr[i][0] = NewWord;
			WordsArr[i][1] = "1";
		}
	}

}
