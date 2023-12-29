package xyz.kbws.awarry.level3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kbws
 * @date 2023/12/29
 * @description:
 */
public class FindOne {
    public static Integer findOneNum(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : arr) {
            if(!set.add(i))//添加不成功返回false，前加上！运算符变为true
                set.remove(i);//移除集合中与这个要添加的数重复的元素
        }
        //注意边界条件的处理
        if(set.size() == 0)
            return null;
        //如果Set集合长度为0，返回null表示没找到
        return set.toArray(new Integer[set.size()])[0];
    }

    /**
     * 使用位运算
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int flag = 0;
        for(int i : nums) {
            flag ^= i;
        }
        return flag;
    }
}
