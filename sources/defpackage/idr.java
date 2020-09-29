package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: idr reason: default package */
public final class idr implements vua<idq> {
    private final wlc<Observable<AdBreakState>> a;
    private final wlc<ids> b;

    private idr(wlc<Observable<AdBreakState>> wlc, wlc<ids> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static idr a(wlc<Observable<AdBreakState>> wlc, wlc<ids> wlc2) {
        return new idr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new idq((Observable) this.a.get(), (ids) this.b.get());
    }
}
