package defpackage;

/* renamed from: nkz reason: default package */
public final class nkz implements wig<njf> {
    private final wzi<gix> a;

    private nkz(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static njf a(gix gix) {
        return (njf) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static nkz a(wzi<gix> wzi) {
        return new nkz(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
