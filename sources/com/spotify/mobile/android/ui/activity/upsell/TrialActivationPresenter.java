package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

public final class TrialActivationPresenter {
    final jmm a;
    xip b;
    private final xii<SessionState> c;
    private final lbs d;
    private final jlr e;
    private final jtz f;

    public static class ActivationRequestFailed extends Exception {
        private static final long serialVersionUID = -6312514027692230924L;

        protected ActivationRequestFailed() {
        }
    }

    public TrialActivationPresenter(jmo jmo, jmm jmm, lbs lbs, jlr jlr, jtz jtz, xir xir) {
        this.a = jmm;
        xii a2 = jmo.a();
        xii a3 = wit.a((xfk<T>) ((hxx) gih.a(hxx.class)).a);
        this.d = lbs;
        this.e = jlr;
        this.f = jtz;
        this.c = a2.h(new xiy() {
            public final Object call(Object obj) {
                return TrialActivationPresenter.a(xii.this, (Boolean) obj);
            }
        }).h($$Lambda$TrialActivationPresenter$QRcyCq1pyrlJTkg3sowvb4AHmE.INSTANCE).i($$Lambda$TrialActivationPresenter$AHPjr9vlEiGhhcToHmVgvTdfDN0.INSTANCE).c(3, TimeUnit.MINUTES, wit.a(((hhc) gih.a(hhc.class)).b())).a(wit.a(((hhc) gih.a(hhc.class)).c())).a((b<? extends R, ? super T>) new xkd<Object,Object>(xir));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(xii xii, Boolean bool) {
        return bool.booleanValue() ? xii : xii.a((Throwable) new ActivationRequestFailed());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        this.a.b();
        if (!this.d.c()) {
            this.a.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        jlr jlr = this.e;
        String str = "tnsiaearload_i_fcvtiita";
        be beVar = r1;
        be beVar2 = new be(null, uqo.bb.a(), ViewUris.aR.toString(), th.toString(), 0, null, "trial_activation_failed", "notification", (double) this.f.a());
        jlr.a(beVar2);
        this.a.b();
        if (!(th instanceof IllegalStateException)) {
            this.a.d();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(SessionState sessionState) {
        String str = "mpmmuie";
        return Boolean.valueOf("premium".equals(sessionState.productType()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii c(SessionState sessionState) {
        if (sessionState.loggedIn()) {
            return ScalarSynchronousObservable.d(sessionState);
        }
        String str = "tuiooUd leeogssr  ";
        return xii.a((Throwable) new IllegalStateException("User is logged out"));
    }

    public final void a() {
        jlr jlr = this.e;
        String str = "_adiob_sancrietavtlttita";
        String str2 = "nitiaibntcoo";
        be beVar = r1;
        be beVar2 = new be(null, uqo.bb.a(), ViewUris.aR.toString(), null, 0, null, "trial_activation_started", "notification", (double) this.f.a());
        jlr.a(beVar2);
        this.a.a();
        this.b = this.c.a((xis<? super T>) new xis() {
            public final void call(Object obj) {
                TrialActivationPresenter.this.a((SessionState) obj);
            }
        }, (xis<Throwable>) new xis() {
            public final void call(Object obj) {
                TrialActivationPresenter.this.a((Throwable) obj);
            }
        });
    }
}
