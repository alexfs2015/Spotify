package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iob reason: default package */
public final class iob implements vua<ioa> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    private iob(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static iob a(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        return new iob(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ioa(this.a, this.b);
    }
}
