// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-7):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
	System.out.println("4. Shadowing");
	System.out.println("5. Overloading");	
	System.out.println("6. First Array");
    System.out.println("7. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
      case 3:
        System.out.println("Methods lab");
        System.out.println();
        Methods.main(null);
        break;
      case 4:
        System.out.println("Shadowing lab exercise");
        System.out.println();
        Shadow.main(null);
        break;
      case 5:
        System.out.println("Overloading lab exercise");
        System.out.println();
        Arithmetic.main(null);
        break;
      case 6:
        System.out.println("First Array lab exercise");
        System.out.println();
        FirstArray.main(null);
        break;		
	  case 7:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}