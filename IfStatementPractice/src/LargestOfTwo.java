/*Hussein Karim
 * IfStatementPractice
 * FOur methods using if methods
 */
public class LargestOfTwo {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(greaterThan(-3,5));//calls greater than method
System.out.println(projectFourOneDivision(6,6));//divides two numbers
System.out.println(projectFourOneRemainder(6,6));//divides two numbers and outputs the remainder
System.out.println("Your triangle is a right triangle: " +projectFourTwo(3,4,5));//three sides input, outputs if righ triangle
System.out.println("Your cost is: " +projectFourThree(2.0));// input length of call, outputs the  cost
	}
	//greater than method
public static int greaterThan(int a, int b){
if (a>b){
	return a;
}else{
	return b;
	
}
	
	
}
public static int projectFourOneDivision(int num1,int num2){
	if (num1>=num2){// checks to see if one num is the bigger one.
		return num1/num2; 
	} else {
	return num2/num1;// divides other number
	}
}
//smae as above expect module.
	public static int projectFourOneRemainder(int num1,int num2){
		if (num1>=num2){
			return num1%num2; 
		} else {
		return num2%num1;
		}
}
	//checks to see if three sides make up a right triangle
	public static boolean projectFourTwo (int length1, int length2, int length3){
		if (length1*length1 + length2*length2==length3*length3){
			return true;
		} else {
			return false;
		
		}
	}
	//inputs the length of call, outputs the price of call
	public static double projectFourThree(double length){
		if(length<=2.0){
			return length=1.15;
	} else {
		return 1.15+(length-2)*.50;
	}
}
}

