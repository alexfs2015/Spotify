package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: jzt reason: default package */
public final class jzt implements vua<jzs> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<Scheduler> c;

    private jzt(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jzt a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3) {
        return new jzt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jzs((RxResolver) this.a.get(), (rnf) this.b.get(), (Scheduler) this.c.get());
    }
}
