/*Fight Song
 * Hussein Karim
 * Prints Fight Song Chant
 */
public class FightSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro(); //plays first paragraph
		middleSection(); //plays middle two paragraphs
		combinedIntro(); //plays last paragraph
		//I pushed this to git
	}
	//combines first two lines
public static void combinedIntro(){
	goTeamGo();
	youCanDoIt();
}
//combines middle paragraphs
public static void middleSection(){
	middleChunk();
	middleChunk();
}
// second paragraph
public static void middleChunk(){
	combinedIntro();
	combinedMiddle();
	combinedIntro();
	newLine();
}
//combines middle two lines in the middle paragraph
public static void combinedMiddle(){
	youreTheBest();
	inTheWest();
}
//prints go team go
public static void goTeamGo(){
	System.out.println("Go team go!");
}
//prints you can do it
public static void youCanDoIt(){
	System.out.println("You can do it.");
}
// prints intro in a different way
public static void intro(){
	System.out.println("Go team go!\nYou can do it.");
	newLine();
}
	//prints your the best
public static void youreTheBest(){
	System.out.println("You're the best,");
}
//prints in the west
public static void inTheWest(){
	System.out.println("In the West.");

}
//prints new line
public static void newLine(){
	System.out.println("\n");
}
}
