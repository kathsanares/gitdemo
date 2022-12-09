
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is an object that represents the sequence of characters
		//String literal
//		String s= "Rahul Shetty Academy";
	//	String s1= "Rahul Shetty Academy";
		String s5= "hello";
		
		//String new
		String s2= new String ("Welcome"); 
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i = s.length()-1; i>=0; i--)
		{
		System.out.println(s.charAt(i));
		}
		
	}

}
