import java.util.ArrayList;

public class Rotating_image_90_clkandanticlk {
public static void main(String[] args){
	int[][] mat={
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int[][] res=new int[mat[0].length][mat.length];
	res=rot_clk90(mat);
	for (int i=0;i<res.length;i++){
		for(int j=0;j<res[0].length;j++){
			System.out.print(res[i][j]);
			System.out.print(" ");
		}
	System.out.println();}
	int[][] mat2={
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int[][] res2=new int[mat2[0].length][mat2.length];
	res2=rot_anticlk90(mat2);
	
	for (int i=0;i<res2.length;i++){
		for(int j=0;j<res2[0].length;j++){
			System.out.print(res2[i][j]);
			System.out.print(" ");
		}
	System.out.println();}
}
public static int[][] rot_clk90(int[][] mat)
{
	//general approach take transpose and swap cols
	int rows,cols;
	rows = mat.length;
	cols = mat[0].length;
	System.out.println(rows);
	System.out.println(cols);
	if(rows==cols)//n*n matrix can be done in-place
	{
		for(int i=0;i<rows;i++){
			for(int j=i;j<cols;j++){
				
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
				
			}
		}
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++)
				{
				System.out.print(mat[i][j]);
				System.out.print(" ");
				}
			System.out.println();
		}
			rows=mat.length;
			cols=mat[0].length;
		//swap cols within the same matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols/2;j++){
				int temp=mat[i][j];
				//System.out.print(newmat[i][j]);
				
				mat[i][j]=mat[i][cols-1-j];
				
				mat[i][cols-1-j]=temp;
			}
		}
        for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+" ");
                System.out.println();
            }
        return mat;
        }        
	else{
		//in-place not possible
		int[][] newmat=new int[cols][rows];
		//take transpose
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				newmat[j][i]=mat[i][j];
				//System.out.println(newmat[j][i]);
			}
		}
		
		rows=newmat.length;
		cols=newmat[0].length;
		//swap cols within the same matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols/2;j++){
				int temp=newmat[i][j];
				//System.out.print(newmat[i][j]);
				
				newmat[i][j]=newmat[i][cols-1-j];
				
				newmat[i][cols-1-j]=temp;
			}
		}
        for(int i=0;i<cols;i++)
            {
                for(int j=0;j<rows;j++)
                System.out.print(newmat[i][j]+" ");
                System.out.println();
            }
        return newmat;
    }
	//return null;
}
public static int[][] rot_anticlk90(int[][] mat)
{
	//general approach take transpose and swap cols
	int rows,cols;
	rows = mat.length;
	cols = mat[0].length;
	System.out.println(rows);
	System.out.println(cols);
	if(rows==cols)//n*n matrix can be done in-place
	{
		for(int i=0;i<rows;i++){
			for(int j=i;j<cols;j++){
				
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
				
			}
		}
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++)
				{
				System.out.print(mat[i][j]);
				System.out.print(" ");
				}
			System.out.println();
		}
			rows=mat.length;
			cols=mat[0].length;
		//swap rows within the same matrix
		for(int i=0;i<=rows/2;i++){
			for(int j=0;j<cols;j++){
				int temp=mat[i][j];
				//System.out.print(newmat[i][j]);
				
				mat[i][j]=mat[rows-1-i][j];
				
				mat[rows-1-i][j]=temp;
			}
		}
		return mat;
	}
	else{
		//in-place not possible
		int[][] newmat=new int[cols][rows];
		//take transpose
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				newmat[j][i]=mat[i][j];
				//System.out.println(newmat[j][i]);
			}
		}
		
		for(int i=0;i<newmat.length;i++){
			for(int j=0;j<newmat[0].length;j++)
				{
				System.out.print(newmat[i][j]);
				System.out.print(" ");
				}
			System.out.println();
		}
			rows=newmat.length;
			cols=newmat[0].length;
		//swap cols within the same matrix
		for(int i=0;i<=rows/2;i++){
			for(int j=0;j<cols;j++){
				int temp=newmat[i][j];
				//System.out.print(newmat[i][j]);
				
				newmat[i][j]=newmat[rows-1-i][j];
				
				newmat[rows-1-i][j]=temp;
			}
		}
		return newmat;
	}
	//return null;
}
}
