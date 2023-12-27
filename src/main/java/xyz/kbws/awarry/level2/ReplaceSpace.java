package xyz.kbws.awarry.level2;

/**
 * @author kbws
 * @date 2023/12/27
 * @description:
 */
public class ReplaceSpace {
    /**
     * 字符串长度不可变
     * @param str
     * @return
     */
    public String replaceSpace1(StringBuffer str) {
        String res="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' ')
                res += "%20";
            else
                res += c;
        }
        return res;
    }

    /**
     * 字符串长度可变
     * @param str
     * @return
     */
    public  String replaceSpace2(StringBuffer str) {
        if (str == null)
            return null;
        int numOfblank = 0;//空格数量
        int len = str.length();
        for (int i = 0; i < len; i++) {  //计算空格数量
            if (str.charAt(i) == ' ')
                numOfblank++;
        }
        str.setLength(len + 2 * numOfblank); //设置长度
        int fast = len - 1;  //两个指针
        int slow = (len + 2 * numOfblank) - 1;

        while (fast >= 0 && slow > fast) {
            char c = str.charAt(fast);
            if (c == ' ') {
                fast--;
                str.setCharAt(slow--, '0');
                str.setCharAt(slow--, '2');
                str.setCharAt(slow--, '%');
            } else {
                str.setCharAt(slow, c);
                fast--;
                slow--;
            }
        }
        return str.toString();
    }
}
