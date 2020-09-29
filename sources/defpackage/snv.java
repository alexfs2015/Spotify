package defpackage;

/* renamed from: snv reason: default package */
public final class snv implements vua<snu> {
    private final wlc<snt> a;

    private snv(wlc<snt> wlc) {
        this.a = wlc;
    }

    public static snv a(wlc<snt> wlc) {
        return new snv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new snu((snt) this.a.get());
    }
}
