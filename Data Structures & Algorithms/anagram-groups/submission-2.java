class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String key; //sortedString stored as key
        for(String str : strs){
            // key = sortString(str);
            // map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
            key = dict(str);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    // public String sortString(String input){
    //     char[] array = input.toCharArray();
    //     Arrays.sort(array);
    //     return new String(array);
    // }

    public String dict(String input){
        int[] count = new int[26];
        for (char c : input.toCharArray()){
            count[c - 'a']++;
        }
        return Arrays.toString(count);
    }
}
