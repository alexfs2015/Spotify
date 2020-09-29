package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: hjv reason: default package */
public final class hjv implements vua<nrp> {
    private final wlc<a> a;
    private final wlc<Flowable<SessionState>> b;
    private final wlc<hvg> c;
    private final wlc<nrs> d;

    private hjv(wlc<a> wlc, wlc<Flowable<SessionState>> wlc2, wlc<hvg> wlc3, wlc<nrs> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hjv a(wlc<a> wlc, wlc<Flowable<SessionState>> wlc2, wlc<hvg> wlc3, wlc<nrs> wlc4) {
        return new hjv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (nrp) vuf.a(new nrp((Flowable) this.b.get(), (a) this.a.get(), (hvg) this.c.get(), (nrs) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
