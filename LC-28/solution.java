class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }

        int needleLen=needle.length();
        int hayLen=haystack.length();

        if(needleLen>hayLen){
            return -1;
        }


        for(int i=0;i<=hayLen-needleLen;i++){
            if(haystack.substring(i,i+needleLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}