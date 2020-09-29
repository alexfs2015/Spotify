package defpackage;

/* renamed from: otv reason: default package */
public final class otv implements vua<otu> {
    private final wlc<opb> a;

    private otv(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static otv a(wlc<opb> wlc) {
        return new otv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new otu((opb) this.a.get());
    }
}
