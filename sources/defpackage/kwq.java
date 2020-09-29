package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: kwq reason: default package */
public final class kwq implements wig<kwp> {
    private final wzi<Scheduler> a;
    private final wzi<Flowable<SessionState>> b;

    private kwq(wzi<Scheduler> wzi, wzi<Flowable<SessionState>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kwq a(wzi<Scheduler> wzi, wzi<Flowable<SessionState>> wzi2) {
        return new kwq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kwp((Scheduler) this.a.get(), (Flowable) this.b.get());
    }
}
