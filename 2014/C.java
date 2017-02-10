import java.lang.System;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class C {
	
	public class data{
		int d, m, y;
		String name;
		
		public data(String n, int day, int month, int yr){
			d = day;
			m = month;
			y = yr;
			name = n;
		}
		
		public int getDay(){ return d;}
		public int getMonth(){ return m;}
		public int getYear(){ return y;}
		public String getName(){ return name;}
	}
	
	static class dataCom implements Comparator<data>{
		public int compare(data d1, data d2){
			if(d1.getYear() == d2.getYear()){
				if(d1.getMonth() == d2.getMonth()){
					if(d1.getDay() == d2.getDay()){
						String[] s1 = d1.getName().split(" ");
						String[] s2 = d2.getName().split(" ");
						return s1[s1.length-1].compareTo(s2[s2.length-1]);
					}
					else{
						return d1.getDay() - d2.getDay();
					}
				}
				else{
					return d1.getMonth() - d2.getMonth();
				}
			}
			else{
				return d1.getYear() - d2.getYear();
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern r = Pattern.compile("(.+), (\\d+)/(\\d+)/(\\d+)");
		List<data> phonebook = new ArrayList<data>();
		
		int n = Integer.valueOf(in.nextLine());
		
		for(int i = 0; i < n; i++){
			Matcher m = r.matcher(in.nextLine());
			if(m.matches()){
				C out = new C();
				data td = out.new data(m.group(1), Integer.valueOf(m.group(2)), Integer.valueOf(m.group(3)), Integer.valueOf(m.group(4)));
				phonebook.add(td);
			}
		}
		in.close();
		
		Collections.sort(phonebook, new dataCom());
		
		Iterator<data> itr = phonebook.iterator();
		
		while(itr.hasNext()){
			data td = itr.next();
			System.out.println(td.getName() + ", " + String.format("%02d", td.getDay()) + "/" + String.format("%02d", td.getMonth()) + "/" + String.format("%04d", td.getYear()));
		}

	}

}
