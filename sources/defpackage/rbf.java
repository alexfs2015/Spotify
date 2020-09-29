package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.feedback.FeedbackContextType;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: rbf reason: default package */
public final class rbf implements vua<rbe> {
    private final wlc<rao> a;
    private final wlc<Map<FeedbackContextType, rbd>> b;
    private final wlc<rbk> c;
    private final wlc<ras> d;
    private final wlc<Scheduler> e;
    private final wlc<Scheduler> f;
    private final wlc<a> g;

    private rbf(wlc<rao> wlc, wlc<Map<FeedbackContextType, rbd>> wlc2, wlc<rbk> wlc3, wlc<ras> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6, wlc<a> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static rbf a(wlc<rao> wlc, wlc<Map<FeedbackContextType, rbd>> wlc2, wlc<rbk> wlc3, wlc<ras> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6, wlc<a> wlc7) {
        rbf rbf = new rbf(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return rbf;
    }

    public final /* synthetic */ Object get() {
        rbe rbe = new rbe((rao) this.a.get(), (Map) this.b.get(), (rbk) this.c.get(), (ras) this.d.get(), (Scheduler) this.e.get(), (Scheduler) this.f.get(), (a) this.g.get());
        return rbe;
    }
}
