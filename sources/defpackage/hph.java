package defpackage;

/* renamed from: hph reason: default package */
public final class hph implements vua<hpg> {
    private final wlc<String> a;
    private final wlc<jro> b;

    private hph(wlc<String> wlc, wlc<jro> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hph a(wlc<String> wlc, wlc<jro> wlc2) {
        return new hph(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hpg((String) this.a.get(), (jro) this.b.get());
    }
}
