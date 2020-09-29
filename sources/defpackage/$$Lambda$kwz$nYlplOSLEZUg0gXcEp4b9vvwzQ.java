package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9v-vwzQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9vvwzQ implements Function {
    public static final /* synthetic */ $$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9vvwzQ INSTANCE = new $$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9vvwzQ();

    private /* synthetic */ $$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9vvwzQ() {
    }

    public final Object apply(Object obj) {
        return Single.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_GET_ENTRY_ERROR));
    }
}
