class ll{
	public int elt;
	public ll next;
	
	public ll insert(int value,int pos){
		ll temp=new ll(value);
		ll head=this;
		int i=0;
		ll headper=head;
		while(head.next!=null && i<pos){
			head=head.next;
		}
		
		if(head.next!=null)
		temp.next=head.next;
		if(pos!=0)
		head.next=temp;
		else{
			//System.out.println(temp.elt);
			//System.out.println(temp.next);
		temp.next=head;
		//System.out.println(temp.next.elt);
		head=temp;
		//System.out.println(head.elt);
		}
		return head;
	}
	public ll(int value){
		this.elt=value;
		this.next=null;
	}
	public ll(){
		this.elt=0;
		this.next=null;
	}
	public void show()
	{
		ll temp=this;
		while(temp!=null){
			System.out.println(temp.elt);
			temp=temp.next;
		}
	}
}
public class ll_my_impl {
public static void main(String args[]){
	ll head=new ll(6);
	ll temp=new ll(7);
	ll tempnew=new ll(8);
	//head.add(temp);
	head=head.insert(9,0);
	//System.out.println(head.elt);
	head=head.insert(10,1);
	head=head.insert(19,2);
	head=head.insert(23,1);
	head.show();
	//temp.add(tempnew);
	//head.show();
}
}
