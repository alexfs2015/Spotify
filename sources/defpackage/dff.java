package defpackage;

/* renamed from: dff reason: default package */
final class dff implements deo {
    final deq a;
    final dfg b;
    private final String c;

    dff(deq deq, String str, Object[] objArr) {
        this.a = deq;
        this.c = str;
        this.b = new dfg(deq.getClass(), str, objArr);
    }

    public final int a() {
        return (this.b.c & 1) == 1 ? e.h : e.i;
    }

    public final boolean b() {
        return (this.b.c & 2) == 2;
    }

    public final deq c() {
        return this.a;
    }
}
