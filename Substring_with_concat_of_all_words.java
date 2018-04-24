import java.util.HashSet;

public class Substring_with_concat_of_all_words {
	public static void main(String args[]){
String string1="bdadbaddassbbubdad";
String[] string2={"dadbad"};
int i=0,found=-1,count=0,k,ibase=0,insideloop=0;
int[] base=new int[string1.length()];

HashSet<String> hs=new HashSet<String>();
//System.out.println(string2.length);
while(i<string1.length()){
	if(i+string2[0].length()<=string1.length()){
	String new_string=string1.substring(i, i+string2[0].length());
	//System.out.println(new_string);

	for(k=0;k<string2.length;k++){
		if(new_string.equals(string2[k])){
			{found=k;break;}
		}
	}
	if(found!=-1){
		if(!hs.add(string2[k])){
			i++;
	}
		else{
			count++;
			if(hs.size()==1){
				base[ibase]=i;
				ibase++;
				i=i+string2[0].length();
			}
			else{
				i++;
			}
		}
		if(count==string2.length){
			hs=new HashSet<String>();
			count=0;found=-1;
			insideloop++;
		}
	}
	else{
		i++;
	}
	}
	else
		break;
}
if(insideloop!=0)
for(int index=0; index<ibase; index++){
	
System.out.println(base[index]);	
}
else
	System.out.println("0");
	}
}
