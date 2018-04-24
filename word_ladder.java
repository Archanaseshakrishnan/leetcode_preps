import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class word_ladder {

public void bfs(int adjacency_matrix[][], int source)
{
	Queue<Integer> queue;
	queue = new LinkedList<Integer>();
    int number_of_nodes = adjacency_matrix[source].length - 1;
    int[] visited = new int[number_of_nodes + 1];
    int i, element;
    visited[source] = 1;
    queue.add(source);
    while (!queue.isEmpty())
    {
        element = queue.remove();
        i = element;
        System.out.print(i + "\t");
        while (i <= number_of_nodes)
        {
            if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
            {
                queue.add(i);
                visited[i] = 1;
            }
            i++;
        }
    }
    if(visited[number_of_nodes]==1)
    System.out.println("yes");
    else
    	System.out.println("no");
}

public static void main(String args[]){
	String begin, end;
	String[] dictionaries;
	//dictionaries = null;
	int n;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter begin: ");
	begin=reader.nextLine();
	System.out.println("Enter end: ");
	end=reader.nextLine();
	System.out.println("Enter n dictionary: ");
	n=reader.nextInt();
	dictionaries=new String[n];
	for(int i=0;i<n;i++)
	{
		dictionaries[i]=reader.nextLine();
	}
	int[][] adj=new int[n+2][n+2];
	for(int i=0;i<n+2;i++)
		for(int j=0;j<n+2;j++)
		{adj[i][j]=0;}
	int k=0,l=0;
	for(k=0;k<n;k++)
		if(isdiffer(begin,dictionaries[k]))
		{
			adj[0][k+1]=1;
			adj[k+1][0]=1;
		}
	for(k=0;k<n;k++)
		if(isdiffer(end,dictionaries[k]))
		{
			adj[n+1][k+1]=1;
			adj[k+1][n+1]=1;
		}
	for(k=0;k<n;k++)
		for(l=0;l<n;l++)
			if(isdiffer(dictionaries[k],dictionaries[l]))
			{
				adj[k+1][l+1]=1;
				adj[l+1][k+1]=1;
			}
	
}
	

private static boolean isdiffer(String begin, String string) {
	// TODO Auto-generated method stub
	char[] first  = begin.toCharArray();
	char[] second = string.toCharArray();
    int counter=0;
	if(first.length!=second.length)
		return false;
	int minLength=first.length;
	
	for(int i = 0; i < minLength; i++)
	{
	        if (first[i] != second[i])
	        {
	            counter++;    
	        }
	}
	if(counter==1)
		return true;
	else
	return false;
}
	
}

