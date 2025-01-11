class Solution {
    public boolean canConstruct(String s, int k) {

        int n = s.length();
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int oddCount = 0;
        for(int i = 0; i < 26; i++) {
            if(arr[i] % 2 == 1) {
                oddCount++;
            }
        }
        return n >= k && oddCount <= k;
    }
}