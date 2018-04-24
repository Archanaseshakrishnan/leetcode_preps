
public class check_if_palindrome {
public static void main(String args[]){
	System.out.println(pal("mad"));
}
public static boolean pal(String word1){
	String s=new StringBuilder(word1).reverse().toString();
	if(s.equals(word1))
		return true;
	else
	return false;
}
}
