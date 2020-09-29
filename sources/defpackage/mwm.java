package defpackage;

/* renamed from: mwm reason: default package */
public final class mwm implements wig<mwn> {
    private final wzi<gix> a;

    private mwm(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static mwm a(wzi<gix> wzi) {
        return new mwm(wzi);
    }

    public static mwn a(gix gix) {
        return (mwn) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
