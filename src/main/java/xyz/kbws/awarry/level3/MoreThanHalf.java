package xyz.kbws.awarry.level3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kbws
 * @date 2023/12/29
 * @description:
 */
public class MoreThanHalf {
    /**
     * 使用 Hash 存储每个数在数组中出现的次数
     * @param array
     * @return
     */
    public int moreThanHalfNum(int [] array) {
        if(array==null)
            return 0;
        Map<Integer,Integer> res=new HashMap<>();
        int len = array.length;
        for(int i=0;i<array.length;i++){
            res.put(array[i],res.getOrDefault(array[i],0)+1);
            if(res.get(array[i])>len/2)
                return array[i];
        }
        return 0;
    }
}
