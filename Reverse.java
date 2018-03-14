import java.util.Scanner;

public class Reverse{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer (-1 to exit): ");
	int number = input.nextInt();
	
	while(number != -1){
	  System.out.println(number+" reversed is "+reverseDigits(number));
	  System.out.print("Enter an integer (-1 to exit): ");
	  number = input.nextInt();
	}
	
  }// end main
  
  public static int reverseDigits(int number){
    int reverseNumber = 0;
	int placeValue;
	
	while(number > 0){
	  placeValue = number % 10;
	  number /= 10;
	  reverseNumber = reverseNumber * 10 + placeValue;
	}
	return reverseNumber;
  } 
}