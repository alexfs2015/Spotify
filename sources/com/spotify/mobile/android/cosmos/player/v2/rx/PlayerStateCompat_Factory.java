package com.spotify.mobile.android.cosmos.player.v2.rx;

import io.reactivex.Scheduler;

public final class PlayerStateCompat_Factory implements wig<PlayerStateCompat> {
    private final wzi<Scheduler> computationSchedulerProvider;
    private final wzi<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompat_Factory(wzi<RxPlayerState> wzi, wzi<Scheduler> wzi2) {
        this.rxPlayerStateProvider = wzi;
        this.computationSchedulerProvider = wzi2;
    }

    public static PlayerStateCompat_Factory create(wzi<RxPlayerState> wzi, wzi<Scheduler> wzi2) {
        return new PlayerStateCompat_Factory(wzi, wzi2);
    }

    public static PlayerStateCompat newInstance(RxPlayerState rxPlayerState, Scheduler scheduler) {
        return new PlayerStateCompat(rxPlayerState, scheduler);
    }

    public final PlayerStateCompat get() {
        return new PlayerStateCompat((RxPlayerState) this.rxPlayerStateProvider.get(), (Scheduler) this.computationSchedulerProvider.get());
    }
}
