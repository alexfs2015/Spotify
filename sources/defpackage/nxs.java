package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.InstallReferrerReceiver;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: nxs reason: default package */
public final class nxs {
    final SerialDisposable a = new SerialDisposable();
    private final Flowable<SessionState> b;
    private final hxs c;
    private final nxv d;

    public nxs(Flowable<SessionState> flowable, a aVar, hxs hxs, nxv nxv) {
        this.b = flowable;
        this.c = hxs;
        this.d = nxv;
        aVar.a(new c() {
            public final void aN_() {
                super.aN_();
                nxs.this.a.bd_();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(SessionState sessionState) {
        return this.c.a().a(BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, hxr hxr) {
        Logger.b("LoginTimeReporter - Reporting login time %s", hxr.call());
        if (z) {
            nxv nxv = this.d;
            if (nxv.d.d()) {
                nxv.a(hxr, nxv.d.c(), nxv.d.b());
            }
            InstallReferrerReceiver.a(nxv.a, nxv.c);
            nxv.b.a();
            return;
        }
        nxv nxv2 = this.d;
        if (nxv2.d.d()) {
            String c2 = nxv2.d.c();
            gci.a((CharSequence) c2, "referralCode must be set");
            nxv2.a(hxr, c2, null);
        }
        InstallReferrerReceiver.a(nxv2.a, nxv2.c);
    }

    public final void a(boolean z) {
        this.a.a(this.b.a((Predicate<? super T>) $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE.INSTANCE).c(1).e(new $$Lambda$nxs$M2MRV1HiPzXu0pi66j4oRoq50tc(this)).c(1).a((Consumer<? super T>) new $$Lambda$nxs$qja5aWHUpa03NVmx7tMrhd3rgA<Object>(this, z), (Consumer<? super Throwable>) $$Lambda$nxs$ho0IvjwkvLcgCfX6Z4nJ0yZY0nc.INSTANCE));
    }
}
