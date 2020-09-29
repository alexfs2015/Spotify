package defpackage;

/* renamed from: nvb reason: default package */
public final class nvb implements wig<nvq> {
    private final wzi<gix> a;

    private nvb(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static nvb a(wzi<gix> wzi) {
        return new nvb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (nvq) wil.a((nvq) ((gix) this.a.get()).a(nvq.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
