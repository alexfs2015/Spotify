package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ujx reason: default package */
public final class ujx implements vua<wud<Optional<Offer>>> {
    private final wlc<upn<Offer>> a;
    private final wlc<wud<String>> b;

    private ujx(wlc<upn<Offer>> wlc, wlc<wud<String>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ujx a(wlc<upn<Offer>> wlc, wlc<wud<String>> wlc2) {
        return new ujx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((upn) this.a.get(), (wud) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
