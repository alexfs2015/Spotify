package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.transformers.-$$Lambda$JX4_4YhI7dtnD0j0_yOammE-AV4 reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4 implements Function {
    public static final /* synthetic */ $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4 INSTANCE = new $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4();

    private /* synthetic */ $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4() {
    }

    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
