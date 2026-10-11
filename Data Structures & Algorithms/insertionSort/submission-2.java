// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
  
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int n = pairs.size();
        List<List<Pair>> res = new ArrayList<>();  
        if (n == 0) return res;
        res.add(new ArrayList<>(pairs));


        for (int i = 1; i < n; i++) {
            Pair current = pairs.get(i);
            int j = i - 1;

            
            while (j >= 0 && pairs.get(j).key > current.key) {
                
                pairs.set(j+1, pairs.get(j));
                j--;
            }
            
            pairs.set(j+1, current);
        
          

   res.add(new ArrayList<>(pairs));
        }

        return res;
    }
}

