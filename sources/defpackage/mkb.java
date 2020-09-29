package defpackage;

import android.app.Application;
import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;
import io.reactivex.Scheduler;

/* renamed from: mkb reason: default package */
public final class mkb implements wig<mka> {
    private final wzi<Application> a;
    private final wzi<Handler> b;
    private final wzi<gmn> c;
    private final wzi<FireAndForgetResolver> d;
    private final wzi<gtp> e;
    private final wzi<gts> f;
    private final wzi<String> g;
    private final wzi<gdr> h;
    private final wzi<upf> i;
    private final wzi<rym> j;
    private final wzi<Scheduler> k;

    private mkb(wzi<Application> wzi, wzi<Handler> wzi2, wzi<gmn> wzi3, wzi<FireAndForgetResolver> wzi4, wzi<gtp> wzi5, wzi<gts> wzi6, wzi<String> wzi7, wzi<gdr> wzi8, wzi<upf> wzi9, wzi<rym> wzi10, wzi<Scheduler> wzi11) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
    }

    public static mkb a(wzi<Application> wzi, wzi<Handler> wzi2, wzi<gmn> wzi3, wzi<FireAndForgetResolver> wzi4, wzi<gtp> wzi5, wzi<gts> wzi6, wzi<String> wzi7, wzi<gdr> wzi8, wzi<upf> wzi9, wzi<rym> wzi10, wzi<Scheduler> wzi11) {
        mkb mkb = new mkb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return mkb;
    }

    public final /* synthetic */ Object get() {
        mka mka = new mka((Application) this.a.get(), (Handler) this.b.get(), (gmn) this.c.get(), (FireAndForgetResolver) this.d.get(), this.e, (gts) this.f.get(), (String) this.g.get(), (gdr) this.h.get(), (upf) this.i.get(), (rym) this.j.get(), (Scheduler) this.k.get());
        return mka;
    }
}
