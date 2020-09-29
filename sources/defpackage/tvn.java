package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: tvn reason: default package */
public final class tvn extends c {
    boolean a = true;
    private final SerialDisposable b = new SerialDisposable();
    private final tvp c;
    private final Scheduler d;

    public tvn(tvp tvp, a aVar, Scheduler scheduler) {
        this.c = tvp;
        this.d = scheduler;
        aVar.a(this);
    }

    public final void c() {
        super.c();
        this.b.a(this.c.a().a(this.d).a((Consumer<? super T>) new $$Lambda$tvn$P5LXYiYoHgy7fGd2ADbHwDGpFsM<Object>(this), (Consumer<? super Throwable>) $$Lambda$tvn$BHKCk2EukxufN1GQxU6aMwqmF0.INSTANCE));
    }

    public final void a() {
        super.a();
        this.b.a(Disposables.a());
    }

    /* access modifiers changed from: private */
    public void a(Boolean bool) {
        this.a = bool.booleanValue();
    }
}
