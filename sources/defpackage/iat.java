package defpackage;

/* renamed from: iat reason: default package */
public final class iat implements vua<ias> {
    private final wlc<jjf> a;

    private iat(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static iat a(wlc<jjf> wlc) {
        return new iat(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ias((jjf) this.a.get());
    }
}
