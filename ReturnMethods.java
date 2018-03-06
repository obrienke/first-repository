public class ReturnMethods{

  public static void main(String[] args){
    ReturnMethods methods = new ReturnMethods();
	System.out.println("Value returned: "+methods.method1());
	//Index.main(null);
  }

  public int method1(){
    System.out.println("Method 1 here, I am calling method2.");
	return method2();
  }
  public int method2(){
    System.out.println("Hi method1, from method2, I am calling method3.");
	return method3();
	//System.out.println("Method3 says hello to you method1.");
  }
  public int method3(){
    System.out.println("Hi method2, from method3, tell method1 I say hello.");
    return 5;
  }

}