package defpackage;

import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gdj reason: default package */
public final class gdj {
    public final SerialDisposable a = new SerialDisposable();
    private final gdk b;
    private final boolean c;
    private final Scheduler d;
    private final Scheduler e;

    public gdj(gdk gdk, boolean z, Scheduler scheduler, Scheduler scheduler2) {
        this.b = gdk;
        this.c = z;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final void a(gbr<String> gbr) {
        if (this.c) {
            this.a.a(this.b.W_().b(this.d).a(this.e).a((Consumer<? super T>) new $$Lambda$gdj$LzL0_kXL2wiZiwhk7wLnW0R_wYk<Object>(gbr), (Consumer<? super Throwable>) $$Lambda$gdj$4xWZKyNnjFDRThOjDRSFLmC3WG8.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gbr gbr, EffortlessLoginPrerequisitesResult effortlessLoginPrerequisitesResult) {
        if (effortlessLoginPrerequisitesResult.enabled() && effortlessLoginPrerequisitesResult.fullName().b()) {
            gbr.accept(effortlessLoginPrerequisitesResult.fullName().c());
        }
    }
}
