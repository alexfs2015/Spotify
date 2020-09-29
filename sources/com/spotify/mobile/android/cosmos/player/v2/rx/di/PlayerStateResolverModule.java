package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.rx.LoggedInPlayerStateResolver;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateResolver;

public interface PlayerStateResolverModule {
    PlayerStateResolver bindPlayerStateResolver(LoggedInPlayerStateResolver loggedInPlayerStateResolver);
}
