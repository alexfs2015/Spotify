package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.service.session.SessionState;
import rx.internal.util.ScalarSynchronousObservable;

public final class PartnerAccountLinkingSessionHelper {
    private final hvl a;

    public enum State {
        LOGGED_IN,
        NOT_LOGGED_IN,
        ERROR
    }

    public PartnerAccountLinkingSessionHelper(hvl hvl) {
        this.a = hvl;
    }

    public final wud<State> a() {
        return vun.a((wrf<T>) this.a.a).c((wut<? super T, Boolean>) $$Lambda$PartnerAccountLinkingSessionHelper$S1vIdEbS8wMoNMznfNng7iu572Y.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$PartnerAccountLinkingSessionHelper$u5xiFVcyd5Vl6k8E9yAVWtHuA8U.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(SessionState sessionState) {
        return Boolean.valueOf(!sessionState.loggingIn() && !sessionState.loggingOut());
    }

    /* access modifiers changed from: private */
    public static wud<State> a(SessionState sessionState) {
        State state;
        if (!sessionState.loggedIn()) {
            state = State.NOT_LOGGED_IN;
        } else {
            state = State.LOGGED_IN;
        }
        return ScalarSynchronousObservable.d(state);
    }
}
