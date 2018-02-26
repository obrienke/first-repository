import java.util.Scanner;

public class Sales{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	double total = 0;
	int productId;

	System.out.print("Please enter a product number (0 to stop): ");
	productId = input.nextInt();

	while(productId != 0){

	  if(productId >= 1 && productId <= 5){
	    System.out.print("Enter quantity sold: ");
	    int quantity = input.nextInt();

	    switch(productId){
	      case 1:
		    total += quantity * 2.98;
		    break;
	      case 2:
		    total += quantity * 4.50;
		    break;
	      case 3:
		    total += quantity * 9.98;
		    break;
	      case 4:
		    total += quantity * 4.49;
		    break;
	      case 5:
		    total += quantity * 6.87;
		    break;
	    }
	  }else if(productId != 0)
	    System.out.println("ProductId must be 1 to 5");

	  System.out.print("Please enter a product number (0 to stop): ");
	  productId = input.nextInt();
	}
	System.out.print("Total of products sold is: ");
	System.out.println(Math.round(total*10000.0/10000.0));
  }
}