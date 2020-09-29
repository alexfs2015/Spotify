package defpackage;

/* renamed from: vnm reason: default package */
public final class vnm implements vua<vnl> {
    private final wlc<vnk> a;

    private vnm(wlc<vnk> wlc) {
        this.a = wlc;
    }

    public static vnm a(wlc<vnk> wlc) {
        return new vnm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new vnl((vnk) this.a.get());
    }
}
