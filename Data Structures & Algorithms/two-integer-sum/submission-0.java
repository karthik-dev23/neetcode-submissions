class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
        int num,match;
       for(int i=0; i<nums.length; i++){
        num = nums[i];
        match = target - num;
        if(map.containsKey(match)){
            return new int[]{map.get(match), i};
        }
        map.put(num, i);
       } 
       return new int[]{};
    }
}
