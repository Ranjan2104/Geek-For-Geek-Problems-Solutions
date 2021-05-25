class Solution {
    int remove_duplicate(int A[],int N){
        // code here
		if (N==0 || N==1) return N;  
        int[] temp = new int[N];  
        int j = 0;  
        for (int i=0; i<N-1; i++){  
            if (A[i] != A[i+1]) temp[j++] = A[i];
         }  
        temp[j++] = A[N-1];
        for(int i = 0; i < j; i++) A[i] = temp[i];
        return j;
    }
}
 // Contributed by Amresh Ranjan.