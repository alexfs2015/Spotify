package defpackage;

import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.BiFunction;

/* renamed from: -$$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc implements BiFunction {
    public static final /* synthetic */ $$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc INSTANCE = new $$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc();

    private /* synthetic */ $$Lambda$kqz$fsv8Nmc5OGgD1iV8hUhfBJAMRIc() {
    }

    public final Object apply(Object obj, Object obj2) {
        return RadioSeedBundle.create((String) obj, ((RadioSeedBundle) obj2).getPlaybackId(), ((RadioSeedBundle) obj2).getPlayOrigin());
    }
}
