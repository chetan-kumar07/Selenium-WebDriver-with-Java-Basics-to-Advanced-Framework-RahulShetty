import java.util.*;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum=5;
		String website="Chetan Kumar";
		char letter='C';
		double dec=5.99;
		boolean myCard=true;
		System.out.println(myNum+" Number");
		System.out.println(website);
		
		//Arrays
		
		int [] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int [] arr2= {1,2,3,4,5,7,8,10};
		System.out.println(arr2[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		String [] name = {"Chetan", "Kumar","udemy"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		for(String s: name) {
			System.out.println(s);
		}
		System.out.println("*************");
		// When we define a Array, Then there is a disadvantage that we can't increase the size of an Array. So, we use the concept of ArrayList
		// ArrayList grows dynamically. We can't define the size in it.   
		List<String> al=new ArrayList<String>();
		al.add("CoreJava");
		al.add("Selenium");
		al.add("Ranorex");
		
		System.out.println(al);
		System.out.println(al.get(1));
			
		al.remove(2);
		System.out.println(al);
		//Item's is present in ArrayList
		List<String> nameArrayList=Arrays.asList(name);
		System.out.println(al.contains("Selenium"));
		System.out.println(nameArrayList.contains("Selenium"));
	}
}
