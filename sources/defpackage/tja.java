package defpackage;

/* renamed from: tja reason: default package */
public final class tja implements vua<tiz> {
    private final wlc<tje> a;

    private tja(wlc<tje> wlc) {
        this.a = wlc;
    }

    public static tja a(wlc<tje> wlc) {
        return new tja(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tiz((tje) this.a.get());
    }
}
