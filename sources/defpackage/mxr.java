package defpackage;

/* renamed from: mxr reason: default package */
public final class mxr implements wig<mxq> {
    private final wzi<jpc> a;
    private final wzi<Boolean> b;

    private mxr(wzi<jpc> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mxr a(wzi<jpc> wzi, wzi<Boolean> wzi2) {
        return new mxr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mxq((jpc) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
