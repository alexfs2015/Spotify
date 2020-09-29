package defpackage;

/* renamed from: mex reason: default package */
public final class mex implements wig<mew> {
    private final wzi<mej> a;
    private final wzi<a> b;

    private mex(wzi<mej> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mex a(wzi<mej> wzi, wzi<a> wzi2) {
        return new mex(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mew((mej) this.a.get(), (a) this.b.get());
    }
}
