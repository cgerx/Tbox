package net.xconfig.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/10 14:05
 */
public class MapToolTest {


    @Test
    public void testNewHashMap(){
        HashMap<String, Object> map = MapTool.newHashMap(
                "name", "Joe",
                "age", 28,
                "address", "Haier rd Qingdao China",
                "sex", 1,
                "isDelete", false);
        Set<String> keySet = new HashSet<String>();
        keySet.add("name");
        keySet.add("age");
        keySet.add("address");
        keySet.add("sex");
        keySet.add("isDelete");
        Assert.assertTrue(map.keySet().size() == 5);
        for (String key : map.keySet()) {
            Assert.assertTrue(keySet.contains(key));
        }
    }
}
