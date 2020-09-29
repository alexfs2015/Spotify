package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.transformers.-$$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8 reason: invalid class name */
public final /* synthetic */ class $$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8 implements Function {
    public static final /* synthetic */ $$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8 INSTANCE = new $$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8();

    private /* synthetic */ $$Lambda$06CtyGbt81wsuPMxY118P0IZ4k8() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((PlayerState) obj).duration());
    }
}
