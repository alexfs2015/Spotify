package defpackage;

/* renamed from: xak reason: default package */
public final class xak implements vua<String> {
    private final wlc<jrs> a;

    private xak(wlc<jrs> wlc) {
        this.a = wlc;
    }

    public static xak a(wlc<jrs> wlc) {
        return new xak(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jrs) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
