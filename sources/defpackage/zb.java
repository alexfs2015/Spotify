package defpackage;

/* renamed from: zb reason: default package */
public final class zb {
    private static final zb a = new zb();
    private final dt<String, xa> b = new dt<>(10485760);

    public static zb a() {
        return a;
    }

    zb() {
    }

    public final xa a(String str) {
        if (str == null) {
            return null;
        }
        return (xa) this.b.a(str);
    }

    public final void a(String str, xa xaVar) {
        if (str != null) {
            this.b.a(str, xaVar);
        }
    }
}
