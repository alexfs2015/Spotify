package defpackage;

/* renamed from: tya reason: default package */
public final class tya implements vua<txz> {
    private final wlc<txu> a;

    private tya(wlc<txu> wlc) {
        this.a = wlc;
    }

    public static tya a(wlc<txu> wlc) {
        return new tya(wlc);
    }

    public final /* synthetic */ Object get() {
        return new txz((txu) this.a.get());
    }
}
