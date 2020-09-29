package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;

/* renamed from: ogw reason: default package */
public final class ogw {
    private final Context a;
    private final jty b;
    private final ogy c;
    private final hgz d;
    private final hxx e;
    private final ohd f;
    private xip g = xon.b();

    public ogw(Context context, jty jty, ogy ogy, hgz hgz, hxx hxx, ohd ohd) {
        this.b = jty;
        this.a = context;
        this.c = ogy;
        this.d = hgz;
        this.e = hxx;
        this.f = ohd;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hfz a(SessionState sessionState, hfz hfz) {
        return hfz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SessionState sessionState) {
        return Boolean.valueOf(sessionState.loggedIn() && !sessionState.loggingOut());
    }

    /* access modifiers changed from: private */
    public void a(hfz hfz) {
        this.c.a(this.f, PremiumSignupActivity.a(this.a, mfw.g().a(this.b).a()), hfz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in PaymentFailureChecker", th);
    }

    public final void a() {
        b();
        this.g = xii.a(wit.a((xfk<T>) this.e.a).c((xiy<? super T, Boolean>) $$Lambda$ogw$YyZD1c3_86JWtSs0gIksjdzHYzM.INSTANCE).b(), this.d.a("payment-state").e((xiy<? super T, ? extends R>) $$Lambda$OvohVAlNRCyAdWdqW6qlfTOmNTM.INSTANCE).b(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$ogw$EsM40NwwSwxsyuRvlt4V2sfbUwg.INSTANCE).a((xis<? super T>) new $$Lambda$ogw$_bMuERtT9xWXgIPu61h1dw_JHk<Object>(this), (xis<Throwable>) $$Lambda$ogw$ZDiNABZbqtPcG6PvbJ86AIBFR5k.INSTANCE);
    }

    public final void b() {
        this.g.unsubscribe();
    }
}
