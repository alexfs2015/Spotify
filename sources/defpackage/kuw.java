package defpackage;

/* renamed from: kuw reason: default package */
public final class kuw implements vua<kuv> {
    private final wlc<jjf> a;
    private final wlc<wue<String>> b;

    private kuw(wlc<jjf> wlc, wlc<wue<String>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kuw a(wlc<jjf> wlc, wlc<wue<String>> wlc2) {
        return new kuw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kuv((jjf) this.a.get(), (wue) this.b.get());
    }
}
