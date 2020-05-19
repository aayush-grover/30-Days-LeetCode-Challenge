// Given an array of strings, group anagrams together.

// Example:

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:

//     All inputs will be in lowercase.
//     The order of your output does not matter.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> h=new HashMap<>();
        for(String s :strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            
            if(h.containsKey(key))
            {
                h.get(key).add(s);
            }
            else
            {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                h.put(key,newList);
            }
        }
        res.addAll(h.values());
        return res;
        
//                 long codePoint;
//         int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103 };
//         Map<Long, List<String>> anagramGroup = new LinkedHashMap<>();
//         for(String s:strs){
//             codePoint = 1;
//             for (int i = 0; i < s.length(); i++) {
//                 codePoint *= prime[s.charAt(i) - 'a'];
//             }
//             if(!anagramGroup.containsKey(codePoint)){
//                 List<String> anagrams = new LinkedList<>();
//                 anagrams.add(s);
//                 anagramGroup.put(codePoint, anagrams);
//             } else {
//                 anagramGroup.get(codePoint).add(s);
//             }
//         }
//         return new LinkedList<>(anagramGroup.values());
    }
}