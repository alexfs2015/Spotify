package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: rsp reason: default package */
public final class rsp implements c {
    private final rsl a;
    private final hec b;
    private final kxz c;
    private final Scheduler d;
    private final SerialDisposable e = new SerialDisposable();

    /* renamed from: rsp$a */
    static class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public final String c() {
        return "PlaylistStoryPrefetcher";
    }

    public rsp(hec hec, kxz kxz, rsl rsl, Scheduler scheduler) {
        this.a = (rsl) fay.a(rsl);
        this.b = (hec) fay.a(hec);
        this.c = (kxz) fay.a(kxz);
        this.d = (Scheduler) fay.a(scheduler);
    }

    public final void ai_() {
        this.e.a(Observable.a((ObservableSource<? extends T1>) this.b.a(rsk.a).a(this.d).j(), (ObservableSource<? extends T2>) this.c.a().a(this.d), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$7ouazzs8WAMI9fMZ19loZaQPvUI.INSTANCE).a((Consumer<? super T>) new $$Lambda$rsp$qreMehCLlLncu3PywkHlutyX3pQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$rsp$S_YtRSANQU7FybFZkf5zrVTPDvM.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (!aVar.a) {
            this.a.c();
            return;
        }
        if (aVar.b && this.a.b()) {
            this.a.a();
        }
    }

    public final void aj_() {
        this.e.a(Disposables.a());
        this.a.c();
    }
}
