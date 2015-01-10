package onlinequestions;

public class FindNumberInMatrix {

static int[][] arr = new int[10][10];
private static int comparisions=0;

public static void main(String[] args)
{
	
	int start=0;
	for(int i=0; i<10; i++)
	{
		start+=5;
		for(int j=0; j<10; j++)
		{
			arr[i][j]= start;
			start+=5;
		}
	}
	FindNumberInMatrix.printArray();
	FindNumberInMatrix.find(505);
}
static void printArray()
{
	for(int i=0; i<10; i++)
	{
		
		for(int j=0; j<10; j++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.println("");
	}
}
static void find(int n)
{
	int i=0;
	int j=9;
	boolean found=false;
	int corner = arr[i][j];
	
	while(i<10  && j>=0)
	{
		if(corner == n)
		{
			System.out.println("Element found!!!");
			comparisions++;
			System.out.println("Number of comparisions : " + comparisions);
			found=true;
			break;
		}
		else if(corner<n)
		{
			i++;
			if(i<10)
			{
			corner=arr[i][j];
			comparisions++;
			}
		}
		else if(corner>n)
		{
			j--;
			if(j>=0)
			{
				corner=arr[i][j];
				comparisions++;
			}
		}
	}
	if(!found)
	{
		System.out.println("Not found!!");
	}
}


}
