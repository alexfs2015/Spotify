package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: iji reason: default package */
public final class iji implements wig<ijh> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Scheduler> c;

    private iji(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iji a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Scheduler> wzi3) {
        return new iji(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ijh((RxResolver) this.a.get(), (rwl) this.b.get(), this.c);
    }
}
