package defpackage;

/* renamed from: pkn reason: default package */
public final class pkn implements wig<pkf> {
    private final wzi<gix> a;

    private pkn(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static pkn a(wzi<gix> wzi) {
        return new pkn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (pkf) wil.a((pkf) ((gix) this.a.get()).a(pkf.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
