class Solution{
    int middle(int A, int B, int C){
        int ret = 0;
        if((B > C && B < A) || (B < C && B > A)) ret = B;
        else if((A > B && A < C) || (A < B && A > C)) ret =  A;
        else if((C > A && C < B) || (C < A && C > B)) ret =  C;
        return ret;
    }
}
// Contributed by Amresh Ranjan.