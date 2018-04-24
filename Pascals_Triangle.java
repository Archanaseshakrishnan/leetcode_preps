import java.util.ArrayList;
public class Pascals_Triangle {

public static void main(String args[]){
ArrayList<ArrayList<Integer>> q=new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> r=new ArrayList<Integer>();
ArrayList<Integer> rdup=new ArrayList<Integer>();
int i=0;int j=0;
int n=5;
for(i=0;i<n;i++){
	//System.out.println("i= "+i);
	for(j=0;j<=i;j++){
		if(j==0 || j==i){
			r.add(j,1);
			
		}
		else{
			//System.out.println("j="+j);
			int sum=0;
			rdup=q.get(i-1);
			//System.out.println("rdup= "+rdup);
			//System.out.println("previous "+rdup.get(j)+"--"+rdup.get(j-1));
			sum=rdup.get(j)+rdup.get(j-1);
			r.add(j,sum);
		}
		//System.out.println("j="+j+"r's value "+r.get(j));
		//System.out.println("----------------------------");
	}
	
	q.add(i,r);
	r=new ArrayList<Integer>();
}
System.out.println(q);
}
}