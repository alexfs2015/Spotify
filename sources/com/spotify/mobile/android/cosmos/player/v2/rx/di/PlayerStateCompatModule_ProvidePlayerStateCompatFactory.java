package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateCompatModule.CC;
import io.reactivex.Scheduler;

public final class PlayerStateCompatModule_ProvidePlayerStateCompatFactory implements wig<PlayerStateCompat> {
    private final wzi<Scheduler> computationSchedulerProvider;
    private final wzi<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wzi<RxPlayerState> wzi, wzi<Scheduler> wzi2) {
        this.rxPlayerStateProvider = wzi;
        this.computationSchedulerProvider = wzi2;
    }

    public static PlayerStateCompatModule_ProvidePlayerStateCompatFactory create(wzi<RxPlayerState> wzi, wzi<Scheduler> wzi2) {
        return new PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wzi, wzi2);
    }

    public static PlayerStateCompat providePlayerStateCompat(RxPlayerState rxPlayerState, Scheduler scheduler) {
        return (PlayerStateCompat) wil.a(CC.providePlayerStateCompat(rxPlayerState, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final PlayerStateCompat get() {
        return providePlayerStateCompat((RxPlayerState) this.rxPlayerStateProvider.get(), (Scheduler) this.computationSchedulerProvider.get());
    }
}
