package defpackage;

/* renamed from: vpc reason: default package */
public final class vpc implements vua<vph> {
    private final wlc<jrp> a;

    private vpc(wlc<jrp> wlc) {
        this.a = wlc;
    }

    public static vpc a(wlc<jrp> wlc) {
        return new vpc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vph) vuf.a(new vpi((jrp) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
