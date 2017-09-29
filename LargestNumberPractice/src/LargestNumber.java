import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int greatestValue(int num1, int num2, int num3){
		int max1;
		int max2;
		max1=Math.max(num1, num2);
		max2=Math.max(max1,num3);
		return max2;
	}
}
