package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxResolverImpl;
import io.reactivex.Scheduler;

/* renamed from: gmr reason: default package */
public final class gmr implements wig<RxResolver> {
    private final wzi<Context> a;
    private final wzi<RxCosmos> b;
    private final wzi<Scheduler> c;
    private final wzi<Scheduler> d;

    private gmr(wzi<Context> wzi, wzi<RxCosmos> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static gmr a(wzi<Context> wzi, wzi<RxCosmos> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4) {
        return new gmr(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (RxResolver) wil.a(new RxResolverImpl(((RxCosmos) this.b.get()).getRouter((Context) this.a.get(), (Scheduler) this.c.get()), (Scheduler) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
