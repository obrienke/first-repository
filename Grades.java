import java.util.Scanner;

public class Grades{
  public static void main(String[] args){
    float ex1, ex2, ex3, avg;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Exam 1 score: ");
	ex1 = input.nextFloat();
	System.out.print("Exam 2 score: ");
	ex2 = input.nextFloat();
	System.out.print("Exam 3 score: ");
	ex3 = input.nextFloat();
	
	avg = (ex1 + ex2 + ex3)/3;

	if(avg >= 90) 
	  System.out.println("A");
	else if (avg >= 70 && avg < 90)
	  System.out.println("B");
	else if (avg >= 50 && avg < 70)
	  System.out.println("C");
	else if (avg < 50)
	  System.out.println("F");
	else
      System.out.println("Invalid grade");	
  }
}