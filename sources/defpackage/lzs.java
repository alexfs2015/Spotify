package defpackage;

/* renamed from: lzs reason: default package */
public final class lzs implements vua<b> {
    private final wlc<String> a;

    private lzs(wlc<String> wlc) {
        this.a = wlc;
    }

    public static lzs a(wlc<String> wlc) {
        return new lzs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new b((String) this.a.get());
    }
}
