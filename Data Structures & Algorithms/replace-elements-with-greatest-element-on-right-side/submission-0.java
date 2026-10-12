class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        for(int i=0 ; i < n ; i++) {
            int rightMax = -1;
            for(int j = i+1; j<n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            res[i] = rightMax;
        }
        return res;









        // int n = arr.length;
        // int flag = 0;
        // int i = 0;
        
        // while (arr[i] < arr[i+1] && i < n-1){
        //     i++;
        // }
        //     if(arr[i]>arr[i+1]){
        //         for(int j=0; j<i; j++){
        //         arr[j] = arr[i];
        //         i--;

        //         flag++;
                
        //     }
        // }
        
        
        // // for(int i = 0; i < n-1 ; i++) {
        // //     if(arr[i] < arr[i+1]){
        // //         arr[i] = arr[i+1];
        // //         flag++;
        // //     }

        // // }
        // if (flag != 0){
        //     arr[n-1] = -1;
        // }
        // return arr;
    }
}