package LeetcodeQuestions;
/*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.*/


import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> allowedSet=new HashSet<>();
        for(char c:allowed.toCharArray()){
            allowedSet.add(c);
        }
        for(String word:words){
            boolean isConsistent=true;
            for(char c:word.toCharArray()){
                if(!allowedSet.contains(c)){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }

        }
      return count;
    }

    public static void main(String[] args) {


        CounttheNumberofConsistentStrings cs=new CounttheNumberofConsistentStrings();

        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(cs.countConsistentStrings(allowed,words));
    }
}
