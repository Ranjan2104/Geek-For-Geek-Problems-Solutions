class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 

        long[] nge = new long[arr.length];
        Stack<Long> stack = new Stack<>();
        stack.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;
        for(int i = arr.length-2; i >=0; i--) {
            while(stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if(stack.size() == 0)
                nge[i] = -1;
            else
                nge[i] = stack.peek();
            stack.push(arr[i]);
        }
        return nge;
    } 
}
// Contributed by Amresh Ranjan.