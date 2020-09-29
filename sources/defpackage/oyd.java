package defpackage;

/* renamed from: oyd reason: default package */
public final class oyd implements vua<oyc> {
    private final wlc<oxu> a;

    private oyd(wlc<oxu> wlc) {
        this.a = wlc;
    }

    public static oyd a(wlc<oxu> wlc) {
        return new oyd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oyc(this.a);
    }
}
