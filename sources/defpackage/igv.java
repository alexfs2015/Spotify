package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: igv reason: default package */
public final class igv implements vua<igu> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<Scheduler> c;

    private igv(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static igv a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Scheduler> wlc3) {
        return new igv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new igu((RxResolver) this.a.get(), (rnf) this.b.get(), this.c);
    }
}
