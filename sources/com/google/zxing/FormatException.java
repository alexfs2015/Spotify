package com.google.zxing;

public final class FormatException extends ReaderException {
    private static final FormatException c;

    static {
        FormatException formatException = new FormatException();
        c = formatException;
        formatException.setStackTrace(b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return a ? new FormatException() : c;
    }
}
