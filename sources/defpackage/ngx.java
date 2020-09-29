package defpackage;

/* renamed from: ngx reason: default package */
public final class ngx implements vua<ngw> {
    private final wlc<wud<Boolean>> a;
    private final wlc<wud<Boolean>> b;

    private ngx(wlc<wud<Boolean>> wlc, wlc<wud<Boolean>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngx a(wlc<wud<Boolean>> wlc, wlc<wud<Boolean>> wlc2) {
        return new ngx(wlc, wlc2);
    }

    public static ngw a(wud<Boolean> wud, wud<Boolean> wud2) {
        return new ngw(wud, wud2);
    }

    public final /* synthetic */ Object get() {
        return new ngw((wud) this.a.get(), (wud) this.b.get());
    }
}
