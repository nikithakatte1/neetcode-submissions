class TwoSum {
    HashMap <Long, Integer> counts = new HashMap<>();
    public TwoSum() {}

    public void add(int number) {
        counts.merge((long)number, 1, Integer::sum);
    }
    public boolean find(int value) { 
        for(Map.Entry<Long,Integer> i : counts.entrySet()) {
            long x = i.getKey();
            long y = (long)value - x;

            if(counts.containsKey(y) && (x!=y || i.getValue() > 1)) {
                return true;
            }
        }
        
        return false;
    }
}
