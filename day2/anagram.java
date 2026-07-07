package tcs;

public class anagram {
    public static boolean isAnagram(String s1, String s2) {
        int[] arr = new int[26];
        if(s1.length() != s2.length()) return false;

        for(int i=0;i<s1.length();i++) {
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        } for(int i:arr) {
            if(i!=0) return false;
        } return true;
    }
    public static void main(String[] args) {
        String s1="eat";
        String s2="ate";
        System.out.println(isAnagram(s1,s2) ? "Anagram":"Not an anagram");
    }
}