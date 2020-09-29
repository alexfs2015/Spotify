package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: hxy reason: default package */
public final class hxy implements wig<hxx> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Scheduler> c;
    private final wzi<Scheduler> d;

    private hxy(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hxy a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4) {
        return new hxy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hxx((RxResolver) this.a.get(), (rwl) this.b.get(), (Scheduler) this.c.get(), (Scheduler) this.d.get());
    }
}
