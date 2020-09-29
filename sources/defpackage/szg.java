package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: szg reason: default package */
public final class szg implements vua<szf> {
    private final wlc<Flowable<sze>> a;
    private final wlc<a> b;

    private szg(wlc<Flowable<sze>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static szg a(wlc<Flowable<sze>> wlc, wlc<a> wlc2) {
        return new szg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new szf((Flowable) this.a.get(), (a) this.b.get());
    }
}
