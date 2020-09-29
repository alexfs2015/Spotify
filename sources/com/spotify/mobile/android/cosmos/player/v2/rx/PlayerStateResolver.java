package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;

public interface PlayerStateResolver {
    Observable<PlayerState> createPlayerStateObservable(String str, int i, int i2);
}
