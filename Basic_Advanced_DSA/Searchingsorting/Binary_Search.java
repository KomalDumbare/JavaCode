// Binary Search
class Binary_Search{
	private int arr[];
	private int n;
	private int target;
	Binary_Search(int[] arr,int n,int target)
	{
		this.arr = arr;
		this.n = n;
		this.target = target;
	}
	public void getTarget()
	{
		int start = 0;
		int end = n-1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			if(arr[mid] == target)
			{
				System.out.println(mid);
				return;
			}
			else if(arr[mid] < target)
			{
				start = mid+1;
			}
			else 
			{
				end = mid-1;
			}
		}
		System.out.println("The element is not found");
		
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{10,20,30,40,50,60};
		int n = arr.length;
		int target = 40;
		Binary_Search BS = new Binary_Search(arr,n,target);
		BS.getTarget();
	}
}
/*// Binary Search
class Binary_Search {
    private int[] arr;
    private int n;
    private int target;

    Binary_Search(int[] arr, int n, int target) {
        this.arr = arr;
        this.n = n;
        this.target = target;
    }

    public void getTarget() {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("The position of the target element in the array: " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Target not found in the array.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int target = 40;
        Binary_Search BS = new Binary_Search(arr, n, target);
        BS.getTarget();
    }
}
*/