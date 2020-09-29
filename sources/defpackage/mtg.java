package defpackage;

/* renamed from: mtg reason: default package */
public final class mtg implements vua<Boolean> {
    private final wlc<fpt> a;

    private mtg(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static mtg a(wlc<fpt> wlc) {
        return new mtg(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.a((fpt) this.a.get()));
    }
}
