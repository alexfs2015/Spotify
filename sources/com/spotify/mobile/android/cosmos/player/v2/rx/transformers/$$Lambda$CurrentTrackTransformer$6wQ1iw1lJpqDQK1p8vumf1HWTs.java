package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.rx.transformers.-$$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8v-umf1HWTs reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8vumf1HWTs implements Predicate {
    public static final /* synthetic */ $$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8vumf1HWTs INSTANCE = new $$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8vumf1HWTs();

    private /* synthetic */ $$Lambda$CurrentTrackTransformer$6wQ1iw1lJpqDQK1p8vumf1HWTs() {
    }

    public final boolean test(Object obj) {
        return CurrentTrackTransformer.lambda$apply$0((PlayerState) obj);
    }
}
