package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ukg reason: default package */
public final class ukg implements vua<wud<Offer>> {
    private final wlc<wud<Optional<Offer>>> a;
    private final wlc<wud<Offer>> b;

    private ukg(wlc<wud<Optional<Offer>>> wlc, wlc<wud<Offer>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ukg a(wlc<wud<Optional<Offer>>> wlc, wlc<wud<Offer>> wlc2) {
        return new ukg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((wud) this.a.get(), (wud) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
