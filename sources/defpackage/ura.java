package defpackage;

/* renamed from: ura reason: default package */
public final class ura implements vua<uqz> {
    private final wlc<vfm> a;

    private ura(wlc<vfm> wlc) {
        this.a = wlc;
    }

    public static ura a(wlc<vfm> wlc) {
        return new ura(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uqz((vfm) this.a.get());
    }
}
