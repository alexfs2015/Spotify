package defpackage;

/* renamed from: uld reason: default package */
public final class uld implements vua<Boolean> {
    private final wlc<fpt> a;

    private uld(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static uld a(wlc<fpt> wlc) {
        return new uld(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(ukr.a((fpt) this.a.get()));
    }
}
