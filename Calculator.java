import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	public static void main(String args[]){
		Stack<Character> operators=new Stack<Character>();
		Stack<String> number=new Stack<String>();
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		hs.put('+', 2);
		hs.put('-', 2);
		hs.put('*', 1);
		hs.put('/', 1);
		hs.put('(', 3);
		
		String expr="1+3*8";
		char[] exp=expr.toCharArray();
		String num="";
		for(int i=0;i<expr.length();i++){
			if(exp[i]=='+'){
				number.push(num);
				if(hs.get(operators.peek())>hs.get(exp[i])){
					operators.push(exp[i]);
				}
				else{
					int num1=Integer.parseInt(number.pop());
					int num2=Integer.parseInt(number.pop());
					int sum=num1+num2;
					number.push(Integer.toString(sum));
				}
			}
			else if(exp[i]=='-'){
				number.push(num);
				if(hs.get(operators.peek())>hs.get(exp[i])){
					operators.push(exp[i]);
				}
				else{
					int num1=Integer.parseInt(number.pop());
					int num2=Integer.parseInt(number.pop());
					int sum=num1+num2;
					number.push(Integer.toString(sum));
				}
			}
			else if(exp[i]=='*'){
				number.push(num);
				if(hs.get(operators.peek())>hs.get(exp[i])){
					operators.push(exp[i]);
				}
				else{
					int num1=Integer.parseInt(number.pop());
					int num2=Integer.parseInt(number.pop());
					int sum=num1+num2;
					number.push(Integer.toString(sum));
				}
			}
			else if(exp[i]=='/'){
				number.push(num);
				if(hs.get(operators.peek())>hs.get(exp[i])){
					operators.push(exp[i]);
				}
				else{
					int num1=Integer.parseInt(number.pop());
					int num2=Integer.parseInt(number.pop());
					int sum=num1+num2;
					number.push(Integer.toString(sum));
				}
			}
			else if(exp[i]=='('){
				number.push(num);
				operators.push(exp[i]);
			}
			else if(exp[i]==')'){
				number.push(num);
				char popu=operators.pop();
				
				while(popu!='('){
				int num1=Integer.parseInt(number.pop());
				int num2=Integer.parseInt(number.pop());
				int result=fun(num1,num2,popu);
				number.push(Integer.toString(result));
				popu=operators.pop();
				}
				operators.pop();
			}
			else{
				num=num+exp[i];
			}
			
		}
		System.out.println(number.pop());
	}

	private static int fun(int num1, int num2, char popu) {
		// TODO Auto-generated method stub
		if(popu=='+'){
			return num1+num2;
		}
		else if(popu=='-'){
			return num1-num2;
		}
		else if(popu=='/'){
			return num1/num2;
		}
		else if(popu=='*'){
			return num1*num2;
		}
		return 0;
	}
}
