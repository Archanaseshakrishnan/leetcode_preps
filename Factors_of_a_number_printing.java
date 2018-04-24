import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Factors_of_a_number_printing {
 public static void main(String args[]){
	 System.out.println(fac_fun(16));
 }
 public static HashSet<ArrayList<Integer>> fac_fun(int n){
	 HashSet<ArrayList<Integer>> result=new HashSet<ArrayList<Integer>>();
	 ArrayList<Integer> facts=new ArrayList<Integer>();
	 for(int i=2;i<=n/2;i++){
		 
		 if(n%i==0){
			 System.out.print("N value: ");
			 System.out.println(n);
			 int q=n/i;
			 facts.add(i);
			 facts.add(q);
			 Collections.sort(facts);
			 System.out.println("Factors of n:");
			 System.out.println(facts);
			 result.add(facts);
			 System.out.println("Factors added to result");
			 facts=new ArrayList<Integer>();
			 
			 HashSet<ArrayList<Integer>> temp=fac_fun(q);
			 if(temp.isEmpty())
			 {
				 System.out.print(q);
				 System.out.println(" factrors are empty");
			 }
			 else{
				 System.out.print(q);
				 
			 for(ArrayList<Integer> arr:temp){
				 facts.add(i);
				 for(Integer inum:arr){
					 facts.add(inum);
				 }
				 
				 Collections.sort(facts);
				 System.out.println("Factors of n:");
				 System.out.println(facts);
				 result.add(facts);
				 System.out.println("Factors added to result");
				 facts=new ArrayList<Integer>();
				 //facts.add(i);
			 }
			 }
		 }
	 }
	 return result;
 }
}
