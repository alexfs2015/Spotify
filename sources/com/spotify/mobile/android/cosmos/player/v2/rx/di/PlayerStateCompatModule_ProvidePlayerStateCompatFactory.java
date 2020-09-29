package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateCompatModule.CC;
import io.reactivex.Scheduler;

public final class PlayerStateCompatModule_ProvidePlayerStateCompatFactory implements vua<PlayerStateCompat> {
    private final wlc<Scheduler> computationSchedulerProvider;
    private final wlc<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wlc<RxPlayerState> wlc, wlc<Scheduler> wlc2) {
        this.rxPlayerStateProvider = wlc;
        this.computationSchedulerProvider = wlc2;
    }

    public final PlayerStateCompat get() {
        return providePlayerStateCompat((RxPlayerState) this.rxPlayerStateProvider.get(), (Scheduler) this.computationSchedulerProvider.get());
    }

    public static PlayerStateCompatModule_ProvidePlayerStateCompatFactory create(wlc<RxPlayerState> wlc, wlc<Scheduler> wlc2) {
        return new PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wlc, wlc2);
    }

    public static PlayerStateCompat providePlayerStateCompat(RxPlayerState rxPlayerState, Scheduler scheduler) {
        return (PlayerStateCompat) vuf.a(CC.providePlayerStateCompat(rxPlayerState, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }
}
