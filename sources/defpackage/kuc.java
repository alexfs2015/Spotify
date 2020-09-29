package defpackage;

/* renamed from: kuc reason: default package */
public final class kuc implements vua<kub> {
    private final wlc<jjf> a;

    private kuc(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static kuc a(wlc<jjf> wlc) {
        return new kuc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kub((jjf) this.a.get());
    }
}
