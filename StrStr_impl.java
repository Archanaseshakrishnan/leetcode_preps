
public class StrStr_impl {
public static void main(String args[]){
	String root="abracadabra", find="fdhg";
	int i,j=0,idup;
	char c;
	for(i=0;i<root.length();i++){
		c=root.charAt(i);idup=i;
		
		while(j<find.length() && c==find.charAt(j)){
			idup++;j++;
			c=root.charAt(idup);
		}
		if(j>=find.length()-1){
			System.out.println("Yes");break;
		}
		else{
			j=0;i=idup;
		}
	}
	if(i==root.length()){
		System.out.println("NO");
	}
}
}
