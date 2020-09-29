package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: sdg reason: default package */
public final class sdg {
    private final lbi a;
    private final sdo b;
    private final scx c;
    private final Scheduler d;
    private Disposable e = Disposables.b();

    public sdg(lbi lbi, scx scx, Scheduler scheduler, sdo sdo) {
        this.a = lbi;
        this.c = scx;
        this.d = scheduler;
        this.b = sdo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        for (scw f : this.c.a()) {
            String f2 = f.f();
            Logger.c("Invalidating %s because of connectivity change", f2);
            this.b.a(f2);
        }
    }

    public final void a() {
        this.e = this.a.a().b(1).a(Functions.a()).a(this.d).d((Consumer<? super T>) new $$Lambda$sdg$TmP4Y1bhxPxDv1j8VkPy3b5qnnQ<Object>(this));
    }

    public final void b() {
        if (!this.e.b()) {
            this.e.bd_();
        }
    }
}
