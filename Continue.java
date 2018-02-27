import java.util.Scanner;

public class Continue{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int counter = 0;
	int x = 0;
	
	System.out.println("Please enter a number (1 to 10): ");
	x = input.nextInt();
	
	while(counter < 10){
      counter++;
      if(x == counter){
	    continue;
	  }	  
	  System.out.println(counter);
	}
  }
}