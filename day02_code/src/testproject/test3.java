package testproject;
//判断字符串abcde旋转之后能不能得到字符串cdeab
public class test3 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";

        boolean result=check(strA,strB);

        System.out.println(result);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str){
        /*char first=str.charAt(0);
        String end=str.substring(1);

        return end+first;*/

        char[] arr=str.toCharArray();//把字符串变成字符数组
        char first=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;

        String result=new String(arr);//把字符数组变回字符串
        return result;
    }
}
