package assessment.first;
/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */
public class PalindromeAfterDeletingOneChar {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }
    public static boolean validPalindrome(String s) {
        int i =0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++; j--;
            }else{
                return checkPalindrom(s,i+1,j) || checkPalindrom(s,i,j-1);
            }
        }
        return true;
    }
    public static boolean checkPalindrom(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++; j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
