package DAY6.Session2;

public class LongestSubstring {
    public static int lengthOfLongestUniqueSubstring(String s){
        Set<Character>set = new HashSet();
        int left =0;
        int maxLen=0;
        for(int right = 0 ; right<s.length();right++){
            char current = s.CharAt(right);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(+)
        }

    }
    public static void main(String[] args){

    }
    
}
