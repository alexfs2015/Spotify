package defpackage;

/* renamed from: qre reason: default package */
public final class qre implements vua<gjb> {
    private final wlc<udr> a;

    private qre(wlc<udr> wlc) {
        this.a = wlc;
    }

    public static qre a(wlc<udr> wlc) {
        return new qre(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gjb) vuf.a(gjb.a((udr) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
