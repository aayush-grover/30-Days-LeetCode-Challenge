// Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

// Example 1:

// Input: S = "ab#c", T = "ad#c"
// Output: true
// Explanation: Both S and T become "ac".

// Example 2:

// Input: S = "ab##", T = "c#d#"
// Output: true
// Explanation: Both S and T become "".

// Example 3:

// Input: S = "a##c", T = "#a#c"
// Output: true
// Explanation: Both S and T become "c".

// Example 4:

// Input: S = "a#c", T = "b"
// Output: false
// Explanation: S becomes "c" while T becomes "b".

// Note:

//     1 <= S.length <= 200
//     1 <= T.length <= 200
//     S and T only contain lowercase letters and '#' characters.

// Follow up:

//     Can you solve it in O(N) time and O(1) space?

class Solution {
    public boolean backspaceCompare(String S, String T) {
              StringBuilder s = new StringBuilder();
              StringBuilder t = new StringBuilder();
        int j=0;
        int k=0;
            for(int i=0;i<S.length();i++)
            {
                 if(S.charAt(i) == '#')
            {
                if(j>0) 
                {s.deleteCharAt(j-1);
                     j--;}
            }
            else {
                s.append(S.charAt(i));
                j++;
            }
            }
        for(int i=0;i<T.length();i++)
            {
            if(T.charAt(i) == '#')
            {
               if(k>0){  t.deleteCharAt(k-1);
                k--;}
            }
            else {
                t.append(T.charAt(i));
                k++;
            }
            }
        // System.out.println(s + " " + t);
        if(s.toString().equals(t.toString())) return true;
        return false;
    }
}