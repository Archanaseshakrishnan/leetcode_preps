import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class parantheses {
public static void main(String args[]){
	HashSet<String> combo=gen_param(6);
	//will output 2^((n/2)-1) combinations
	System.out.println(combo);
	
}
public static HashSet<String> gen_param(int n){
	ArrayList<String> result=new ArrayList<String>();
	HashMap<Integer,ArrayList<String>> hm=new HashMap<Integer,ArrayList<String>>();
	ArrayList<String> mynew=new ArrayList<String>();
	mynew.add("()");
	hm.put(2,mynew);
	ArrayList<String> mynew2=new ArrayList<String>();
	mynew2.add("()()");
	mynew2.add("(())");
	hm.put(4,mynew2);
	result=helper(n,hm);
	HashSet<String> hs=new HashSet<String>();
	for(String r:result){
		hs.add(r);
	}
	return hs;
}
private static ArrayList<String> helper(int n, HashMap<Integer, ArrayList<String>> hm) {
	// TODO Auto-generated method stub
	
	ArrayList<String> getnew=new ArrayList<String>();
	getnew=hm.get(n);
	System.out.println(getnew);
	String word1="";
	String word2="";
	if(getnew==null){
		System.out.println("yes");
		for(int i=0;i<n/2;i++)
			word1+='(';
		for(int i=0;i<n/2;i++)
			word1+=')';
		System.out.println(word1);
		getnew=new ArrayList<String>();
		getnew.add(word1);
		word1="";
		for(int i=2;i<n;i+=2){
			ArrayList<String> get1=hm.get(i);
			//word1=hm.get(i);
			if(get1==null){
				get1=new ArrayList<String>();
				get1=helper(i,hm);
			}
			ArrayList<String> get2=hm.get(n-i);
			//word1=hm.get(i);
			if(get2==null){
				get2=new ArrayList<String>();
				get2=helper(n-i,hm);
			}
			for(int j=0;j<get1.size();j++){
				word1=get1.get(j);
				for(int k=0;k<get2.size();k++){
					word2=get2.get(k);
					getnew.add(word1+word2);
				}
			}
			
		}
	}
	return getnew;
}

}
