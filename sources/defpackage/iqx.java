package defpackage;

/* renamed from: iqx reason: default package */
public final class iqx implements vua<iqw> {
    private final wlc<jjf> a;

    private iqx(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static iqx a(wlc<jjf> wlc) {
        return new iqx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new iqw((jjf) this.a.get());
    }
}
