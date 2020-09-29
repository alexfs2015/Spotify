package defpackage;

/* renamed from: luf reason: default package */
public final class luf implements vua<lue> {
    private final wlc<lui> a;

    private luf(wlc<lui> wlc) {
        this.a = wlc;
    }

    public static luf a(wlc<lui> wlc) {
        return new luf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lue((lui) this.a.get());
    }
}
