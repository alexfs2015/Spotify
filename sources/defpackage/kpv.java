package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: kpv reason: default package */
public final class kpv implements vua<hde> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<Integer> c;

    private kpv(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Integer> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kpv a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Integer> wlc3) {
        return new kpv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        hde hde = new hde((RxResolver) this.a.get(), (rnf) this.b.get(), ((Integer) this.c.get()).intValue(), true, true, true, true);
        return (hde) vuf.a(hde, "Cannot return null from a non-@Nullable @Provides method");
    }
}
