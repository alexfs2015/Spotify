package com.spotify.android.flags;

public class UnmappableValueException extends Exception {
    private static final long serialVersionUID = 4006225106797912781L;

    public UnmappableValueException(fps<?> fps, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(fps.a);
        sb.append(" of type ");
        sb.append(fps.e.getName());
        sb.append(" cannot map value \"");
        sb.append(str);
        sb.append('\"');
        super(sb.toString(), th);
    }
}
