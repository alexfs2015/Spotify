package defpackage;

/* renamed from: pfc reason: default package */
public final class pfc implements wig<pgt> {
    private final wzi<gix> a;

    private pfc(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static pfc a(wzi<gix> wzi) {
        return new pfc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (pgt) wil.a((pgt) ((gix) this.a.get()).a(pgt.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
