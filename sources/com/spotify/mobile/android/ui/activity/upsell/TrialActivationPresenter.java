package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

public final class TrialActivationPresenter {
    final jka a;
    wuk b;
    private final wud<SessionState> c;
    private final kyj d;
    private final jjf e;
    private final jrp f;

    public static class ActivationRequestFailed extends Exception {
        private static final long serialVersionUID = -6312514027692230924L;

        protected ActivationRequestFailed() {
        }
    }

    public TrialActivationPresenter(jkc jkc, jka jka, kyj kyj, jjf jjf, jrp jrp, wum wum) {
        this.a = jka;
        wud a2 = jkc.a();
        wud a3 = vun.a((wrf<T>) ((hvl) ggw.a(hvl.class)).a);
        this.d = kyj;
        this.e = jjf;
        this.f = jrp;
        this.c = a2.i(new wut() {
            public final Object call(Object obj) {
                return TrialActivationPresenter.a(wud.this, (Boolean) obj);
            }
        }).i($$Lambda$TrialActivationPresenter$HG2jBATrRVxKEBDicQy7PpSmk4s.INSTANCE).j($$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc.INSTANCE).c(3, TimeUnit.MINUTES, vun.a(((heg) ggw.a(heg.class)).b())).a(vun.a(((heg) ggw.a(heg.class)).c())).a((b<? extends R, ? super T>) new wvy<Object,Object>(wum));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(wud wud, Boolean bool) {
        if (bool.booleanValue()) {
            return wud;
        }
        return wud.a((Throwable) new ActivationRequestFailed());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud c(SessionState sessionState) {
        return !sessionState.loggedIn() ? wud.a((Throwable) new IllegalStateException("User is logged out")) : ScalarSynchronousObservable.d(sessionState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        this.a.b();
        if (!this.d.c()) {
            this.a.c();
        }
    }

    public final void a() {
        jjf jjf = this.e;
        bf bfVar = new bf(null, udt.bb.a(), ViewUris.aS.toString(), null, 0, null, "trial_activation_started", "notification", (double) this.f.a());
        jjf.a(bfVar);
        this.a.a();
        this.b = this.c.a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                TrialActivationPresenter.this.a((SessionState) obj);
            }
        }, (wun<Throwable>) new wun() {
            public final void call(Object obj) {
                TrialActivationPresenter.this.a((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        jjf jjf = this.e;
        bf bfVar = new bf(null, udt.bb.a(), ViewUris.aS.toString(), th.toString(), 0, null, "trial_activation_failed", "notification", (double) this.f.a());
        jjf.a(bfVar);
        this.a.b();
        if (!(th instanceof IllegalStateException)) {
            this.a.d();
        }
    }
}
