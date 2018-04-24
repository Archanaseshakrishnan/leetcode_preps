import java.util.ArrayList;
import java.util.HashMap;

public class Longest_common_prefix_google {
public static void main(String args[]){
	String[] listy={"global" , "glossary","lodaddy","glosg","glossary", "glossary"};
	int loop=0,i=0,j=0,count=1;
	//ArrayList<String> prefix=new ArrayList<String>();
	
	for(String word: listy){
		loop = loop + word.length(); 
	}
	System.out.println(loop);
	HashMap<String,Integer> hs=new HashMap<String,Integer>();
	String[] prefix=new String[loop];
	for(int k=0;k<loop;k++){
		prefix[k]="";
	}
	String max="";int maxi=-1;
	for(int count1=0;count1<loop;count1++){
		if(i<listy[j].length()){
		prefix[j]=prefix[j]+listy[j].charAt(i);
		System.out.print("count= "+count+" prefix= "+prefix[j]);
		System.out.print(" current value:"+hs.get(prefix[j]));
		if(hs.get(prefix[j])!=null){
			
			int sum=count+hs.get(prefix[j]);
			hs.put(prefix[j], sum);
			System.out.print(" changed value:"+hs.get(prefix[j]));
			if(maxi<=sum){
				maxi=sum;
				max=prefix[j];
			}
		}
		else
			{
			hs.put(prefix[j], count);
			/*if(maxi==-1)
			{maxi=count;
			max=prefix[j];
			}*/
			}
		System.out.println(" maxi= "+maxi+" max="+max);	
		j=(j+1)%listy.length;
		if(j==0)
			i++;
		}
	}
System.out.println(max);
System.out.println(maxi);
//System.out.println(trythis(listy));
}
public static String trythis(String[] words){
	
	HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
	String temp="";int index=0;String prefix="";
	ArrayList<String>  s=new ArrayList<String>();
	ArrayList<String> sample;
	int max=-1;
	for(int i=0;i<words.length;i++){
		temp="";
		System.out.println(i);
		for(int j=0;j<words[i].length();j++){
			char c=words[i].charAt(j);
			//System.out.println(c);
			temp = temp+c;
			//System.out.println(temp);
			if(hm.get(temp)==null){
				sample=new ArrayList<String> ();
				sample.add(words[i]);
				System.out.println(sample);
				hm.put(temp, sample);
				System.out.println(hm.get(temp));
				
			}else{
				sample = hm.get(temp);
				System.out.println(sample);
				
				sample.add(words[i]);
				hm.put(temp, sample);
				System.out.println(hm.get(temp));
			}
			s=hm.get(temp);
			int now=s.size();
			if(now>=max){
				max=now;
				prefix=temp;
			}
		}
		
	}
	//System.out.println(max);
	return prefix;
}
}

