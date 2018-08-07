package net.xconfig.tool;

import java.util.regex.Pattern;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/7 22:04
 */
public class StringTool {



    /**
     * 判断是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str == null || str.length() == 0;
    }



    /**
     * 判断不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }



    /**
     * 是否为纯数字
     * @param str
     * @return
     */
    public static boolean isNumber(String str){
        return Pattern.matches("^[0-9]*$", str);
    }



    /**
     * 分割数组
     * @param str
     * @param spliteStr
     * @return
     */
    public static String[] toArray(String str, String spliteStr){
        if (isEmpty(str)){
            return null;
        }
        return str.split(spliteStr);
    }


    /**
     * 使用“,”分割数组
     * @param str
     * @return
     */
    public static String[] toArray(String str){
        return toArray(str, ",");
    }


}
