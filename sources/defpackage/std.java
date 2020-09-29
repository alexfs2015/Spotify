package defpackage;

import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;

/* renamed from: std reason: default package */
public final class std implements c {
    private final stc a;
    private final Scheduler b;
    private Disposable c;

    std(stc stc, Scheduler scheduler) {
        this.a = stc;
        this.b = scheduler;
    }

    public final void ai_() {
        stc stc = this.a;
        stc.getClass();
        this.c = Completable.a((Runnable) new $$Lambda$8829M8gbp28OWsRVCtdHEcnVx8(stc)).b(this.b).a(Functions.c()).d();
    }

    public final void aj_() {
        this.c.bd_();
    }

    public final String c() {
        return "DeviceIdentifierLogger";
    }
}
