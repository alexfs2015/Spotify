package com.spotify.mobile.android.converter;

public class ConvertProductValueException extends Exception {
    private static final long serialVersionUID = -4803573546423612268L;

    public ConvertProductValueException(Class<?> cls, String str) {
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(str);
        sb.append(" couldn't be converted to target type ");
        sb.append(cls.getName());
        super(sb.toString());
    }
}
