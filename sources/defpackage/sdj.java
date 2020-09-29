package defpackage;

/* renamed from: sdj reason: default package */
public final class sdj implements vua<sdi> {
    private final wlc<String> a;

    private sdj(wlc<String> wlc) {
        this.a = wlc;
    }

    public static sdj a(wlc<String> wlc) {
        return new sdj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sdi((String) this.a.get());
    }
}
