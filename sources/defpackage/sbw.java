package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: sbw reason: default package */
public final class sbw implements c {
    private final sbs a;
    private final hgy b;
    private final lbi c;
    private final Scheduler d;
    private final SerialDisposable e = new SerialDisposable();

    /* renamed from: sbw$a */
    static class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public sbw(hgy hgy, lbi lbi, sbs sbs, Scheduler scheduler) {
        this.a = (sbs) fbp.a(sbs);
        this.b = (hgy) fbp.a(hgy);
        this.c = (lbi) fbp.a(lbi);
        this.d = (Scheduler) fbp.a(scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (!aVar.a) {
            this.a.b();
            return;
        }
        if (aVar.b) {
            this.a.a();
        }
    }

    public final void ai_() {
        this.e.a(Observable.a((ObservableSource<? extends T1>) this.b.a(sbr.a).a(this.d).j(), (ObservableSource<? extends T2>) this.c.a().a(this.d), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$aLPt9lFRPepnyZzQMeW_p6SxoK0.INSTANCE).a((Consumer<? super T>) new $$Lambda$sbw$qZ0IgCtBWN9G5DBX7dLmWXfWPW4<Object>(this), (Consumer<? super Throwable>) $$Lambda$sbw$N1ClTDU9Fmk08ovZxSDLyvfOJDo.INSTANCE));
    }

    public final void aj_() {
        this.e.a(Disposables.a());
        this.a.b();
    }

    public final String c() {
        return "PlaylistStoryPrefetcher";
    }
}
