class largestSubaaraywithSumK {
    public int lenOfLongestSubarr(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefix = 0;
        int max_len = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            // If the prefix sum equals k, update max_len
            if (prefix == k) {
                max_len = i + 1;
            }

            // Check if prefix - k exists in the map
            int rem = prefix - k;
            if (hm.containsKey(rem)) {
                int curr_len = i - hm.get(rem);
                max_len = Math.max(max_len, curr_len);
            }

            // Store the prefix sum with its index if not already present
            if (!hm.containsKey(prefix)) {
                hm.put(prefix, i);
            }
        }

        return max_len;
    }
}