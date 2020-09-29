package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxResolverImpl;
import io.reactivex.Scheduler;

/* renamed from: gld reason: default package */
public final class gld implements vua<RxResolver> {
    private final wlc<Context> a;
    private final wlc<RxCosmos> b;
    private final wlc<Scheduler> c;
    private final wlc<Scheduler> d;

    private gld(wlc<Context> wlc, wlc<RxCosmos> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static gld a(wlc<Context> wlc, wlc<RxCosmos> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        return new gld(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (RxResolver) vuf.a(new RxResolverImpl(((RxCosmos) this.b.get()).getRouter((Context) this.a.get(), (Scheduler) this.c.get()), (Scheduler) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
