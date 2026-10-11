class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int count = 0;
        int countS =0;
        char[] arr = s.toCharArray();

        for(int i=n; i>=0 ; i--){
            if(arr[i] != ' '){
                count++;
                continue;
            }
            if(count > 0) break;
        }
        return count;


        // while(n>=0 && arr[n] == ' '){
        //     n--;
        // }
        // while(n>=0 && arr[n] != ' ') {
        //     count++;
        //     n--;
        // }
        // return count;
    }
}