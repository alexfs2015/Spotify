package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;

/* renamed from: ilm reason: default package */
public final class ilm implements vua<StreamingCardEventLogger> {
    private final wlc<ilk> a;
    private final wlc<gdz<fko>> b;

    private ilm(wlc<ilk> wlc, wlc<gdz<fko>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ilm a(wlc<ilk> wlc, wlc<gdz<fko>> wlc2) {
        return new ilm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new StreamingCardEventLogger((ilk) this.a.get(), (gdz) this.b.get());
    }
}
