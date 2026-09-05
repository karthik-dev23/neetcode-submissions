class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String key; //sortedString stored as key
        for(String str : strs){
            key = sortString(str);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String sortString(String input){
        char[] array = input.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
