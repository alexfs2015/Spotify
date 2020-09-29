package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

public final class PartnerAccountLinkingSessionHelper {
    private final hxx a;

    public enum State {
        LOGGED_IN,
        NOT_LOGGED_IN,
        ERROR
    }

    public PartnerAccountLinkingSessionHelper(hxx hxx) {
        this.a = hxx;
    }

    /* access modifiers changed from: private */
    public static Observable<State> a(SessionState sessionState) {
        return Observable.b(!sessionState.loggedIn() ? State.NOT_LOGGED_IN : State.LOGGED_IN);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(SessionState sessionState) {
        return !sessionState.loggingIn() && !sessionState.loggingOut();
    }

    public final Observable<State> a() {
        return this.a.a.j().a((Predicate<? super T>) $$Lambda$PartnerAccountLinkingSessionHelper$pGmeWoD_vbXVGIpsWnWYUmteGns.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$PartnerAccountLinkingSessionHelper$BfoD5WTZRx7Ed7tZVZuS0BxhFE8.INSTANCE, false).a(Functions.a());
    }
}
