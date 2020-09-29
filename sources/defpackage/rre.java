package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: rre reason: default package */
public final class rre {
    private final rrg a;
    private final Scheduler b;

    public rre(rrg rrg, Scheduler scheduler) {
        this.a = rrg;
        this.b = scheduler;
    }

    public final Disposable a(gnj gnj) {
        return this.a.a().a(this.b).a((Consumer<? super T>) new $$Lambda$rre$xbLHHYROz0rhRXDdvA9qcHSKTzs<Object>(gnj), (Consumer<? super Throwable>) new $$Lambda$rre$umSCWtamTllX2qe6nuqMAdBpvVs<Object>(gnj));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gnj gnj, Boolean bool) {
        if (bool.booleanValue()) {
            gnj.e();
        } else {
            gnj.d();
        }
    }
}
