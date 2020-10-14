class Solution {
    public int numTrees(int n) {
        /* 
        R
       / \ 
4 elems   5 elems
Total Count = 4*5 trees possible
Final Formula is Catalan Number --> Summation of all the possible nodes with all the possible
structures --> 2nCn / (n+1)
        
        */
        int[] num = new int[n+1];
        num[0]=num[1] = 1;
        for(int i=2;i<=n;i++){
            num[i] = 0;
            for(int j=0;j<i;j++)
                num[i]+= num[j]*num[i-j-1];
        }
        
        return num[n];
        
    }
}
