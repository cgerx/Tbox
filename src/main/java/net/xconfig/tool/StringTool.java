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
     * 是否为电话号码
     * @param str
     * @return
     */
    public static boolean isTelephone(String str){
        return Pattern.matches("^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$", str);
    }


    /**
     * 是否为有效邮箱
     * @param str
     * @return
     */
    public static boolean isEmail(String str){
        return Pattern.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", str);
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
