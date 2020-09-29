package com.spotify.cosmos.android;

public final class RxFireAndForgetResolver_Factory implements vua<RxFireAndForgetResolver> {
    private final wlc<RxResolver> rxResolverProvider;

    public RxFireAndForgetResolver_Factory(wlc<RxResolver> wlc) {
        this.rxResolverProvider = wlc;
    }

    public final RxFireAndForgetResolver get() {
        return new RxFireAndForgetResolver((RxResolver) this.rxResolverProvider.get());
    }

    public static RxFireAndForgetResolver_Factory create(wlc<RxResolver> wlc) {
        return new RxFireAndForgetResolver_Factory(wlc);
    }

    public static RxFireAndForgetResolver newInstance(RxResolver rxResolver) {
        return new RxFireAndForgetResolver(rxResolver);
    }
}
