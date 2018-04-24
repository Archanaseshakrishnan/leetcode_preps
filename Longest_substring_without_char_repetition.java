import java.util.HashSet;

public class Longest_substring_without_char_repetition {
public static void main(String args[]){
	HashSet hs = new HashSet();
	String input="bbbbb";
	char character;
	for(int i=0;i<input.length();i++){
	character=input.charAt(i);
	hs.add(character);
	}
	System.out.println(hs.size());
}
}
