package defpackage;

/* renamed from: hfg reason: default package */
public final class hfg implements vua<hff> {
    private final wlc<Boolean> a;

    private hfg(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static hfg a(wlc<Boolean> wlc) {
        return new hfg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hff(((Boolean) this.a.get()).booleanValue());
    }
}
