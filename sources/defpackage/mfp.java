package defpackage;

import android.app.Application;
import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;
import io.reactivex.Scheduler;

/* renamed from: mfp reason: default package */
public final class mfp implements vua<mfo> {
    private final wlc<Application> a;
    private final wlc<Handler> b;
    private final wlc<gkz> c;
    private final wlc<FireAndForgetResolver> d;
    private final wlc<grn> e;
    private final wlc<grq> f;
    private final wlc<String> g;
    private final wlc<gcg> h;
    private final wlc<uck> i;
    private final wlc<rpg> j;
    private final wlc<Scheduler> k;

    private mfp(wlc<Application> wlc, wlc<Handler> wlc2, wlc<gkz> wlc3, wlc<FireAndForgetResolver> wlc4, wlc<grn> wlc5, wlc<grq> wlc6, wlc<String> wlc7, wlc<gcg> wlc8, wlc<uck> wlc9, wlc<rpg> wlc10, wlc<Scheduler> wlc11) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
    }

    public static mfp a(wlc<Application> wlc, wlc<Handler> wlc2, wlc<gkz> wlc3, wlc<FireAndForgetResolver> wlc4, wlc<grn> wlc5, wlc<grq> wlc6, wlc<String> wlc7, wlc<gcg> wlc8, wlc<uck> wlc9, wlc<rpg> wlc10, wlc<Scheduler> wlc11) {
        mfp mfp = new mfp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return mfp;
    }

    public final /* synthetic */ Object get() {
        mfo mfo = new mfo((Application) this.a.get(), (Handler) this.b.get(), (gkz) this.c.get(), (FireAndForgetResolver) this.d.get(), this.e, (grq) this.f.get(), (String) this.g.get(), (gcg) this.h.get(), (uck) this.i.get(), (rpg) this.j.get(), (Scheduler) this.k.get());
        return mfo;
    }
}
