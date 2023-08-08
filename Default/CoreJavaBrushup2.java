
public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object that represents sequence of character.
		//We can define the string in 2-ways (i) String Literal (ii) New memory allocate operator
		// --> String Literal
		String s="Chetan Kumar";
		String s1="Chetan Kumar";
		
		// --> New
		String s2=new String ("Welcome");
		String s3=new String ("Welcome");
	
		String kk="Chetan Kumar Academy";
		String [] splittedString =kk.split("Kumar");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());	// trim all the left and right spaces.
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		//Logic for Reversing an String
		for(int i=s.length()-1;i>=0;i--) {
			 System.out.print(s.charAt(i)+" ");
		}
		
	}
}
