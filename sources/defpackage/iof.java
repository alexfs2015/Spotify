package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iof reason: default package */
public final class iof implements vua<ioc> {
    private final wlc<RxResolver> a;

    private iof(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static iof a(wlc<RxResolver> wlc) {
        return new iof(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ioc((RxResolver) this.a.get());
    }
}
