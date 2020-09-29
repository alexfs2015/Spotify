package defpackage;

/* renamed from: xdq reason: default package */
public final class xdq {
    final byte a;
    final int b;

    public xdq(byte b2, int i) {
        xdu.a(i >= 0, (Object) "length must be >= 0");
        this.a = b2;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xdq) {
            xdq xdq = (xdq) obj;
            if (this.a == xdq.a && this.b == xdq.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", new Object[]{Byte.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
