package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ioq reason: default package */
public final class ioq implements vua<ioo> {
    private final wlc<RxResolver> a;

    private ioq(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static ioq a(wlc<RxResolver> wlc) {
        return new ioq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ioo((RxResolver) this.a.get());
    }
}
