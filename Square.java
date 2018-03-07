import java.util.Scanner;

public class Square{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter square size: ");
	int size = input.nextInt();
	
	squareOfAsterisks(size);

  }//end main
  
  public static void squareOfAsterisks(int size){
    for(int row = 1; row <= size; row++){
	  for(int col = 1; col <= size; col++)
	    System.out.print("*");
	
	  System.out.println();
	}  	
  }  
}
