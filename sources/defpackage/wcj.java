package defpackage;

/* renamed from: wcj reason: default package */
public final class wcj {
    public static final wcj a = new wcj(32768, 65536, false);
    final int b;
    final int c;

    wcj(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("WriteBufferWaterMark(low: ");
        sb.append(this.b);
        sb.append(", high: ");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
