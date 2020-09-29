package defpackage;

/* renamed from: mqv reason: default package */
public final class mqv implements wig<mqu> {
    private final wzi<rzo> a;
    private final wzi<jwo> b;

    private mqv(wzi<rzo> wzi, wzi<jwo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mqv a(wzi<rzo> wzi, wzi<jwo> wzi2) {
        return new mqv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mqu((rzo) this.a.get(), (jwo) this.b.get());
    }
}
