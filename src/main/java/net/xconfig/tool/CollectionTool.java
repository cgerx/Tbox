package net.xconfig.tool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/8 15:24
 */
public class CollectionTool {


    /**
     * 分割数组
     *
     * @param t
     * @param size
     * @return
     */
    public static synchronized <T extends Collection> List<T> split(T t, int size) {
        List resList = new ArrayList<T>();
        T subList = (T) ClassTool.newInstance(t.getClass());
        Iterator iterator = t.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            subList.add(next);
            if (subList.size() == size) {
                resList.add(subList);
                subList = (T) ClassTool.newInstance(t.getClass());
            }
        }
        if (subList.size() != size) {
            resList.add(subList);
        }
        return resList;
    }

}
