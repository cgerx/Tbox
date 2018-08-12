package net.xconfig.tool;

import net.xconfig.check.Assert;

import java.util.HashMap;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/10 13:33
 */
public class MapTool {


    /**
     * 简易构建包含key-value的hashMap
     * @param keyValues
     * @return
     */
    public static HashMap<String, Object> newHashMap(Object ... keyValues){
        Assert.isTrue(keyValues.length % 2 == 0, "KEY-VALUE键值对长度必须为偶数");
        HashMap<String, Object> map = new HashMap();
        for (int i = 1; i < keyValues.length; i = i + 2) {
            Object key = keyValues[i - 1];
            Object value = keyValues[i];
            Assert.isTrue(key instanceof String, "键必须为String型！");
            map.put((String) key, value);
        }
        return map;
    }



}
