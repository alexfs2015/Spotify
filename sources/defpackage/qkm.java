package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qkm reason: default package */
public final class qkm implements vua<qkl> {
    private final wlc<qir> a;
    private final wlc<a> b;
    private final wlc<Scheduler> c;
    private final wlc<qjl> d;
    private final wlc<qjp> e;
    private final wlc<qix> f;
    private final wlc<qja> g;

    private qkm(wlc<qir> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3, wlc<qjl> wlc4, wlc<qjp> wlc5, wlc<qix> wlc6, wlc<qja> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static qkm a(wlc<qir> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3, wlc<qjl> wlc4, wlc<qjp> wlc5, wlc<qix> wlc6, wlc<qja> wlc7) {
        qkm qkm = new qkm(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return qkm;
    }

    public final /* synthetic */ Object get() {
        qkl qkl = new qkl(vtz.b(this.a), (a) this.b.get(), (Scheduler) this.c.get(), (qjl) this.d.get(), (qjp) this.e.get(), (qix) this.f.get(), (qja) this.g.get());
        return qkl;
    }
}
