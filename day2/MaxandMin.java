package week1.day2;

import java.util.Arrays;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {23,34,45,56,999};
Arrays.sort(nums);
System.out.println("the minimum value is :" + nums [0]);
System.out.println("the maximum value is :"+nums [nums.length-1]);
for(int i =0;i<nums.length;i++) {
	System.out.println(i);
}
	}
}

