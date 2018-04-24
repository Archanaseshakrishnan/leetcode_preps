import java.util.HashMap;
import java.util.HashSet;

public class permutations_of_string_with_duplicates {
	static int fact(int num){
		int fact0=1;
		for(int i=1;i<=num;i++)
		fact0=fact0*i;
		return fact0;
	}
public static void main(String[] args){
	String input="1231";
	//HashMap hm = new HashMap();
	char[][] perm;
	char[] word;
	word = input.toCharArray();
	perm = new char[fact(input.length())][input.length()];
	int k,j,i,index1=0,index2=0,check=0;
	
	for(k=0;k<input.length();k++){
		index1=0;
		//perm[index1][index2]=word[k]; 
		for(i=0;i<(fact(input.length())/fact(input.length()-(k+1)));i++){
			for(j=0;j<fact(input.length()-(k+1));j++){
				while(perm[index1][index2] != '\0'){
					index2=(index2+1)%input.length();check++;
					if(check==input.length())break;
				}
				if(check!=input.length())
				perm[index1][index2]=word[k];
				
				check=0;index1++;
			}
			index2=(index2+1)%input.length();
		}
	}
	
	//HashSet<String> hs=new HashSet<String>();
	String word1="";
	HashSet<HashSet<Character>> hs2=new HashSet<HashSet<Character>>();
	HashSet<Character> hs3=new HashSet<Character>();
	for(int l=0;l<fact(input.length());l++){
		for(int m=0;m<input.length();m++)
			{//System.out.print(perm[l][m]);
			hs3.add(perm[l][m]);
			}
		/*hs.add(word1);
		word1="";*/
		hs2.add(hs3);
		System.out.println("");
	}
	
	/*HashMap<char[],char[]> hs=new HashMap<char[],char[]>();
	for(int l=0;l<fact(input.length());l++)
		hs.put(perm[l], perm[l]);
	for(int l=0;l<fact(input.length());l++)
	System.out.println(hs.toString());
	*/
	HashSet<String> hs=new HashSet<String>();
	
	for(int l=0;l<fact(input.length());l++){
		System.out.println(String.copyValueOf(perm[l]));
		hs.add(String.copyValueOf(perm[l]));
	}
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs3);
}
}
