package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: hrj reason: default package */
public final class hrj implements vua<hri> {
    private final wlc<hvl> a;
    private final wlc<Context> b;
    private final wlc<hec> c;
    private final wlc<RxResolver> d;
    private final wlc<Scheduler> e;

    private hrj(wlc<hvl> wlc, wlc<Context> wlc2, wlc<hec> wlc3, wlc<RxResolver> wlc4, wlc<Scheduler> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hrj a(wlc<hvl> wlc, wlc<Context> wlc2, wlc<hec> wlc3, wlc<RxResolver> wlc4, wlc<Scheduler> wlc5) {
        hrj hrj = new hrj(wlc, wlc2, wlc3, wlc4, wlc5);
        return hrj;
    }

    public final /* synthetic */ Object get() {
        hri hri = new hri((hvl) this.a.get(), (Context) this.b.get(), (hec) this.c.get(), (RxResolver) this.d.get(), (Scheduler) this.e.get());
        return hri;
    }
}
