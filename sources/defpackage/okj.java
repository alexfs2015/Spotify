package defpackage;

/* renamed from: okj reason: default package */
public final class okj implements vua<oki> {
    private final wlc<opb> a;

    private okj(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static okj a(wlc<opb> wlc) {
        return new okj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oki(this.a);
    }
}
