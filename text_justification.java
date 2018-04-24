import java.util.ArrayList;
import java.util.HashSet;

public class text_justification {
public static void main(String args[]){
	String[] words={"This", "is", "an", "example", "of", "text", "justification."};
	ArrayList<String> res=text_just(words, 4);
	for(String s:res)
		System.out.println(s);
}
public static ArrayList<String> text_just(String[] words, int len){
	String sentence="";
	int charlen=0,sum=0;
	int spaces=words.length-1;
	ArrayList<Integer> pos_space=new ArrayList<Integer>();
	int i;
	for (String word:words){
		charlen=charlen+word.length();
		
		sentence=sentence+word+" ";
		if(pos_space.isEmpty())
		{pos_space.add(charlen);sum=charlen;}
		else{
			if(word.length()<len)
			{sum=sum+word.length()+1;
			pos_space.add(sum);}
			else{
				//sum=sum+len;
				pos_space.add(sum+len);
				sum=sum+word.length()+1;
				pos_space.add(sum);
			}
		}
			
	}
	pos_space.remove(pos_space.size()-1);
	System.out.println(pos_space);
	ArrayList<String> result=new ArrayList<String>();
	int j=0;
	
	while(j<sentence.length())
	{	System.out.println(j);
		String now="";
	if(j+len<sentence.length()-1)
	{	
		if(pos_space.contains(j+len))
		{
			now=sentence.substring(j, j+len);j=j+len+1;}
		else{
			//char c=sentence.charAt();
			int min=999999999;
			for (Integer hi:pos_space){
				if((Math.abs(hi-j-len)<min) && (hi-j-len)<0)
					{//System.out.println("true");
					min=Math.abs(hi-j-len);
					//System.out.println(min);
					}
			}
			
			now=sentence.substring(j, j+len-min);j=j+len-min+1;
			
				//{now =sentence.substring(j,j+len);j=j+len;}
		}
	}
	else
		{now=sentence.substring(j,sentence.length());
		j=sentence.length();
		}
	
		result.add(now);
		System.out.println(result);
	}
	return result;
}
}
