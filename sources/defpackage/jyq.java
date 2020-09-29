package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: jyq reason: default package */
public final class jyq implements vua<jzf> {
    private final wlc<RxResolver> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;
    private final wlc<jxn> d;
    private final wlc<List<kai>> e;
    private final wlc<Boolean> f;
    private final wlc<rnf> g;
    private final wlc<gbd> h;

    private jyq(wlc<RxResolver> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3, wlc<jxn> wlc4, wlc<List<kai>> wlc5, wlc<Boolean> wlc6, wlc<rnf> wlc7, wlc<gbd> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static jyq a(wlc<RxResolver> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3, wlc<jxn> wlc4, wlc<List<kai>> wlc5, wlc<Boolean> wlc6, wlc<rnf> wlc7, wlc<gbd> wlc8) {
        jyq jyq = new jyq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return jyq;
    }

    public final /* synthetic */ Object get() {
        RxResolver rxResolver = (RxResolver) this.a.get();
        Scheduler scheduler = (Scheduler) this.b.get();
        Scheduler scheduler2 = (Scheduler) this.c.get();
        jxn jxn = (jxn) this.d.get();
        vti b2 = vtz.b(this.e);
        boolean booleanValue = ((Boolean) this.f.get()).booleanValue();
        rnf rnf = (rnf) this.g.get();
        gbd gbd = (gbd) this.h.get();
        ArrayList arrayList = new ArrayList((Collection) b2.get());
        if (booleanValue) {
            arrayList.add(new gcc(gbd.a(), new jxw()));
        }
        jzf jzf = new jzf(rxResolver, scheduler, scheduler2, jxn, arrayList, rnf);
        return (jzf) vuf.a(jzf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
