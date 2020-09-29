package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;

/* renamed from: oae reason: default package */
public final class oae {
    private final Context a;
    private final jro b;
    private final oag c;
    private final hed d;
    private final hvl e;
    private final oal f;
    private wuk g = xaj.b();

    /* access modifiers changed from: private */
    public static /* synthetic */ hdd a(SessionState sessionState, hdd hdd) {
        return hdd;
    }

    public oae(Context context, jro jro, oag oag, hed hed, hvl hvl, oal oal) {
        this.b = jro;
        this.a = context;
        this.c = oag;
        this.d = hed;
        this.e = hvl;
        this.f = oal;
    }

    public final void a() {
        b();
        this.g = wud.a(vun.a((wrf<T>) this.e.a).c((wut<? super T, Boolean>) $$Lambda$oae$REmo6LHTCeZ7hVHmmhC_BiTeylI.INSTANCE).b(), this.d.a("payment-state").f($$Lambda$hOhb2TcXOwcmh6Mb9JF3AaUP7Ng.INSTANCE).b(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$oae$l0_Ka3wGJo2Mjpy8nq89AvKd8CY.INSTANCE).a((wun<? super T>) new $$Lambda$oae$g1xVO602OV_eepmChnZ2DZYPPA8<Object>(this), (wun<Throwable>) $$Lambda$oae$gZzFw2rQNGUXHXCAldeUxuCNke8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SessionState sessionState) {
        return Boolean.valueOf(sessionState.loggedIn() && !sessionState.loggingOut());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in PaymentFailureChecker", th);
    }

    public final void b() {
        this.g.unsubscribe();
    }

    /* access modifiers changed from: private */
    public void a(hdd hdd) {
        this.c.a(this.f, PremiumSignupActivity.a(this.a, mbt.g().a(this.b).a()), hdd);
    }
}
