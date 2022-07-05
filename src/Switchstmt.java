import java.util.*;
public class Switchstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String  s=  sc.nextLine();
		switch (s) {
		  case "A":
		    System.out.println("Monday");
		    break;
		  case "B":
		    System.out.println("Tuesday");
		    break;
		  case "C":
		    System.out.println("Wednesday");
		    break;
		  case "D":
		    System.out.println("Thursday");
		    break;
		  case "e":
		    System.out.println("Friday");
		    break;
		  case "f":
		    System.out.println("Saturday");
		    break;
		  case "g":
		    System.out.println("Sunday");
		    break;
		}
		// Outputs "Thursday" (day 4)



	}

}
