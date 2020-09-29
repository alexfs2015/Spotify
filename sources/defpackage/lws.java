package defpackage;

/* renamed from: lws reason: default package */
public final class lws implements wig<lwr> {
    private final wzi<squ> a;
    private final wzi<ujf> b;
    private final wzi<hbc> c;

    private lws(wzi<squ> wzi, wzi<ujf> wzi2, wzi<hbc> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lws a(wzi<squ> wzi, wzi<ujf> wzi2, wzi<hbc> wzi3) {
        return new lws(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new lwr((squ) this.a.get(), (ujf) this.b.get(), (hbc) this.c.get());
    }
}
