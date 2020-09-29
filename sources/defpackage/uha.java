package defpackage;

import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioStateObserver.FailureState;

/* renamed from: uha reason: default package */
public final class uha implements wun<Throwable> {
    private final ugv a;

    public uha(ugv ugv) {
        this.a = ugv;
    }

    public final /* synthetic */ void call(Object obj) {
        this.a.b(ThumbState.NONE);
        this.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
    }
}
