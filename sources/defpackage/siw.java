package defpackage;

import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;

/* renamed from: siw reason: default package */
public final class siw implements c {
    private final siv a;
    private final Scheduler b;
    private Disposable c;

    public final String c() {
        return "DeviceIdentifierLogger";
    }

    siw(siv siv, Scheduler scheduler) {
        this.a = siv;
        this.b = scheduler;
    }

    public final void ai_() {
        siv siv = this.a;
        siv.getClass();
        this.c = Completable.a((Runnable) new $$Lambda$xZX7m9GRrvwPyyddvaOpzLWMVFo(siv)).b(this.b).a(Functions.c()).d();
    }

    public final void aj_() {
        this.c.bf_();
    }
}
