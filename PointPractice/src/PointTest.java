
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point test=new Point(6,0);//creates point called test
Point test2=new Point(7,6);// creates point called test2
Point origin=new Point();//origin point
System.out.println(origin.getX());//prints the x value of the origin
System.out.println(origin.getY());//prints the y value of the origin
test.setX(5);//set a new x value for test
test.setY(2);//sets a new y value for test
System.out.println(test.getX());
System.out.println(test.getY());
test.setLocation(9, 7);//sets a new location for the x and y values for test
System.out.println(test.getX());
System.out.println(test.getY());
test.translate(1,3);//translates the test point 1 in the x and 3 in the y
System.out.println(test.getX());
System.out.println(test.getY());
//tests the distance between test and test2
System.out.println(test.distance(test2));

	}

}
