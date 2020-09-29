package com.spotify.mobile.android.cosmos.player.v2.rx;

public final class RxPlayerState_Factory implements vua<RxPlayerState> {
    private final wlc<PlayerStateResolver> playerStateResolverProvider;

    public RxPlayerState_Factory(wlc<PlayerStateResolver> wlc) {
        this.playerStateResolverProvider = wlc;
    }

    public final RxPlayerState get() {
        return new RxPlayerState((PlayerStateResolver) this.playerStateResolverProvider.get());
    }

    public static RxPlayerState_Factory create(wlc<PlayerStateResolver> wlc) {
        return new RxPlayerState_Factory(wlc);
    }

    public static RxPlayerState newInstance(PlayerStateResolver playerStateResolver) {
        return new RxPlayerState(playerStateResolver);
    }
}
