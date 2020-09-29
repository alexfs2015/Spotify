package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: ueo reason: default package */
public final class ueo implements wig<uel> {
    private final wzi<Context> a;
    private final wzi<b> b;
    private final wzi<jtz> c;
    private final wzi<Scheduler> d;

    private ueo(wzi<Context> wzi, wzi<b> wzi2, wzi<jtz> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ueo a(wzi<Context> wzi, wzi<b> wzi2, wzi<jtz> wzi3, wzi<Scheduler> wzi4) {
        return new ueo(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new uel((Context) this.a.get(), (b) this.b.get(), (jtz) this.c.get(), (Scheduler) this.d.get());
    }
}
