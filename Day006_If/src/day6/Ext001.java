package day6;

public class Ext001 {
	public static void main (String[] args) {
		System.out.println(		16<<3	); //128 16 * 2^3 = 16*8 = 128
		System.out.println(		16>>3	); //2	 16/(2^3) = 16/8 = 2
		
		// 1bit => 0, 1 (있다, 없다)
		// 2bit => (0,1)(0,1) => 2^2 = 4 => 00 01 10 11 경우의수
		// 3bit => (0,1)(0,1)(0,1) => 2^3=8	=> 000 001 010 011 100 101 110 111
		// 8bit => 1byte
		//  1	2	4	8	16	 32	 64	128	256
		// 2^0 2^1 2^2 2^3  2^4 2^5 2^6 2^7 2^8
		// 256 128	64	32	16	8	4	2	1
		// 2^8 2^7	2^6	2^5	2^4	2^3	2^2	2^1	2^0
		// <<(곱하기)					 (나누기)>>
		//						16>>3
		
		//Q1)		3<<2
		System.out.println( 3<<2 ); // [1] 12
		// 3*2^2 = 12
		//Q2 [p91]
		// 
		int x = 2;
		System.out.println( 1+x << 33 ); // [2] 6
		// 1+2 << 33
		// 3 << 33 = 3 * 2^33 = 141,733,920,768
		// int는 4byte 4*8=32 32번 but 여기는 33번해달래요. 다시 처음으로..
		// 3 << 1 	3*2^1 = 6
		
	}

}
