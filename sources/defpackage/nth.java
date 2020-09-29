package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: nth reason: default package */
public final class nth implements vua<ntn> {
    private final wlc<ntq> a;
    private final wlc<Scheduler> b;
    private final wlc<nsu> c;
    private final wlc<Observable<SessionState>> d;
    private final wlc<ntl> e;

    private nth(wlc<ntq> wlc, wlc<Scheduler> wlc2, wlc<nsu> wlc3, wlc<Observable<SessionState>> wlc4, wlc<ntl> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static nth a(wlc<ntq> wlc, wlc<Scheduler> wlc2, wlc<nsu> wlc3, wlc<Observable<SessionState>> wlc4, wlc<ntl> wlc5) {
        nth nth = new nth(wlc, wlc2, wlc3, wlc4, wlc5);
        return nth;
    }

    public final /* synthetic */ Object get() {
        ntn ntn = new ntn((ntq) this.a.get(), (Scheduler) this.b.get(), (nsu) this.c.get(), (Observable) this.d.get(), (ntl) this.e.get());
        return (ntn) vuf.a(ntn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
