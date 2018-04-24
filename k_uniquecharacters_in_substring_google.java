import java.util.HashSet;

public class k_uniquecharacters_in_substring_google {
public static void main(String args[]){
	String my_word = "abac";
	String new_one="",new_one_final = "";
	int i=0,j,k,l=0;
	k=2;
	char Character1;
	int count=0,min=-1;
	HashSet<Character> hs=new HashSet<Character>();
	
		
		for(j=i;j<my_word.length();j++){
			Character1=my_word.charAt(j);
			
				hs.add(Character1);
				l=hs.size();
				if(l<=k){
					new_one=new_one+Character1;
				//System.out.println(l);
				count++;
			}
			else{
				
				if(min<count){
				min=count;
				new_one_final=new_one;
				new_one="";
			}count=0;
				if(j==my_word.length()){
					break;
				}
				else
				{
					l=0;i++;j=i-1;hs.clear();
				}
				}
				
			}
		if(count==my_word.length() && hs.size()==k){
			new_one_final = my_word;
		}
		System.out.println(new_one_final);
		//System.out.println(min);
		}
	
}

