package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: nzf reason: default package */
public final class nzf implements vua<nze> {
    private final wlc<RxResolver> a;

    private nzf(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static nzf a(wlc<RxResolver> wlc) {
        return new nzf(wlc);
    }

    public static nze a(RxResolver rxResolver) {
        return new nze(rxResolver);
    }

    public final /* synthetic */ Object get() {
        return new nze((RxResolver) this.a.get());
    }
}
