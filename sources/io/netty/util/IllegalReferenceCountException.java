package io.netty.util;

public class IllegalReferenceCountException extends IllegalStateException {
    private static final long serialVersionUID = -2507492394288153468L;

    public IllegalReferenceCountException() {
    }

    public IllegalReferenceCountException(int i) {
        StringBuilder sb = new StringBuilder("refCnt: ");
        sb.append(i);
        this(sb.toString());
    }

    public IllegalReferenceCountException(int i, int i2) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder("refCnt: ");
        sb2.append(i);
        sb2.append(", ");
        if (i2 > 0) {
            sb = new StringBuilder("increment: ");
        } else {
            sb = new StringBuilder("decrement: ");
            i2 = -i2;
        }
        sb.append(i2);
        sb2.append(sb.toString());
        this(sb2.toString());
    }

    private IllegalReferenceCountException(String str) {
        super(str);
    }
}
