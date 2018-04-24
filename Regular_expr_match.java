
public class Regular_expr_match {
public static void main(String args[]){
	System.out.println(match("aaa","aa"));
}
public static boolean match(String word,String expr){
	if(expr.equals(".*")){
		return true;
	}
	else{
		char[] expr1=new char[expr.length()];
		expr1=expr.toCharArray();
		char[] word1=new char[word.length()];
		word1=word.toCharArray();
		int i=0,j=0;
		char letter;
		char next, oper;
		while(j<word.length()){
			//alphanumeric
			if(expr1[i]!='*' || expr1[i]!='.'){
				if(i<expr.length()){
				letter=expr1[i];
				if(i+1<expr.length())
				{
					next=expr1[i+1];
					//letter*
					if(next=='*'){
						while(j<word.length() && word1[j]==letter){
							j++;
						}
						i+=2;
					}
					else if(next=='.'){
						if(word1[j]==letter){
							j+=2;
							i+=2;
						}
						else
							return false;
					}
					//some other letter
					else{
						if(word1[j]==letter){
							i++;j++;
						}
						else return false;
					}
				}
			}
			//only other possibility dot
			else
			{
			j++;i++;	
			}
			}
			else
				return false;
		}
	}
	return true;
}
}
