import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = {30,40,10,20};
	    int n = arr.length;
		
		//------------Logic to find pivot--------------------

		int low = 0;
		int high = n-1;
		while(low<high)
		{
		    int mid = (low+high)/2;
		    if(arr[mid]<arr[high])
		    {
		        high = mid;
		    }else if(arr[mid]>arr[high]){
		         low = mid+1;
		    }
		}
		System.out.println("Pivot is"+arr[low]);
	}
}
