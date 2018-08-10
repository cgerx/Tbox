package net.xconfig.tool;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/10 10:43
 */
public class CollectionToolTest {


    @Test
    public void testSplit(){
        List list = new ArrayList();
        for (int i = 0; i < 103; i++) {
            list.add(i);
        }
        List<List> res = CollectionTool.split(list, 10);
        Assert.assertTrue(res.size() == 11);
        Assert.assertTrue(res.get(0).size() == 10);
        Assert.assertTrue(res.get(10).size() == 3);
    }


}
