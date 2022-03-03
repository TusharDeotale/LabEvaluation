
class BinarySearch
{
	public static void binarySearch(int arr[], int low, int high, int key)
	{
		int mid = (low + high)/2;
		if(arr[mid] == key)
		{
			System.out.println("\nElement found at index: " + mid);
			return;
		}
		else if (key < arr[mid])
		{
			binarySearch(arr, low, mid - 1, key);
		}
		else
		{
			binarySearch(arr, mid + 1, high, key);
		}
	}

	public static void main (String[] args)
	{
		int[] arr = {3, 5, 6, 8, 11, 12, 14, 15, 17, 18};
		int n = arr.length;
		
		binarySearch(arr, 0, n-1, 8);
	}
}
