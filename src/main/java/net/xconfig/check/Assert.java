package net.xconfig.check;

import net.xconfig.exception.TboxException;
import net.xconfig.tool.StringTool;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/10 13:41
 */
public class Assert {


    public static void isTrue(boolean flag){
        isTrue(flag, null);
    }



    public static void isTrue(boolean flag, String errorMsg){
        if (!flag){
            throw new TboxException(errorMsg);
        }
    }


    public static void notNull(Object o){
        notNull(o, null);
    }


    public static void notNull(Object o, String errorMsg){
        if (o == null){
            throw new TboxException(errorMsg);
        }
    }


    public static void isNull(Object o){
        isNull(o, null);
    }

    public static void isNull(Object o, String errorMsg) {
        if (o != null){
            throw new TboxException(errorMsg);
        }
    }


    public static void hasLength(String text){
        hasLength(text, null);
    }



    public static void hasLength(String text, String errorMsg){
        if (StringTool.isEmpty(text)){
            throw new TboxException(errorMsg);
        }
    }



    public static void lenRegion(String text, int minSize, int maxSize){
        lenRegion(text, minSize, maxSize, null, null, null);
    }



    public static void lenRegion(String text, int minSize, int maxSize, String emptyMsg, String minMsg, String maxMsg){
        hasLength(text, emptyMsg);
        if (text.length() < minSize){
            throw new TboxException(minMsg);
        }
        if (text.length() > maxSize){
            throw new TboxException(maxMsg);
        }
    }
}
