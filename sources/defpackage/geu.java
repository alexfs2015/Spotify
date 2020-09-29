package defpackage;

import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: geu reason: default package */
public final class geu {
    public final SerialDisposable a = new SerialDisposable();
    private final gev b;
    private final boolean c;
    private final Scheduler d;
    private final Scheduler e;

    public geu(gev gev, boolean z, Scheduler scheduler, Scheduler scheduler2) {
        this.b = gev;
        this.c = z;
        this.d = scheduler;
        this.e = scheduler2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gcp gcp, EffortlessLoginPrerequisitesResult effortlessLoginPrerequisitesResult) {
        if (effortlessLoginPrerequisitesResult.enabled() && effortlessLoginPrerequisitesResult.fullName().b()) {
            gcp.accept(effortlessLoginPrerequisitesResult.fullName().c());
        }
    }

    public final void a(gcp<String> gcp) {
        if (this.c) {
            this.a.a(this.b.W_().b(this.d).a(this.e).a((Consumer<? super T>) new $$Lambda$geu$tDfVDAR56RETWYfOIIqKFDSYVI<Object>(gcp), (Consumer<? super Throwable>) $$Lambda$geu$XVAW7cEIRn3nTYCfSY38g1lRc60.INSTANCE));
        }
    }
}
