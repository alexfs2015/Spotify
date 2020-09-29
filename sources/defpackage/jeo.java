package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: jeo reason: default package */
public final class jeo implements vua<jen> {
    private final wlc<RxResolver> a;
    private final wlc<ObjectMapper> b;
    private final wlc<Scheduler> c;

    private jeo(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jeo a(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<Scheduler> wlc3) {
        return new jeo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jen((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (Scheduler) this.c.get());
    }
}
