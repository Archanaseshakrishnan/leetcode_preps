
public class Vowel_swap {
public static void main(String args[]){
	System.out.println(vowel_swap("hello").toString());
}
public static String vowel_swap(String orig){
	System.out.println("here"+orig.toCharArray());
	char[] corig=orig.toCharArray();
	
	System.out.println("there "+String.copyValueOf(corig));
	int j=orig.length()-1;
	char f,r;
	
	for(int i=0;i<orig.length();i++){
		if(j<=i)
			break;
		else{
		f=corig[i];
		System.out.println(f);
		r=corig[j];
		System.out.println(r);
		if(f=='a' || f=='e' || f=='i' || f=='o' || f=='u'){
			while(r!='a' && r!='e' && r!='i' && r!='o' && r!='u'){
				j--;
				r=corig[j];
				if(j<=i)
					break;
			}
			if(j<=i)
				break;
			else;
			corig=swap(i,j,corig);
		}
		else if(r=='a' ||r=='e' || r=='i' || r=='o' || r=='u'){
			while(f!='a' && f!='e' && f!='i' && f!='o' && f!='u'){
				i++;
				f=corig[i];
				if(j<=i)
					break;
			}
			if(j<=i)
				break;
			else
			corig=swap(i,j,corig);
		}
		}
	}
	System.out.println("here "+ String.copyValueOf(corig));
	return String.copyValueOf(corig);
}
private static char[] swap(int i, int j, char[] corig) {
	// TODO Auto-generated method stub
	char temp;
	temp=corig[i];
	corig[i]=corig[j];
	corig[j]=temp;
	return corig;
}
}
