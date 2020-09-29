package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: hwm reason: default package */
public final class hwm implements vua<SlotApi> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;

    private hwm(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hwm a(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        return new hwm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (SlotApi) vuf.a(CC.b((rnf) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
