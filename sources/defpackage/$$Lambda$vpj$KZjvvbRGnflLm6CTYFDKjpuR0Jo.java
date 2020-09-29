package defpackage;

import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vpj$KZjvvbRGnflLm6CTYFDKjpuR0Jo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vpj$KZjvvbRGnflLm6CTYFDKjpuR0Jo implements Function {
    public static final /* synthetic */ $$Lambda$vpj$KZjvvbRGnflLm6CTYFDKjpuR0Jo INSTANCE = new $$Lambda$vpj$KZjvvbRGnflLm6CTYFDKjpuR0Jo();

    private /* synthetic */ $$Lambda$vpj$KZjvvbRGnflLm6CTYFDKjpuR0Jo() {
    }

    public final Object apply(Object obj) {
        return Single.a((Throwable) new VoiceSessionException(ErrorDomain.a, vrd.b, (Throwable) obj));
    }
}
