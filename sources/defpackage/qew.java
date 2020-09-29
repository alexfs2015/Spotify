package defpackage;

/* renamed from: qew reason: default package */
public final class qew implements wig<qev> {
    private final wzi<spq> a;
    private final wzi<squ> b;

    private qew(wzi<spq> wzi, wzi<squ> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qew a(wzi<spq> wzi, wzi<squ> wzi2) {
        return new qew(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qev((spq) this.a.get(), (squ) this.b.get());
    }
}
