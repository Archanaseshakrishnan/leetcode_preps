import java.util.ArrayList;

public class Combinations_numbers {
public static void main(String args[]){
	System.out.println(combo(4,2));
}
public static ArrayList<ArrayList<Integer>> combo(int n, int k){
	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	for(int i=1;i<=n;i++){
		for(int j=i+1;j<=n;j++)
		{
			ArrayList<Integer> temp=new ArrayList<Integer>();
			temp.add(i);
			temp.add(j);
			result.add(temp);
		}
	}
	return result;
}
}
