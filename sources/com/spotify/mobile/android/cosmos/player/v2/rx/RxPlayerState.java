package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import java.util.List;

@Deprecated
public interface RxPlayerState {
    PlayerState getMostRecentPlayerState();

    Observable<PlayerState> getPlayerState();

    Observable<PlayerState> getPlayerState(int i, int i2);

    List<vvj> unsubscribeAndReturnLeaks();
}
