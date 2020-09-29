package defpackage;

/* renamed from: wpl reason: default package */
public final class wpl {
    final byte a;
    final int b;

    public wpl(byte b2, int i) {
        wpp.a(i >= 0, (Object) "length must be >= 0");
        this.a = b2;
        this.b = i;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wpl) {
            wpl wpl = (wpl) obj;
            if (this.a == wpl.a && this.b == wpl.b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", new Object[]{Byte.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
