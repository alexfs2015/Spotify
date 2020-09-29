package defpackage;

/* renamed from: vsa reason: default package */
public final class vsa implements wig<vry> {
    private final wzi<vub> a;

    private vsa(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsa a(wzi<vub> wzi) {
        return new vsa(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vry) wil.a(vrz.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
