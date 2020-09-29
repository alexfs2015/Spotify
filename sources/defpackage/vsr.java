package defpackage;

/* renamed from: vsr reason: default package */
public final class vsr implements wig<vsp> {
    private final wzi<vub> a;

    private vsr(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsr a(wzi<vub> wzi) {
        return new vsr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vsp) wil.a(vsq.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
