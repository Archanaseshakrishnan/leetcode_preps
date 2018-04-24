import java.util.Arrays;
import java.util.Scanner;

public class Sentence_rotation {

	
	public static void main(String args[])
	{
	 String sentence; 
	 char[] char_array;
	 char temp;
	 int len;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		sentence = reader.nextLine();
		System.out.println("U wrote:" + sentence);
		len=sentence.length();
		System.out.println(len);
		char_array=new char[len];
		
		char_array=sentence.toCharArray();
		System.out.println(char_array);
		for(int i=0;i<(len/2);i++)
		{
			temp=char_array[i];
			char_array[i]=char_array[len-1-i];
			char_array[len-1-i]=temp;
		}
		
		System.out.println("Before rotation: " + sentence);
		//sentence=String.valueOf(char_array);
		System.out.println("After rotation: "+Arrays.toString(char_array));
		//System.out.println("After rotation: "+sentence);
		
		String s = "I want to walk my dog";

		 String[] arr = s.split(" ");    

		 for ( String ss : arr) {

		       System.out.println(ss);
		  }
	}
}

