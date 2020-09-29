package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg implements Function {
    public static final /* synthetic */ $$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg INSTANCE = new $$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg();

    private /* synthetic */ $$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg() {
    }

    public final Object apply(Object obj) {
        return Completable.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_UPDATE_ERROR));
    }
}
