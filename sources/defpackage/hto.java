package defpackage;

/* renamed from: hto reason: default package */
public final class hto implements vua<htn> {
    private final wlc<hts> a;

    private hto(wlc<hts> wlc) {
        this.a = wlc;
    }

    public static hto a(wlc<hts> wlc) {
        return new hto(wlc);
    }

    public final /* synthetic */ Object get() {
        return new htn((hts) this.a.get());
    }
}
