class SelectionSort{
	public static void main(String[] args)
	{
		int min, temp = 0;
		int []arr = {4,78,3,23,1,6,3,8,2};
		for (int i = 0; i < arr.length; i++)
		{
			min = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
				min = j;
				}		
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
