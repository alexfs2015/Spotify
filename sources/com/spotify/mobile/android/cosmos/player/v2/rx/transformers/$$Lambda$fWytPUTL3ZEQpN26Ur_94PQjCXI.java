package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.transformers.-$$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI reason: invalid class name */
public final /* synthetic */ class $$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI implements Function {
    public static final /* synthetic */ $$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI INSTANCE = new $$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI();

    private /* synthetic */ $$Lambda$fWytPUTL3ZEQpN26Ur_94PQjCXI() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((PlayerState) obj).currentPlaybackPosition());
    }
}
