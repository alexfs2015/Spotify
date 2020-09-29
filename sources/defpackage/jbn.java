package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: jbn reason: default package */
public final class jbn implements wig<jbm> {
    private final wzi<Context> a;
    private final wzi<Scheduler> b;

    private jbn(wzi<Context> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jbn a(wzi<Context> wzi, wzi<Scheduler> wzi2) {
        return new jbn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jbm((Context) this.a.get(), (Scheduler) this.b.get());
    }
}
