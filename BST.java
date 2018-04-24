//no duplicates
/*class treenode{
	public int data;
	public treenode left;
	public treenode right;
	public treenode(int d1){
		data=d1;
		left=null;
		right=null;
	}
}
class tree{
	public treenode root;
	public treenode temp2;
	public tree(){
		root=null;
	}
	public void insert(int d1){
		treenode temp=new treenode(d1);	
		if(root==null){
				//temp=new treenode(d1);
			root=temp;
		}
		else{
		temp2=root;
		if(temp2.data > d1){
			insert(d1);
		}
		else if(temp2.data < d1){
			insert(d1);
			}
		else if(temp2.data == d1){
				//do nothing
		}
		}
	} 
	public void delete(int value, treenode temp){
		if(temp.data==value){
		if(temp.left!=null && temp.right!=null){
			treenode temp2;
			temp2=Findmin(temp.right);
			temp.data=temp2.data;
			delete(temp2.data,temp.right);
		}
		else if(temp.left==null){
			temp=temp.right;
		}
		else if(temp.right==null){
			temp=temp.left;
		}
		else 
			temp=null;
		}
		else if(temp.data>value)
		{
			delete(value,temp.left);
		}
		else{
			delete(value,temp.right);
		}
	}
	public treenode Findmin(treenode temp) {
		// TODO Auto-generated method stub
		if(temp==null){
			return null;
		}
		else{
			if(temp.left==null)
				return temp;
			else
				return Findmin(temp.left);
		}
		//return null;
	}
	public void inordertraversal(treenode temp){
		if(temp!=null){
			inordertraversal(temp.left);
			System.out.println(temp.data);
			inordertraversal(temp.right);
		}
	}
}
public class BST {
public static void main(String args[]){
	tree t1=new tree();
	t1.insert(6);
	t1.insert(4);
	t1.insert(8);
	t1.insert(7);
	t1.insert(9);
	t1.insert(5);
	t1.insert(3);
	t1.inordertraversal(t1.root);
}
}
*/