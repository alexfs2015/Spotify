package defpackage;

import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import io.reactivex.Flowable;

/* renamed from: -$$Lambda$wcc$IzcURpB1GrdF-oBbXN0Te1jBcbQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ implements gee {
    public static final /* synthetic */ $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ INSTANCE = new $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ();

    private /* synthetic */ $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ() {
    }

    public final Object apply(Object obj) {
        return Flowable.a((Throwable) new VoiceSessionException(ErrorDomain.e, wel.m, new IllegalStateException("Cannot start voice session if app is offline")));
    }
}
