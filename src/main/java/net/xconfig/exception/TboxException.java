package net.xconfig.exception;

/**
 * Title:
 * Description:
 * Project: Tbox
 * Author: cg
 * Create Time:2018/8/10 13:37
 */
public class TboxException extends RuntimeException{

    public TboxException(){
        super();
    }


    public TboxException(String message){
        super(message);
    }


    public TboxException(Throwable cause){
        super(cause);
    }


    public TboxException(String message, Throwable cause){
        super(message, cause);
    }
}
