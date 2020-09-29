package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: quy reason: default package */
public final class quy extends c implements a {
    private final qux a;
    private final jlz b;
    private final qqc c;
    private final quh d;
    private final Scheduler e;
    private Disposable f = Disposables.b();
    private b g;

    public quy(qux qux, jlz jlz, qqc qqc, quh quh, Scheduler scheduler, a aVar) {
        this.a = qux;
        this.b = jlz;
        this.c = qqc;
        this.d = quh;
        this.e = scheduler;
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to complete taste onboarding complete request", new Object[0]);
        Assertion.a("Failed to complete artist onboarding request", th);
    }

    public final void a() {
        this.f.bd_();
        super.a();
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void aL_() {
        this.g = null;
    }

    public final void aM_() {
        if (this.c.a() > 0) {
            this.f = this.d.a().a(this.e).a(Functions.b, (Consumer<? super Throwable>) $$Lambda$quy$wM1k_P3qlw46mdicov6m8gvnnV8.INSTANCE);
        }
        this.a.a(null, "to-skip-dialog", 0, InteractionType.HIT, Intent.SKIP);
        this.b.a.finish();
    }

    public final void b() {
        qux qux = this.a;
        qux.a.a(null, "to-skip-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
    }

    public final void d() {
        this.a.a(null, "to-skip-dialog", 0, InteractionType.HIT, Intent.NAVIGATE_FORWARD);
        this.g.c();
    }
}
