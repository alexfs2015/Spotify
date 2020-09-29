package defpackage;

/* renamed from: zp reason: default package */
public final class zp {
    private static final zp a = new zp();
    private final dt<String, xo> b = new dt<>(10485760);

    zp() {
    }

    public static zp a() {
        return a;
    }

    public final xo a(String str) {
        if (str == null) {
            return null;
        }
        return (xo) this.b.a(str);
    }

    public final void a(String str, xo xoVar) {
        if (str != null) {
            this.b.a(str, xoVar);
        }
    }
}
