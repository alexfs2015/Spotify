package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;
import io.reactivex.Scheduler;

/* renamed from: mkd reason: default package */
public final class mkd implements wig<mkc> {
    private final wzi<Scheduler> a;
    private final wzi<gmn> b;
    private final wzi<FireAndForgetResolver> c;

    private mkd(wzi<Scheduler> wzi, wzi<gmn> wzi2, wzi<FireAndForgetResolver> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mkd a(wzi<Scheduler> wzi, wzi<gmn> wzi2, wzi<FireAndForgetResolver> wzi3) {
        return new mkd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mkc((Scheduler) this.a.get(), (gmn) this.b.get(), (FireAndForgetResolver) this.c.get());
    }
}
