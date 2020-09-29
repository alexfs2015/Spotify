package defpackage;

/* renamed from: pgc reason: default package */
public final class pgc implements wig<pgb> {
    private final wzi<a> a;
    private final wzi<pdx> b;

    private pgc(wzi<a> wzi, wzi<pdx> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pgc a(wzi<a> wzi, wzi<pdx> wzi2) {
        return new pgc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pgb(wif.b(this.a), (pdx) this.b.get());
    }
}
