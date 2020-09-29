package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: thj reason: default package */
public final class thj implements vua<Flowable<Ad>> {
    private final wlc<idq> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;

    private thj(wlc<idq> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static thj a(wlc<idq> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        return new thj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((idq) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
