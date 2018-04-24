import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Lettercombo_of_phonenumber {
	
public static void main(String args[]){
	System.out.println(lettercombo("234"));
	//lettercombo("23");
}
public static ArrayList<String> lettercombo(String number){
	number=new StringBuilder(number).reverse().toString();
	int n=Integer.parseInt(number);
	int[][] adj;
	int len=0;
	HashMap<Integer,String> hs=new HashMap<Integer,String>();
	hs.put(2, "abc");
	hs.put(3, "def");
	hs.put(4, "ghi");
	hs.put(5, "jkl");
	hs.put(6, "mno");
	hs.put(7, "pqrs");
	hs.put(8, "tuv");
	hs.put(9, "wxyz");
	hs.put(1, "");
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	HashMap<Integer, Character> hm2=new HashMap<Integer, Character>();
	/*hm.put('\0',len);
	hm2.put(len,'\0');*/
	//len++;
	//forming the two hashes
	
	for(int i=n;i!=0;i=i/10){
		int num=i%10;
		String temp=hs.get(num);
		System.out.println("temp: "+temp);
		for(int j=0;j<temp.length();j++)
		{
			hm.put(temp.charAt(j),len);
			System.out.println(hm);
			hm2.put(len, temp.charAt(j));
			System.out.println(hm2);
			len++;
		}
	}
	
	adj=new int[len][len];

	ArrayList<Integer> prev=new ArrayList<Integer>();
	ArrayList<Integer> src=new ArrayList<Integer>();
	for(int i=n;i!=0;i=i/10){
		int num=i%10;
		String temp=hs.get(num);
		if(i==n){
			for(int j=0;j<temp.length();j++)
			{
				prev.add(hm.get(temp.charAt(j)));
				src.add(hm.get(temp.charAt(j)));
			}
		}
		else{
			for(int j=0;j<prev.size();j++){
				for(int k=0;k<temp.length();k++)
					adj[j][hm.get(temp.charAt(k))]=1;
			}
			for(int k=0;k<temp.length();k++)
				prev.add(hm.get(temp.charAt(k)));
		}
	}
	for(int i=0;i<len;i++)
		{
		for(int j=0;j<len;j++)
			{
			System.out.print(" ");
			System.out.print(adj[i][j]);
			}
		System.out.println(" ");
		}
	ArrayList<Character> now=new ArrayList<Character>();
	ArrayList<String> resu=new ArrayList<String>();
	ArrayList<String> result=new ArrayList<String>();
	int[] visited=new int[len];
	int[] visitedorig=new int[len];
	System.out.println(src);
	for(int i=0;i<src.size();i++)
		{
		//stack=new Stack<Integer>();
		dfs(adj,len,src.get(i),visited,now,hm,hm2.get(src.get(i)),hm2,resu);
		System.out.println(resu);
		visited=new int[len];
		for(int l=0;l<resu.size();l++)
			result.add(resu.get(l));
		resu=new ArrayList<String>();
		now=new ArrayList<Character>();;
		//result.add(now);
		}
	return result;
}
public static void dfs(int[][] adj,int len,int src,int[] visited, ArrayList<Character> res, HashMap<Character,Integer> hm,Character srcchar,HashMap<Integer, Character> hm2,ArrayList<String> resu){
	//System.out.println("here "+String.valueOf(src));
	res.add(hm2.get(src));
	visited[src]=1;
	
	 for(int j=0;j<len;j++)
	 {  if(visited[j]==0 && adj[src][j]==1)
	           {
	            System.out.println("src: "+String.valueOf(j));
	            srcchar=hm2.get(j);
	    	   	dfs(adj,len,j,visited,res,hm,srcchar,hm2,resu);
	    	   	String temp="";
	    	   	for(int l=0;l<res.size();l++)
	    	   		temp=temp+res.get(l);
	    	   	System.out.println(temp);
	    	   	resu.add(temp);
	    //	 	System.out.println(resu);
	    	 	res=new ArrayList<Character>();
	    	 	res.add(hm2.get(src));
	    	   	}
	 //res=new ArrayList<Character>();
	 }
}
}
