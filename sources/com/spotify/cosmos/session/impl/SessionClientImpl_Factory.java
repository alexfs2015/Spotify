package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

public final class SessionClientImpl_Factory implements wig<SessionClientImpl> {
    private final wzi<Cosmonaut> cosmonautProvider;
    private final wzi<RxRouter> rxRouterProvider;

    public SessionClientImpl_Factory(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        this.cosmonautProvider = wzi;
        this.rxRouterProvider = wzi2;
    }

    public static SessionClientImpl_Factory create(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        return new SessionClientImpl_Factory(wzi, wzi2);
    }

    public static SessionClientImpl newInstance(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return new SessionClientImpl(cosmonaut, rxRouter);
    }

    public final SessionClientImpl get() {
        return new SessionClientImpl((Cosmonaut) this.cosmonautProvider.get(), (RxRouter) this.rxRouterProvider.get());
    }
}
