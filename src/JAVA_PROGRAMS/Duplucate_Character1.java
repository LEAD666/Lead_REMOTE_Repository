package JAVA_PROGRAMS;

import java.util.HashSet;
import java.util.Set;

public class Duplucate_Character1 {

	public static void main(String[] args) {
		String str="shashi";
		System.out.println(remove_Duplicate(str));
	}
		
		public static String remove_Duplicate(String str)
		{
			Set<Character>set=new HashSet<>();
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<=str.length();i++)
			{
				Character c=str.charAt(i);
				if(!set.contains(c))
				{
					set.add(c);
					sb.append(c);
				}
			}
			return sb.toString();
		}

	}


