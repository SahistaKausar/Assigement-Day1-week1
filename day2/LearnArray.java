package week1.day2;

import java.util.Arrays;

public class LearnArray {

	private static final char[][] scores = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] scores = {20,40,30,10,50,};
Arrays.sort(scores);
int len = scores.length;
System.out.println ("the length of this array is : " +len);
	
for (int i= 0; i<len; i++)
{
	System.out.println(scores[i]);
}
}
}
