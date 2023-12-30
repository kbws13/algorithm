package xyz.kbws.Stack.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author kbws
 * @date 2023/12/30
 * @description: 括号匹配问题
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char item = s.charAt(i);
            if(map.containsKey(item)){
                stack.push(item);
            }else{
                if(!stack.isEmpty()){
                    Character left = stack.pop();
                    char rightchar = map.get(left);
                    if(rightchar != item){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
