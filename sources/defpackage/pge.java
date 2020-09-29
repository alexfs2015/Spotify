package defpackage;

/* renamed from: pge reason: default package */
public final class pge implements wig<pgd> {
    private final wzi<a> a;

    private pge(wzi<a> wzi) {
        this.a = wzi;
    }

    public static pge a(wzi<a> wzi) {
        return new pge(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pgd((a) this.a.get());
    }
}
