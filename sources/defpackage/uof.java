package defpackage;

/* renamed from: uof reason: default package */
public final class uof implements vua<uoe> {
    private final wlc<jjf> a;

    private uof(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static uof a(wlc<jjf> wlc) {
        return new uof(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uoe((jjf) this.a.get());
    }
}
