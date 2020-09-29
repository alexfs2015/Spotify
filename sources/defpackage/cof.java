package defpackage;

@cey
/* renamed from: cof reason: default package */
public final class cof {
    private static cof b;
    String a;

    private cof() {
    }

    public static cof a() {
        if (b == null) {
            b = new cof();
        }
        return b;
    }
}
