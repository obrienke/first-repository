import java.util.Scanner;

public class Continue{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x = 0;
    int counter = 0;

    System.out.print("Please select a number 1 to 10: ");
    x = input.nextInt();

    while(counter < 10){
	  counter++;
	  if(counter == x){
	    continue;
	  }
	  System.out.println(counter);
	} 	
  }
}