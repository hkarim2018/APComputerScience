public class Point {
//declares x and y as private
private int x;
private int y;
//constructor for the origin point
public Point() {
	x=0;
	y=0;
}
//constructor that creates a new point
public Point(int newX,int newY){
	x=newX;
	y=newY;
	}
//method that gets a X value 
public int getX() {
	return x;
	}
//method that gets a Y value
public int getY() {
	return y;
	}
//method that sets the X value
public void setX(int newX) {
	x=newX;
	}
//method that sets the Y value
public void setY(int newY) {
	y=newY;
	}
////method that sets the X and Y values
public void setLocation(int newX,int newY) {
	x=newX;
	y=newY;
	}
//translates the point
public void translate(int dx,int dy) {
	x+=dx;
	y+=dy;
	}
//gets the distance between two points
public double distance(Point p) {
	//creates a x value for a point
	int x2=p.getX();
	//creates a y value for a point 
	int y2=p.getY();
	//returns the distance
	return Math.sqrt(Math.pow((x-x2), 2)+Math.pow(y-y2, 2));
	}
}
