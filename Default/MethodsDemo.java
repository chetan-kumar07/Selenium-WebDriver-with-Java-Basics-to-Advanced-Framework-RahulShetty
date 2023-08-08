
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo obj=new MethodsDemo();
		  String name=obj.getData();
		  System.out.println(name);
		   
		MethodsDemo2 obj2=new MethodsDemo2();
		obj2.getUserData();
		getData2();
	}
	
	
	public String getData() {  
		System.out.println("Hello World");
		return "Chetan Kumar";
	}
	
	public static String getData2() {	//If we marked method as static them method belongs to class not object.
		System.out.println("Hello World");
		return "Chetan Kumar";
	}
}
