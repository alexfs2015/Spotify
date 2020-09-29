package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: kth reason: default package */
public final class kth implements vua<ktg> {
    private final wlc<Scheduler> a;
    private final wlc<Flowable<SessionState>> b;

    private kth(wlc<Scheduler> wlc, wlc<Flowable<SessionState>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kth a(wlc<Scheduler> wlc, wlc<Flowable<SessionState>> wlc2) {
        return new kth(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ktg((Scheduler) this.a.get(), (Flowable) this.b.get());
    }
}
