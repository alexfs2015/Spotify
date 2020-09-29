package defpackage;

import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$wck$5a7NVfTEll619CH_Wb8Diwptmoc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$wck$5a7NVfTEll619CH_Wb8Diwptmoc implements Function {
    public static final /* synthetic */ $$Lambda$wck$5a7NVfTEll619CH_Wb8Diwptmoc INSTANCE = new $$Lambda$wck$5a7NVfTEll619CH_Wb8Diwptmoc();

    private /* synthetic */ $$Lambda$wck$5a7NVfTEll619CH_Wb8Diwptmoc() {
    }

    public final Object apply(Object obj) {
        return Single.a((Throwable) new VoiceSessionException(ErrorDomain.a, wel.b, (Throwable) obj));
    }
}
