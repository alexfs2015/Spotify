package defpackage;

/* renamed from: hrm reason: default package */
public final class hrm implements vua<hrl> {
    private final wlc<hrn> a;

    private hrm(wlc<hrn> wlc) {
        this.a = wlc;
    }

    public static hrm a(wlc<hrn> wlc) {
        return new hrm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hrl((hrn) this.a.get());
    }
}
