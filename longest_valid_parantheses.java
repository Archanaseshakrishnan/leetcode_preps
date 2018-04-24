import java.util.HashMap;
import java.util.Stack;

public class longest_valid_parantheses {
	public static void main(String args[]){
	String s="())(()))",mine="";
	char c,now='\0',prev='\0';
	int i,count=0,count1=0,count2=0;
	for(i=0;i<s.length();i++){
	if((c = s.charAt(i))=='('){
		mine=mine+'1';
	}
	else{
		mine=mine+2;
	}
	}
	//search for the number of 12 patterns
	for(i=0;i<mine.length();i++){
		now=mine.charAt(i);
		if(now=='2'){
			if(prev!='\0'){
				if(count1>0){
					count++;count1--;prev=now;
				}
				else{
					prev=now;
				}
			}
			else{
				prev=now;
			}
		}
		else
			{count1++;prev=now;}
	}
	System.out.println("Count = "+count);
}
	//given in leetcode
	public static int longestValidParentheses(String s) {
		Stack<int[]> stack = new Stack<int[]>();
		int result = 0;
	
		for(int i=0; i<=s.length()-1; i++){
			char c = s.charAt(i);
			if(c=='('){
				int[] a = {i,0};
				stack.push(a);
			}else{
				if(stack.empty()||stack.peek()[1]==1){
					int[] a = {i,1};
					stack.push(a);
				}else{
					stack.pop();
					int currentLen=0;
					if(stack.empty()){
						currentLen = i+1;
					}else{
						currentLen = i-stack.peek()[0];
					}
					result = Math.max(result, currentLen);
				}
			}
		}
	
		return result;
	}
}
