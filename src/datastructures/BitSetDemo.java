package datastructures;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {

		
		BitSet b1= new BitSet(16);
		BitSet b2= new BitSet(16);
		
		System.out.println(b1);
		
		for(int i=0;i<16;i++)
		{
			if((i%2) == 0) b1.set(i);
	        if((i%5) != 0) b2.set(i);			
		}

		System.out.println(b1);
		System.out.println(b2);
		
		// AND bits
	     b2.and(b1);
	     System.out.println("\nbits2 AND bits1: ");
	     System.out.println(b2);


	}

}
