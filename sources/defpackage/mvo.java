package defpackage;

/* renamed from: mvo reason: default package */
public final class mvo implements vua<mvn> {
    private final wlc<rgt> a;

    private mvo(wlc<rgt> wlc) {
        this.a = wlc;
    }

    public static mvo a(wlc<rgt> wlc) {
        return new mvo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mvn((rgt) this.a.get());
    }
}
