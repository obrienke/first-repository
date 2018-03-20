public class TwoD_Array{
  public static void main(String[] args){
    int[][] x = {{1,2},{3,4}};
	
	System.out.println("Using Enhanced for");
	for(int[] i: x){
	  for(int j: i)
	    System.out.println(j);
	}
	
	System.out.println();
	
	System.out.println("Not using Enhanced for");
	for(int i = 0; i < x.length; i++){
	  for(int j = 0; j < x[i].length; j++)
	    System.out.println(x[i][j]);
	}
	
  }
}