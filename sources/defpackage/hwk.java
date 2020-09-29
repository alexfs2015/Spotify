package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hwk reason: default package */
public final class hwk implements vua<hxh> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;

    private hwk(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hwk a(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        return new hwk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hxh) vuf.a(CC.d((rnf) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
