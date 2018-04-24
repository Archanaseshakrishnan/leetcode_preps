
public class matrix_set_row_col_to_zero {
public static void main(String[] args){
	int[][] mat = new int[4][3];
	for(int i=0;i<4;i++)
		for(int j=0;j<3;j++)
			mat[i][j]=1;
	mat[3][0]=0;
	mat[3][2]=0;
	mat[1][1]=0;
	boolean[] rows=new boolean[mat.length];
	boolean[] col=new boolean[mat[0].length];
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[0].length;j++){
			if(mat[i][j]==0){
				rows[i]=true;
				col[j]=true;
			}
		}
	}
	for(int i=0;i<mat.length;i++)
		if(rows[i]==true)
			for(int k=0;k<mat[0].length;k++)
				mat[i][k]=0;
	for(int j=0;j<mat[0].length;j++)
		if(col[j]==true)
			for(int k=0;k<mat.length;k++)
				mat[k][j]=0;
	
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[0].length;j++)
			System.out.print(mat[i][j]);
		System.out.println(" ");
	}
}
}
