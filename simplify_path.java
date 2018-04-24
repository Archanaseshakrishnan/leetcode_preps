import java.util.ArrayList;
import java.util.Stack;

public class simplify_path {
public static void main(String args[]){
String path="/a/./b/../../c/";
int len=path.length();
String files="";
char[] pathc=path.toCharArray();
Stack<String> st=new Stack<String>();
int i=0,j=0;
while(pathc[i]!='\0'){
	if(pathc[i]=='/'){
		if(i==len-1 && pathc[i]!='/'){
		}
		else{
		if(files!=""){
			st.push(files);
			files="";
		}
		else{
			files="";
		}
		if(pathc[i+1]=='.' && pathc[i+2]=='.'){
			st.pop();i+=3;
		}
		else if(pathc[i+1] == '.' && pathc[i+2]=='/'){
			files = files + pathc[i+1] + pathc[i+2];
			i+=2;
		}
		else{
			files=files + pathc[++i];
		}
		
	else{
		files=files + pathc[++i];
	}
		}
}
}
}
}
