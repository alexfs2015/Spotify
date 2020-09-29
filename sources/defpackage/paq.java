package defpackage;

/* renamed from: paq reason: default package */
public final class paq implements wig<pbd> {
    private final wzi<gix> a;

    private paq(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static paq a(wzi<gix> wzi) {
        return new paq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (pbd) wil.a((pbd) ((gix) this.a.get()).b(pbd.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
