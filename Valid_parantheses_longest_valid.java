import java.util.HashMap;
import java.util.Stack;

public class Valid_parantheses_longest_valid {
public static void main(String args[]){
	//boolean ans=isValid("{[]}()(({}))");
	//System.out.println(ans);
	String a=new String("{[]}()(({}))");
	int status=0,count=0;
	Stack<Character> mystack1=new Stack<Character>();
	Stack<Character> mystack2=new Stack<Character>();
	Stack<Character> mystack3=new Stack<Character>();
	for(int i=0;i<a.length();i++){
		char c=a.charAt(i);
		if(c=='('){
			mystack1.push(c);
		}
		else if(c=='{'){
			mystack2.push(c);
		}
		else if(c=='['){
			mystack3.push(c);
		}
		else if(c==')'){
			if( mystack1.isEmpty())
			{System.out.println("no");status=1;break;}
			else
				{mystack1.pop();count+=2;}
		}
		else if(c=='}'){
			if( mystack2.isEmpty())
			{System.out.println("no");status=1;break;}
			else
				{mystack2.pop();count+=2;}
		}
		else if(c==']'){
			if( mystack3.isEmpty())
			{System.out.println("no");status=1;break;}
			else
				{mystack3.pop();count+=2;}
		}
	}
	if(mystack1.isEmpty() && mystack2.isEmpty() && mystack3.isEmpty() && status==0){
		System.out.println("yes");
	}
	else
		System.out.println("no");
}
//as defined in leetcode
public static boolean isValid(String s) {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');

	Stack<Character> stack = new Stack<Character>();

	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);

		if (map.keySet().contains(curr)) {
			stack.push(curr);
		} else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
			}
		}
	}
	return stack.empty();
}
}
