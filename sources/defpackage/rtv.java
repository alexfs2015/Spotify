package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: rtv reason: default package */
public final class rtv {
    private final kxz a;
    private final ruc b;
    private final rtn c;
    private final Scheduler d;
    private Disposable e = Disposables.b();

    public rtv(kxz kxz, rtn rtn, Scheduler scheduler, ruc ruc) {
        this.a = kxz;
        this.c = rtn;
        this.d = scheduler;
        this.b = ruc;
    }

    public final void a() {
        this.e = this.a.a().b(1).a(Functions.a()).a(this.d).d((Consumer<? super T>) new $$Lambda$rtv$EMghhZjTbwfJoyVq_AoFQvA0Ops<Object>(this));
    }

    public final void b() {
        if (!this.e.b()) {
            this.e.bf_();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        for (rtm f : this.c.a()) {
            String f2 = f.f();
            Logger.c("Invalidating %s because of connectivity change", f2);
            this.b.a(f2);
        }
    }
}
