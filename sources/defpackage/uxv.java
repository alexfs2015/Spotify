package defpackage;

import android.content.Context;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: uxv reason: default package */
public final class uxv implements wig<Flowable<Boolean>> {
    private final wzi<hxx> a;
    private final wzi<Scheduler> b;
    private final wzi<Context> c;
    private final wzi<jyg> d;

    private uxv(wzi<hxx> wzi, wzi<Scheduler> wzi2, wzi<Context> wzi3, wzi<jyg> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uxv a(wzi<hxx> wzi, wzi<Scheduler> wzi2, wzi<Context> wzi3, wzi<jyg> wzi4) {
        return new uxv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(new uxi((hxx) this.a.get(), (Scheduler) this.b.get(), (Context) this.c.get(), (jyg) this.d.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
