package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: gtj reason: default package */
public final class gtj implements vua<hde> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    private gtj(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gtj a(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        return new gtj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        hde hde = new hde((RxResolver) this.a.get(), (rnf) this.b.get(), 10, true, true, true, true, true, false, true);
        return (hde) vuf.a(hde, "Cannot return null from a non-@Nullable @Provides method");
    }
}
