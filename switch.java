import java.util.Scanner ;
public class main {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		
		//Switch Test Activity//

			System.out.println("Please choose between those Color Choices:");
		System.out.println("Red");
		System.out.println("Yellow");
		System.out.println("Green");
		System.out.println("Blue");
		System.out.println("Purple");
		String choice = input.next ();
		switch (choice){
		
		case "Red" :
			System.out.println ("You are an Angry Bird.");
			break;

		case "Yellow" :
			System.out.println("You are an Minion.");
			break;

		case "Green" :
			System.out.println("You are an Shriek.");
			break;

		case "Blue" :
			System.out.println("You are an Smurf.");
			break;

		case "Purple" :
			System.out.println("You are an Grimrace.");
			break;
		
			default :
			
			System.out.println ("That Color/Word wasn't even added onto this list;Imbecile.");
		
		}
		input.close();
	}
}