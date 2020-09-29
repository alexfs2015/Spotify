package defpackage;

/* renamed from: deo reason: default package */
final class deo implements ddx {
    final ddz a;
    final dep b;
    private final String c;

    deo(ddz ddz, String str, Object[] objArr) {
        this.a = ddz;
        this.c = str;
        this.b = new dep(ddz.getClass(), str, objArr);
    }

    public final ddz c() {
        return this.a;
    }

    public final int a() {
        return (this.b.c & 1) == 1 ? e.h : e.i;
    }

    public final boolean b() {
        return (this.b.c & 2) == 2;
    }
}
