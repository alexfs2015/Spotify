package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateFlowableModule.CC;
import io.reactivex.Flowable;

public final class PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory implements wig<Flowable<PlayerState>> {
    private final wzi<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory(wzi<RxPlayerState> wzi) {
        this.rxPlayerStateProvider = wzi;
    }

    public static PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory create(wzi<RxPlayerState> wzi) {
        return new PlayerStateFlowableModule_ProvidePlayerStateFlowableFactory(wzi);
    }

    public static Flowable<PlayerState> providePlayerStateFlowable(RxPlayerState rxPlayerState) {
        String str = "ltsn-or hCetvu@oanan r lb@ee onmPN fuoarrndtolmenlsld  i";
        return (Flowable) wil.a(CC.providePlayerStateFlowable(rxPlayerState), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final Flowable<PlayerState> get() {
        return providePlayerStateFlowable((RxPlayerState) this.rxPlayerStateProvider.get());
    }
}
