package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: uhq reason: default package */
public final class uhq extends c {
    boolean a = true;
    private final SerialDisposable b = new SerialDisposable();
    private final uhs c;
    private final Scheduler d;

    public uhq(uhs uhs, a aVar, Scheduler scheduler) {
        this.c = uhs;
        this.d = scheduler;
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public void a(Boolean bool) {
        this.a = bool.booleanValue();
    }

    public final void a() {
        super.a();
        this.b.a(Disposables.a());
    }

    public final void c() {
        super.c();
        this.b.a(this.c.a().a(this.d).a((Consumer<? super T>) new $$Lambda$uhq$BAxJ91Cudd7yiwWtZ8oNGgsNE<Object>(this), (Consumer<? super Throwable>) $$Lambda$uhq$LYbao1wb7WUaHuMdYBsm0d6F8VQ.INSTANCE));
    }
}
