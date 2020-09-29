package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public interface PlayerStateFlowableModule {

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.di.PlayerStateFlowableModule$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<PlayerState> providePlayerStateFlowable(RxPlayerState rxPlayerState) {
            return rxPlayerState.getPlayerState().a(AndroidSchedulers.a()).a(BackpressureStrategy.LATEST);
        }
    }
}
