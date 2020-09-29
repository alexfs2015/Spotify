package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ion reason: default package */
public final class ion implements vua<iom> {
    private final wlc<RxResolver> a;
    private final wlc<String> b;

    private ion(wlc<RxResolver> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ion a(wlc<RxResolver> wlc, wlc<String> wlc2) {
        return new ion(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new iom((RxResolver) this.a.get(), (String) this.b.get());
    }
}
