package defpackage;

/* renamed from: ovc reason: default package */
public final class ovc implements vua<ovb> {
    private final wlc<b> a;

    private ovc(wlc<b> wlc) {
        this.a = wlc;
    }

    public static ovc a(wlc<b> wlc) {
        return new ovc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ovb((b) this.a.get());
    }
}
