package com.spotify.cosmos.android;

public final class RxFireAndForgetResolver_Factory implements wig<RxFireAndForgetResolver> {
    private final wzi<RxResolver> rxResolverProvider;

    public RxFireAndForgetResolver_Factory(wzi<RxResolver> wzi) {
        this.rxResolverProvider = wzi;
    }

    public static RxFireAndForgetResolver_Factory create(wzi<RxResolver> wzi) {
        return new RxFireAndForgetResolver_Factory(wzi);
    }

    public static RxFireAndForgetResolver newInstance(RxResolver rxResolver) {
        return new RxFireAndForgetResolver(rxResolver);
    }

    public final RxFireAndForgetResolver get() {
        return new RxFireAndForgetResolver((RxResolver) this.rxResolverProvider.get());
    }
}
