class Solution
{
	public boolean findTriplets(int arr[] , int n)
    	{
        Arrays.sort(arr);
        for(int i = 0; i < n - 2; i++) {
            if(twosum(arr, -arr[i], i+1)) return true;
        }
        return false;
        
    }	public boolean twosum(int a[], int x, int i) {
        int j = a.length - 1;
        while(i < j) {
            if(a[i] + a[j] > x) j--;
            else if(a[i] + a[j] < x) i++;
            else return true;
        }
        return false;
    }
}
// Contributed by Amresh Ranjan.