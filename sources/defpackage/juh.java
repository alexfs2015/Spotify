package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: juh reason: default package */
public final class juh implements vua<jug> {
    private final wlc<RxResolver> a;
    private final wlc<ObjectMapper> b;
    private final wlc<FireAndForgetResolver> c;
    private final wlc<Scheduler> d;

    private juh(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<FireAndForgetResolver> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static juh a(wlc<RxResolver> wlc, wlc<ObjectMapper> wlc2, wlc<FireAndForgetResolver> wlc3, wlc<Scheduler> wlc4) {
        return new juh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new jug((RxResolver) this.a.get(), (ObjectMapper) this.b.get(), (FireAndForgetResolver) this.c.get(), (Scheduler) this.d.get());
    }
}
