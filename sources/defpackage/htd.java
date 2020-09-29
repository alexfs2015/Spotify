package defpackage;

/* renamed from: htd reason: default package */
public final class htd implements vua<htc> {
    private final wlc<hta> a;
    private final wlc<kxz> b;

    private htd(wlc<hta> wlc, wlc<kxz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static htd a(wlc<hta> wlc, wlc<kxz> wlc2) {
        return new htd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new htc((hta) this.a.get(), (kxz) this.b.get());
    }
}
