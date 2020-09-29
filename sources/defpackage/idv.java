package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: idv reason: default package */
public final class idv implements vua<idu> {
    private final wlc<Observable<AdBreakState>> a;
    private final wlc<idm> b;

    private idv(wlc<Observable<AdBreakState>> wlc, wlc<idm> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static idv a(wlc<Observable<AdBreakState>> wlc, wlc<idm> wlc2) {
        return new idv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new idu((Observable) this.a.get(), (idm) this.b.get());
    }
}
