
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n=arr.length;
        int m=n;
        int result[]=new int[m];
        int k=0;
        for(int i=n-1;i>=0;i--){
            result[k++]=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=result[i]){
                return false;
            }
        }
        return true;
    }
}
