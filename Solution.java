class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int noOfZeros = 0;
        int paircount = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0)
                noOfZeros++;                    
            if (A[i] == 1){
              paircount += noOfZeros;      
            } 
            if (paircount > 1000000000) 
                return -1;
        }
        return paircount;
    }
public static void main(String args[]){
int A[]={0,1,0,1,1};
System.out.println(solution(A));
}
}