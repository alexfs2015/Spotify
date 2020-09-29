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

/* renamed from: qmq reason: default package */
public final class qmq extends c implements a {
    private final qmp a;
    private final jjn b;
    private final qho c;
    private final qlz d;
    private final Scheduler e;
    private Disposable f = Disposables.b();
    private b g;

    public qmq(qmp qmp, jjn jjn, qho qho, qlz qlz, Scheduler scheduler, a aVar) {
        this.a = qmp;
        this.b = jjn;
        this.c = qho;
        this.d = qlz;
        this.e = scheduler;
        aVar.a(this);
    }

    public final void b() {
        qmp qmp = this.a;
        qmp.a.a(null, "to-skip-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void aN_() {
        this.g = null;
    }

    public final void d() {
        this.a.a(null, "to-skip-dialog", 0, InteractionType.HIT, Intent.NAVIGATE_FORWARD);
        this.g.c();
    }

    public final void aO_() {
        if (this.c.a() > 0) {
            this.f = this.d.a().a(this.e).a(Functions.b, (Consumer<? super Throwable>) $$Lambda$qmq$NwypiAZUmK873HrRnHl88cHyBMo.INSTANCE);
        }
        this.a.a(null, "to-skip-dialog", 0, InteractionType.HIT, Intent.SKIP);
        this.b.a.finish();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to complete taste onboarding complete request", new Object[0]);
        Assertion.a("Failed to complete artist onboarding request", th);
    }

    public final void a() {
        this.f.bf_();
        super.a();
    }
}
