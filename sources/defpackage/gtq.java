package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: gtq reason: default package */
public final class gtq implements wig<gtp> {
    private final wzi<RxResolver> a;
    private final wzi<gmf> b;
    private final wzi<Scheduler> c;

    private gtq(wzi<RxResolver> wzi, wzi<gmf> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gtq a(wzi<RxResolver> wzi, wzi<gmf> wzi2, wzi<Scheduler> wzi3) {
        return new gtq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gtp((RxResolver) this.a.get(), (gmf) this.b.get(), (Scheduler) this.c.get());
    }
}
