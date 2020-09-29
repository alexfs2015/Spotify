package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: ghh reason: default package */
public final class ghh implements vua<ghg> {
    private final wlc<WebgateTokenProvider> a;
    private final wlc<ghi> b;
    private final wlc<gie> c;
    private final wlc<ghd> d;
    private final wlc<ufm> e;
    private final wlc<Observable<gbn>> f;
    private final wlc<Scheduler> g;

    private ghh(wlc<WebgateTokenProvider> wlc, wlc<ghi> wlc2, wlc<gie> wlc3, wlc<ghd> wlc4, wlc<ufm> wlc5, wlc<Observable<gbn>> wlc6, wlc<Scheduler> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static ghh a(wlc<WebgateTokenProvider> wlc, wlc<ghi> wlc2, wlc<gie> wlc3, wlc<ghd> wlc4, wlc<ufm> wlc5, wlc<Observable<gbn>> wlc6, wlc<Scheduler> wlc7) {
        ghh ghh = new ghh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return ghh;
    }

    public final /* synthetic */ Object get() {
        ghg ghg = new ghg((WebgateTokenProvider) this.a.get(), (ghi) this.b.get(), (gie) this.c.get(), (ghd) this.d.get(), (ufm) this.e.get(), (Observable) this.f.get(), (Scheduler) this.g.get());
        return ghg;
    }
}
