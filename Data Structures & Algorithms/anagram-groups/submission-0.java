class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortToOriginalMap = new HashMap<>();

        for (String s : strs) {
            // Step 1 : Sort characters to form key
            // Convert to Character Array
            char chars[] = s.toCharArray();

            // Sort the character array
            Arrays.sort(chars);

            // Convert it back to String and then assign it to key
            String key = new String(chars);

            // Step 2 : check if key exists
            if (sortToOriginalMap.containsKey(key)) {
                sortToOriginalMap.get(key).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                sortToOriginalMap.put(key, list);
            }
        }

        // Step 3 : Collect result
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : sortToOriginalMap.values()) {
            result.add(group);
        }

        return result;
    }
}
