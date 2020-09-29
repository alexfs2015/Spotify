package defpackage;

/* renamed from: oqb reason: default package */
public final class oqb implements vua<oqa> {
    private final wlc<a> a;

    private oqb(wlc<a> wlc) {
        this.a = wlc;
    }

    public static oqb a(wlc<a> wlc) {
        return new oqb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oqa((a) this.a.get());
    }
}
