package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateCompatModule.CC;

public final class PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory implements wig<PlayerState> {
    private final wzi<PlayerStateCompat> playerStateCompatProvider;

    public PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wzi<PlayerStateCompat> wzi) {
        this.playerStateCompatProvider = wzi;
    }

    public static PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory create(wzi<PlayerStateCompat> wzi) {
        return new PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wzi);
    }

    public static PlayerState provideMostRecentPlayerState(PlayerStateCompat playerStateCompat) {
        return CC.provideMostRecentPlayerState(playerStateCompat);
    }

    public final PlayerState get() {
        return provideMostRecentPlayerState((PlayerStateCompat) this.playerStateCompatProvider.get());
    }
}
