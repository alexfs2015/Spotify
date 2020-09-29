package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: gkt reason: default package */
public final class gkt implements vua<gks> {
    private final wlc<RxResolver> a;
    private final wlc<ObjectMapper> b;
    private final wlc<Scheduler> c;

    private gkt(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gkt a(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        return new gkt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gks((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get());
    }
}
