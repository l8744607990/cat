package com.lius.cat.exception;

import com.dexcoder.commons.enums.IEnum;
import com.dexcoder.commons.exceptions.DexcoderException;

/**
 * Write comment here
 * User : liulu ,
 * Date : 2016-7-21 21:05 ,
 * version $Id: CatException.java, v 0.1 Exp $
 */
public class CatException extends DexcoderException{


    public CatException(IEnum e) {
        super(e);
    }

    public CatException(String message, Throwable e) {
        super(message, e);
    }

    public CatException(IEnum msgEnum, Throwable e) {
        super(msgEnum, e);
    }

    public CatException(Throwable e) {
        super(e);
    }

    public CatException(String message) {
        super(message);
    }

    public CatException(String code, String message) {
        super(code, message);
    }
}
