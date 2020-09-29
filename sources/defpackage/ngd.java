package defpackage;

/* renamed from: ngd reason: default package */
public final class ngd implements vua<Boolean> {
    private final wlc<fpt> a;

    private ngd(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static ngd a(wlc<fpt> wlc) {
        return new ngd(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(CC.a((fpt) this.a.get()));
    }
}
