package defpackage;

/* renamed from: pjo reason: default package */
public final class pjo implements wig<pjn> {
    private final wzi<pjp> a;

    private pjo(wzi<pjp> wzi) {
        this.a = wzi;
    }

    public static pjo a(wzi<pjp> wzi) {
        return new pjo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pjn((pjp) this.a.get());
    }
}
