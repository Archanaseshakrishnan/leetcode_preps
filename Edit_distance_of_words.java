
public class Edit_distance_of_words {
public static void main(String args[]){
	System.out.println(edit_dist("ca","bat"));
}
public static boolean edit_dist(String word1, String word2){
	int len1 = word1.length();
	int len2 = word2.length();
	int count=0;
	if(Math.abs(len2-len1)>=2){
		return false;
	}
	else{//modification is okay
		if (len1==len2){
			for(int i=0;i<len2;i++){
				if(word1.charAt(i)!=word2.charAt(i)){
					count++;
				}
			}
		}
		else{
			//addition and deletion literally same
			int prev=0;
			int min = 0,chk=0;
			if(len1>len2){
				min=len2;
				chk=1;
			}
			else if(len2>len1){
				min=len1;chk=2;
			}
			int j=0;
			int i=0;
			while(i<min){
				if(word1.charAt(i)!=word2.charAt(j))
					{
					if(chk==2){
						j++;prev=i;
					}
					else
						{i++;prev=j;}
					if(chk==2){
						
						if(word2.charAt(j)!=word1.charAt(prev)){
							return false;
						}
					}
					else{if(word2.charAt(prev)!=word1.charAt(i)){
						return false;
					}
						
					}
					}
				
				j++;i++;
			}
			if(i==min)
				return true;
				
		}
	}
	if(count>1)
		return false;
	else 
		return true;
}
}
