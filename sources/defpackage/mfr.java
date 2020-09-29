package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;
import io.reactivex.Scheduler;

/* renamed from: mfr reason: default package */
public final class mfr implements vua<mfq> {
    private final wlc<Scheduler> a;
    private final wlc<gkz> b;
    private final wlc<FireAndForgetResolver> c;

    private mfr(wlc<Scheduler> wlc, wlc<gkz> wlc2, wlc<FireAndForgetResolver> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mfr a(wlc<Scheduler> wlc, wlc<gkz> wlc2, wlc<FireAndForgetResolver> wlc3) {
        return new mfr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mfq((Scheduler) this.a.get(), (gkz) this.b.get(), (FireAndForgetResolver) this.c.get());
    }
}
