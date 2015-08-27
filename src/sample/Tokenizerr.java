package sample;

import java.util.StringTokenizer;

public class Tokenizerr {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1,2,3,4";
		StringTokenizer st = new StringTokenizer(str,",");
 Integer s1=0;
String s2=null;
		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			s1=s1+(Integer)st.nextElement();
			
		}
  System.out.println("s1: "+s1);
		System.out.println("---- Split by comma ',' ------");
		StringTokenizer st2 = new StringTokenizer(str, ",");
 
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}

	}

}
