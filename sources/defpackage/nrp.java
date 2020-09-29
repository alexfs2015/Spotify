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

/* renamed from: nrp reason: default package */
public final class nrp {
    final SerialDisposable a = new SerialDisposable();
    private final Flowable<SessionState> b;
    private final hvg c;
    private final nrs d;

    public nrp(Flowable<SessionState> flowable, a aVar, hvg hvg, nrs nrs) {
        this.b = flowable;
        this.c = hvg;
        this.d = nrs;
        aVar.a(new c() {
            public final void aP_() {
                super.aP_();
                nrp.this.a.bf_();
            }
        });
    }

    public final void a(boolean z) {
        this.a.a(this.b.a((Predicate<? super T>) $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE.INSTANCE).c(1).e(new $$Lambda$nrp$HfBbuXVNT5Ho3ZV_0WUjtkcCQ(this)).c(1).a((Consumer<? super T>) new $$Lambda$nrp$YSGo9_yHBakW760XZXKMc4FplGM<Object>(this, z), (Consumer<? super Throwable>) $$Lambda$nrp$0dDaD15KJ90QKeNYmjOXNclMqSk.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(SessionState sessionState) {
        return this.c.a().a(BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, hvf hvf) {
        Logger.b("LoginTimeReporter - Reporting login time %s", hvf.call());
        if (z) {
            nrs nrs = this.d;
            if (nrs.d.d()) {
                nrs.a(hvf, nrs.d.c(), nrs.d.b());
            }
            InstallReferrerReceiver.a(nrs.a, nrs.c);
            nrs.b.a();
            return;
        }
        nrs nrs2 = this.d;
        if (nrs2.d.d()) {
            String c2 = nrs2.d.c();
            gbk.a((CharSequence) c2, "referralCode must be set");
            nrs2.a(hvf, c2, null);
        }
        InstallReferrerReceiver.a(nrs2.a, nrs2.c);
    }
}
