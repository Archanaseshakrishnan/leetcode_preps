
public class Length_of_last_word {
	//have to ask if tabs are to be included in the cases
public static void main(String args[]){
	String sentence=" g		";
	int count=0;
	for(int i=sentence.length()-1;i>=0;i--){
		if(sentence.charAt(i)!=' '){
			count++;
		}
		else 
			break;
	}
	System.out.println(count);
}
}
