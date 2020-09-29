package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: sws reason: default package */
public final class sws implements vua<swr> {
    private final wlc<Flowable<Ad>> a;
    private final wlc<a> b;

    private sws(wlc<Flowable<Ad>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sws a(wlc<Flowable<Ad>> wlc, wlc<a> wlc2) {
        return new sws(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new swr((Flowable) this.a.get(), (a) this.b.get());
    }
}
