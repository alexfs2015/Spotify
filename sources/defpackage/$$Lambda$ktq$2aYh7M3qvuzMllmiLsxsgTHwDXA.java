package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA implements Function {
    public static final /* synthetic */ $$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA INSTANCE = new $$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA();

    private /* synthetic */ $$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA() {
    }

    public final Object apply(Object obj) {
        return Single.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_GET_ENTRY_ERROR));
    }
}
