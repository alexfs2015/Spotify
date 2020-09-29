package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

public final class SessionClientImpl_Factory implements vua<SessionClientImpl> {
    private final wlc<Cosmonaut> cosmonautProvider;
    private final wlc<RxRouter> rxRouterProvider;

    public SessionClientImpl_Factory(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        this.cosmonautProvider = wlc;
        this.rxRouterProvider = wlc2;
    }

    public final SessionClientImpl get() {
        return new SessionClientImpl((Cosmonaut) this.cosmonautProvider.get(), (RxRouter) this.rxRouterProvider.get());
    }

    public static SessionClientImpl_Factory create(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        return new SessionClientImpl_Factory(wlc, wlc2);
    }

    public static SessionClientImpl newInstance(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return new SessionClientImpl(cosmonaut, rxRouter);
    }
}
