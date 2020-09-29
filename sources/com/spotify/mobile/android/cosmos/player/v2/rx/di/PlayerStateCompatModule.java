package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import io.reactivex.Scheduler;

public interface PlayerStateCompatModule {

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateCompatModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static PlayerStateCompat providePlayerStateCompat(RxPlayerState rxPlayerState, Scheduler scheduler) {
            return new PlayerStateCompat(rxPlayerState, scheduler);
        }

        public static PlayerState provideMostRecentPlayerState(PlayerStateCompat playerStateCompat) {
            return playerStateCompat.getMostRecentPlayerState();
        }
    }
}
