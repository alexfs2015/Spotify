package defpackage;

/* renamed from: vrg reason: default package */
public final class vrg implements wig<vre> {
    private final wzi<vub> a;

    private vrg(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vrg a(wzi<vub> wzi) {
        return new vrg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vre) wil.a(vrf.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
