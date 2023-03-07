package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNumber = 1;
int secNumber = 2;
int sum = 1;
System.out.println(firstNumber);
System.out.println(secNumber);
for (int i =0;i<11;i++);


{
	sum = firstNumber+secNumber;
	System.out.println(sum);
	firstNumber = secNumber;
	secNumber = sum ;
}
	}

}
