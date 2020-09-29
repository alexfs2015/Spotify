package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateCompatModule.CC;

public final class PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory implements vua<PlayerState> {
    private final wlc<PlayerStateCompat> playerStateCompatProvider;

    public PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wlc<PlayerStateCompat> wlc) {
        this.playerStateCompatProvider = wlc;
    }

    public final PlayerState get() {
        return provideMostRecentPlayerState((PlayerStateCompat) this.playerStateCompatProvider.get());
    }

    public static PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory create(wlc<PlayerStateCompat> wlc) {
        return new PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wlc);
    }

    public static PlayerState provideMostRecentPlayerState(PlayerStateCompat playerStateCompat) {
        return CC.provideMostRecentPlayerState(playerStateCompat);
    }
}
