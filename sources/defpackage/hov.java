package defpackage;

/* renamed from: hov reason: default package */
public final class hov implements vua<hou> {
    private final wlc<jjf> a;

    private hov(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static hov a(wlc<jjf> wlc) {
        return new hov(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hou((jjf) this.a.get());
    }
}
