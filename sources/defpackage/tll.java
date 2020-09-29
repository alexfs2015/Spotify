package defpackage;

/* renamed from: tll reason: default package */
public final class tll implements vua<tlk> {
    private final wlc<tmg> a;

    private tll(wlc<tmg> wlc) {
        this.a = wlc;
    }

    public static tll a(wlc<tmg> wlc) {
        return new tll(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tlk((tmg) this.a.get());
    }
}
