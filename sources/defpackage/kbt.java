package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: kbt reason: default package */
public final class kbt implements wig<kbs> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Scheduler> c;

    private kbt(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kbt a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3) {
        return new kbt(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kbs((RxResolver) this.a.get(), (rwl) this.b.get(), (Scheduler) this.c.get());
    }
}
