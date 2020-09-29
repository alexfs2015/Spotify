package defpackage;

/* renamed from: nlf reason: default package */
public final class nlf implements wig<Boolean> {
    private final wzi<nlu> a;
    private final wzi<fqn> b;

    private nlf(wzi<nlu> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlf a(wzi<nlu> wzi, wzi<fqn> wzi2) {
        return new nlf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        nlu nlu = (nlu) this.a.get();
        return Boolean.valueOf(((String) ((fqn) this.b.get()).a(nlt.d)).contains("Enabled"));
    }
}
