package defpackage;

/* renamed from: sbv reason: default package */
public final class sbv implements wig<sbx> {
    private final wzi<gix> a;

    private sbv(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static sbv a(wzi<gix> wzi) {
        return new sbv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (sbx) wil.a((sbx) ((gix) this.a.get()).b(sbx.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
