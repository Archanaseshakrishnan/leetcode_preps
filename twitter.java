import java.util.HashMap;

public class twitter {
	//"-Your friend, Alice"
	
public static void main(String args[]){
	String stra="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String strb="abcdefghijklmnopqrstuvwxyz";
	char[] sa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	char[] ca = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
	for(int i=0;i<sa.length;i++){
		hm.put(sa[i],stra.indexOf(sa[i])+1);
		hm.put(ca[i],strb.indexOf(ca[i])+1);
	}
	System.out.println(hm);
	
	String input="Otjfvknou kskgnl, K mbxg iurtsvcnb ksgq hoz atv. Vje xcxtyqrl vt ujg smewfv vrmcxvtg rwqr ju vhm ytsf elwepuqyez. -Atvt hrqgse, Cnikg"; 
	String hint="-Your friend, Alice";
	char[] inpc=new char[input.length()];
	String[] dec=input.split("\\s+");
	String[] in=hint.split("\\s+");
	for(String a:in)
	System.out.println(a);
	int j=0;int key=0;
	String key1="",key2="";
	for(int i=3;i>0;i--){
		char[] plain=in[i-1].toCharArray();
		char[] cipher=dec[dec.length-1-j].toCharArray();
		for(int k=0;k<plain.length;k++)
		{
			if(plain[k]>cipher[k]){
				if(hm.get(cipher[k])!=null){
				key=(hm.get(cipher[k])+26)-hm.get(plain[k]);
				key1=key1+String.valueOf(key);
				}
			}
			else if(plain[k]<cipher[k]){
				if(hm.get(cipher[k])!=null){
					key=(hm.get(cipher[k]))-hm.get(plain[k]);
					key1=key1+String.valueOf(key);
					}
			}
			else{
				if(hm.get(plain[k])!=null){
					key=0;
					key1=key1+String.valueOf(key);
				}
			}
			
			//if(key2.contains(key1))
		}
		j++;
	}
	int keylen=key1.length();
	key2 = key1;
	while(input.length()>keylen+key1.length()){
		key2 = key2 + key1;
		keylen = keylen+key1.length();
	}
	//for padding
	char[] key2c=new char[input.length()];
	char[] key1c=new char[key1.length()];
	key1c=key1.toCharArray();
	key2c=key2.toCharArray();
	int index=0;
	for(int i=keylen;i<input.length();i++){
		key2c[i]=key1c[index];
		index++;
	}
	String orig="";
	//decryption
	for(int i=0;i<input.length();i++){
		if(hm.get(inpc[i])!=null){
			//letter
			int val=(hm.get(inpc[i])+Integer.parseInt(String.valueOf(key2c[i])))%26;
			orig=orig+hm.get(val);
		}
		else{
			//non-ascii character
			orig=orig+inpc[i];
		}
	}
	System.out.println(orig);
}
}
