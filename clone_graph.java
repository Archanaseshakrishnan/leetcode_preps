import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class clone_graph {
//Sample input={0,1,2#1,2#2,2}
	
	public static void main(String args[]){
		Queue<Character> q = new LinkedList<Character>();
		ArrayList<Queue<Character>> adjlist=new ArrayList<Queue<Character>>();
		String input="{0,1,2#1,2#2,2}";
		char[] temp=input.toCharArray();
		int len=temp.length;
		int count=0;
		//System.out.println(len);
		for(int i=0;i<len;i++){
			
			if(temp[i]=='{' || temp[i]=='[' || temp[i]==']'){
				//do nothing
			}
			else if(temp[i]==','){
				//do nothing
			}
			else if( temp[i]=='}'){
				//System.out.println(q);
				adjlist.add((LinkedList) q);
				//System.out.println(adjlist);
				q = new LinkedList<Character>();
				//q.clear();
				//System.out.println(q);
				count++;
			}
			else if(temp[i]=='#'){
				//System.out.println(q);
				adjlist.add((LinkedList) q);
				//System.out.println(adjlist);
				q = new LinkedList<Character>();
				//q.clear();
				//System.out.println(q);
				count++;
			}
			else{
				if(q.contains(temp[i]))
				{//System.out.println("true="+temp[i]+"="+i);
					}
				
				else
				{q.add(temp[i]);}
			}
			
		}
		
		System.out.println("final"+adjlist+"- count= "+count);
		char source='0';
		boolean[] vis=new boolean[count];
		for(int i=0;i<count;i++)
			vis[i]=false;
		Queue<Character> q3=new LinkedList<Character>();
		q3.add(source);
		bfs(adjlist,q3,vis,count);
		
	}

	private static void bfs(ArrayList<Queue<Character>> al, Queue<Character> q3,boolean[] vis,int count) {
		// TODO Auto-generated method stub
		System.out.println("yes");
		Queue<Character> q2=new LinkedList<Character>();
		//Queue<Character> q3=new LinkedList<Character>();
		int i=0;
		while(i<count){
		q2=al.get(i);
		//System.out.println(q2.peek());
		if(vis[Character.getNumericValue(q3.peek())]==false){
			//System.out.println("yes");
		if(q2.peek()==q3.peek()){
			//System.out.println("yes");
			vis[Character.getNumericValue(q3.peek())]=true;
			//System.out.println(vis[0]);
			System.out.println(q3.poll());
			for(Character c : q2){
				q3.add(c);
			}
			q3.remove();
			System.out.println(q3);
			break;
			//System.out.println(q3);	
		}
		}
		else
		i++;
		}
		int j;
		for(j=0;j<count;j++){
			System.out.println(vis[j]);
			System.out.println(j);
			if(vis[j]!=true)
				break;
		}
		if(j!=count)
			{System.out.println("yes");
			bfs(al,q3,vis,count);}
	}
}
