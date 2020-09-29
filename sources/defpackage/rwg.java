package defpackage;

/* renamed from: rwg reason: default package */
public final class rwg implements vua<rwf> {
    private final wlc<vfr> a;

    private rwg(wlc<vfr> wlc) {
        this.a = wlc;
    }

    public static rwg a(wlc<vfr> wlc) {
        return new rwg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rwf((vfr) this.a.get());
    }
}
