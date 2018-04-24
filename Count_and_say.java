
public class Count_and_say {
public static void main(String args[]){
	int n=111221,count=1,found=0;
	String newnum="";
	String num=Integer.toString(n);
	System.out.println(num);
	for(int i=0;i<num.length();i++){
		//newnum=num.charAt(i);
		if(i+1<num.length()){
			if(num.charAt(i)==num.charAt(i+1)){
				count++;
				if(i+1==num.length()-1){
					found=1;
				}
			}
			else{
				newnum=newnum+Integer.toString(count)+num.charAt(i);
				count=1;
			}
		}
		else{
			
				newnum=newnum+Integer.toString(count)+num.charAt(i);
		}
	}
	System.out.println(newnum);
	System.out.print(countAndSay(n));
}
public static String countAndSay(int n) {
	if (n <= 0)
		return null;

	String result = "1";
	int i = 1;

	while (i < n) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int j = 1; j < result.length(); j++) {
			if (result.charAt(j) == result.charAt(j - 1)) {
				count++;
			} else {
				sb.append(count);
				sb.append(result.charAt(j - 1));
				count = 1;
			}
		}

		sb.append(count);
		sb.append(result.charAt(result.length() - 1));
		result = sb.toString();
		i++;
	}

	return result;
}
}
