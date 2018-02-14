import java.util.Scanner;

public class Graphs{
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num1 = input.nextInt();
	System.out.print("Enter a number: ");
	int num2 = input.nextInt();
	System.out.print("Enter a number: ");
	int num3 = input.nextInt();
	System.out.print("Enter a number: ");
	int num4 = input.nextInt();
	System.out.print("Enter a number: ");
	int num5 = input.nextInt();	
  
    int val = 0;
	
	for(int counter = 1; counter <= 5; counter++){
	  switch(counter){
	    case 1:
          val = num1;
          break;
 	    case 2:
          val = num2;
          break;
	    case 3:
          val = num3;
          break;
	    case 4:
          val = num4;
          break;
	    case 5:
          val = num5;
          break; 
        default:
          System.out.println("There is a problem!!");		
		  
	  }	
	  
      for(int j = 1; j <= val; j++)
        System.out.print("*");	

      System.out.println(); 		
	}//end for
  }
}