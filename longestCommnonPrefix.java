import java.util.Arrays;
public class longestCommnonPrefix {
    public String LongestCommonPrefix(String[] strs){
        if (strs==null || strs.length==0) return "";
        String prefix = strs[0];
        for (String s : strs){
            while (s.indexOf(prefix)!=0)
                prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
        }
        public String LongestCommonPrefix1(String[] strs){
        if (strs==null || strs.length==0) return "";
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length-1];
        while (word2.indexOf(word1)!=0){
         word1 = word1.substring(0,word1.length()-1);
        }
        System.out.println(word1);
        return word1;
    }
    public static void main(String[] args){
        longestCommnonPrefix sol =new longestCommnonPrefix();
        System.out.println(sol.LongestCommonPrefix(new String[]{"flower","flow","flight"}));
      }
}
