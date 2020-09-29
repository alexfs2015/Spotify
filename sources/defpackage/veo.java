package defpackage;

/* renamed from: veo reason: default package */
public final class veo implements vua<vem> {
    private final wlc<vgw> a;

    private veo(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static veo a(wlc<vgw> wlc) {
        return new veo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vem) vuf.a(ven.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
