import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//zig-zag conversion
public class Print_wrd_in_certain_format {
	
public static void func(String s, int row){
	//ArrayList<char[]> arrayList = new ArrayList<char[]>();
	//ArrayList<Character> charset=new ArrayList<Character>();
	String[] arrayList=new String[row];
	for (int i = 0; i < arrayList.length; i++) {
		arrayList[i]="";
	}
	int count=0,rowvar=0;
	char[] temp=s.toCharArray();
	int i=0;
	while(i<s.length())
	{
		/*charset.add(temp[i]);
		System.out.println(charset);*/
		
		//arrayList.add(count, temp[i]);
		if(i<s.length())
		 //i = func1(rowvar,row,temp,arrayList,i,count);
		{
			while(rowvar<row)
			{	
				if(i<s.length()){
				arrayList[count]+=temp[i];
				System.out.println(count);
			i++;
			count=(count+1)%row;
			rowvar++;
			}
			}
		}
			if(i<s.length())
			// i=func2(rowvar,row,temp,arrayList,i,count);
			{
				while(rowvar<(row/2))
				{
				if(i<s.length()){
				count=(2*count+1)%row;
				System.out.println(count);
				arrayList[count]+=temp[i];
				i++;
				rowvar++;
				}}
			}
			}
	for(String e : arrayList)
	{
		System.out.println(e);
	}
	
}
public static int func1(int rowvar, int row, char[] temp, String[] arrayList, int i, int count){
	while(rowvar<row)
	{	
		if(temp[i]!='\0'){
		arrayList[count]+=temp[i];
	i++;
	count=(count+1)%row;
	rowvar++;
	}
	}
	
	return i;
}

public static int func2(int rowvar, int row, char[] temp, String[] arrayList, int i, int count){
while(rowvar<(row/2))
{
if(temp[i]!='\0'){
count=(2*count+1)%row;
//System.out.println(count);
arrayList[count]+=temp[i];
i++;
rowvar++;
}}
return i;
}
public static void main(String args[]){
	func("PAYPALISHIRING",3);
}
}
