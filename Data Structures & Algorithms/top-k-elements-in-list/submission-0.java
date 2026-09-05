class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }

        int n = nums.length;
        Integer value;
        List<Integer>[] buckets = new List[n+1];
        for(Integer key : map.keySet()){
            value = map.get(key);
            if(buckets[value] == null){
                buckets[value] = new ArrayList<>();
            }
            buckets[value].add(key);
        }

        int[] result = new int[k];
        int j=0;
        for(int i=buckets.length-1; i>0 && j<k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[j] = num;
                    j++;
                    if(k == j) break;
                }    
            }
            
        }
        return result;
    }
}
