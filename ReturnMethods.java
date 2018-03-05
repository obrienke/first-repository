public class ReturnMethods{

  public static void main(String[] args){
    ReturnMethods m = new ReturnMethods();
    int number = m.method1();	
    System.out.println("Method 3 returned "+number+" via method1 and method2");	
  }
  
  public int method1(){
    System.out.println("Method 1 here and I am calling method 2");
	return method2();
  }

  public int method2(){
    System.out.println("Hi Method1, from Method 2, I am calling method 3");
    return method3();
  }  
  
  public int method3(){
    System.out.println("Hi method 2, from method 3, tell method 1 I say hello.");
	return 5;
  }
  
}