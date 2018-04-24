import java.util.Scanner;

public class String_to_int {
public static void main(String args[]){
	String a;
	int deci, frac=0,flag=0,len;
	System.out.println("Enter string for conversion");
	Scanner reader=new Scanner(System.in);
	a=reader.nextLine();
	System.out.println("The converted number is: ");
	len=a.length();
	for(int i=0;i<len;i++){
		if(a.charAt(i)=='.'){
			frac=1;
		}
	}
	if(frac==1)
		System.out.println(Double.parseDouble(a));
	else
	System.out.println(Integer.parseInt(a));
}
}
