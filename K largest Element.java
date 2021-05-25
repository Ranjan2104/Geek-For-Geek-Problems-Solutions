class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            if(i < k) {
                pq.add(arr[i]);
            } else {
                if(pq.peek() < arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> ar = new ArrayList<>(pq);
        Collections.sort(ar, Collections.reverseOrder());
        return ar;
    }
}
// Contributed by Amresh Ranjan.