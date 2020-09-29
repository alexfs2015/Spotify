package defpackage;

/* renamed from: muv reason: default package */
public final class muv implements vua<muu> {
    private final wlc<mur> a;

    private muv(wlc<mur> wlc) {
        this.a = wlc;
    }

    public static muv a(wlc<mur> wlc) {
        return new muv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new muu((mur) this.a.get());
    }
}
