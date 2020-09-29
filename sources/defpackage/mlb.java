package defpackage;

/* renamed from: mlb reason: default package */
public final class mlb implements vua<mla> {
    private final wlc<rqd> a;

    private mlb(wlc<rqd> wlc) {
        this.a = wlc;
    }

    public static mlb a(wlc<rqd> wlc) {
        return new mlb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mla((rqd) this.a.get());
    }
}
