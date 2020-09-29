package defpackage;

/* renamed from: pfo reason: default package */
public final class pfo implements vua<String> {
    private final wlc<jsi> a;

    private pfo(wlc<jsi> wlc) {
        this.a = wlc;
    }

    public static pfo a(wlc<jsi> wlc) {
        return new pfo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jsi) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
