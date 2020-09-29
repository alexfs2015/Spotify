package defpackage;

/* renamed from: mfm reason: default package */
public final class mfm implements wig<mfl> {
    private final wzi<mfa> a;
    private final wzi<sso> b;
    private final wzi<gwp> c;

    private mfm(wzi<mfa> wzi, wzi<sso> wzi2, wzi<gwp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mfm a(wzi<mfa> wzi, wzi<sso> wzi2, wzi<gwp> wzi3) {
        return new mfm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mfl((mfa) this.a.get(), (sso) this.b.get(), (gwp) this.c.get());
    }
}
