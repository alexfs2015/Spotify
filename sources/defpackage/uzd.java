package defpackage;

/* renamed from: uzd reason: default package */
public final class uzd implements wig<uzb> {
    private final wzi<gix> a;

    private uzd(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static uzb a(gix gix) {
        return (uzb) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static uzd a(wzi<gix> wzi) {
        return new uzd(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
