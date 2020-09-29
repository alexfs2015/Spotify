package defpackage;

import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioStateObserver.FailureState;

/* renamed from: uso reason: default package */
public final class uso implements xis<Throwable> {
    private final usj a;

    public uso(usj usj) {
        this.a = usj;
    }

    public final /* synthetic */ void call(Object obj) {
        this.a.b(ThumbState.NONE);
        this.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
    }
}
