class Solution {
    public int monotoneIncreasingDigits(int n) {
        String str=Integer.toString(n);
        char[] ch=str.toCharArray();
        int start=ch.length;
        for(int i=ch.length-2;i>=0;i--){
            if(ch[i]>ch[i+1]){
                ch[i]--;
                start=i+1;
            }
        }
        for(int i=start;i<ch.length;i++){
            ch[i]='9';
        }
        return Integer.parseInt(String.valueOf(ch));
    }
}
