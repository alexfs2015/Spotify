package defpackage;

/* renamed from: mbi reason: default package */
public final class mbi implements wig<mcs> {
    private final wzi<gix> a;

    private mbi(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static mbi a(wzi<gix> wzi) {
        return new mbi(wzi);
    }

    public final /* synthetic */ Object get() {
        return (mcs) wil.a((mcs) ((gix) this.a.get()).a(mcs.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
