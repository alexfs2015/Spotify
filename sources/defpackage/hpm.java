package defpackage;

/* renamed from: hpm reason: default package */
public final class hpm implements vua<hpl> {
    private final wlc<hqi> a;

    private hpm(wlc<hqi> wlc) {
        this.a = wlc;
    }

    public static hpm a(wlc<hqi> wlc) {
        return new hpm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hpl(vtz.b(this.a));
    }
}
