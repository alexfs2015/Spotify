package com.spotify.mobile.android.cosmos.player.v2.rx;

import io.reactivex.Scheduler;

public final class PlayerStateCompat_Factory implements vua<PlayerStateCompat> {
    private final wlc<Scheduler> computationSchedulerProvider;
    private final wlc<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompat_Factory(wlc<RxPlayerState> wlc, wlc<Scheduler> wlc2) {
        this.rxPlayerStateProvider = wlc;
        this.computationSchedulerProvider = wlc2;
    }

    public final PlayerStateCompat get() {
        return new PlayerStateCompat((RxPlayerState) this.rxPlayerStateProvider.get(), (Scheduler) this.computationSchedulerProvider.get());
    }

    public static PlayerStateCompat_Factory create(wlc<RxPlayerState> wlc, wlc<Scheduler> wlc2) {
        return new PlayerStateCompat_Factory(wlc, wlc2);
    }

    public static PlayerStateCompat newInstance(RxPlayerState rxPlayerState, Scheduler scheduler) {
        return new PlayerStateCompat(rxPlayerState, scheduler);
    }
}
