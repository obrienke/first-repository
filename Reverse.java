import java.util.Scanner;

public class Reverse{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number (-1 to quit): ");
	int number = input.nextInt();
	
	while(number != -1){
	  System.out.println(number+" reversed is "+reverseDigits(number));
      System.out.print("Enter a number (-1 to quit): ");
	  number = input.nextInt();  
	}
	Index.main(null);
  }
  
  public static int reverseDigits(int number){
    int reverseNumber = 0; // the number in reverse order
	int placeValue; // the value at the current place
	
	while(number > 0){
	  placeValue = number % 10;
	  number = number / 10;
	  reverseNumber = reverseNumber * 10 + placeValue;
	}	
	return reverseNumber;
  }
}