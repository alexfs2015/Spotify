package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: hvh reason: default package */
public final class hvh implements vua<hvg> {
    private final wlc<RxResolver> a;
    private final wlc<jrp> b;
    private final wlc<ObjectMapper> c;
    private final wlc<Scheduler> d;

    private hvh(wlc<RxResolver> wlc, wlc<jrp> wlc2, wlc<ObjectMapper> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hvh a(wlc<RxResolver> wlc, wlc<jrp> wlc2, wlc<ObjectMapper> wlc3, wlc<Scheduler> wlc4) {
        return new hvh(wlc, wlc2, wlc3, wlc4);
    }

    public static hvg a(RxResolver rxResolver, jrp jrp, ObjectMapper objectMapper, Scheduler scheduler) {
        return new hvg(rxResolver, jrp, objectMapper, scheduler);
    }

    public final /* synthetic */ Object get() {
        return new hvg((RxResolver) this.a.get(), (jrp) this.b.get(), (ObjectMapper) this.c.get(), (Scheduler) this.d.get());
    }
}
