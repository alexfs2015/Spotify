package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateFlowableModule.CC;
import io.reactivex.Flowable;

public final class PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory implements vua<Flowable<PlayerState>> {
    private final wlc<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory(wlc<RxPlayerState> wlc) {
        this.rxPlayerStateProvider = wlc;
    }

    public final Flowable<PlayerState> get() {
        return providePlayerStateFlowable((RxPlayerState) this.rxPlayerStateProvider.get());
    }

    public static PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory create(wlc<RxPlayerState> wlc) {
        return new PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory(wlc);
    }

    public static Flowable<PlayerState> providePlayerStateFlowable(RxPlayerState rxPlayerState) {
        return (Flowable) vuf.a(CC.providePlayerStateFlowable(rxPlayerState), "Cannot return null from a non-@Nullable @Provides method");
    }
}
