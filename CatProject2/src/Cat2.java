
public class Cat2 {
//instance variables go here(aka attributes)
//need age
private int age;
//need name
private String name;
//constructor method called when he create a new instance of an object 
public Cat2(int newAge, String newName){
	age=newAge;
	name=newName;
	
	}

//behaviors go here 
public void meow(){
	System.out.println("Meow! I'm "+name);
	}
}