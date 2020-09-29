package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ryw reason: default package */
public final class ryw implements vua<ryv> {
    private final wlc<RxResolver> a;
    private final wlc<Boolean> b;

    private ryw(wlc<RxResolver> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ryw a(wlc<RxResolver> wlc, wlc<Boolean> wlc2) {
        return new ryw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ryv((RxResolver) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
