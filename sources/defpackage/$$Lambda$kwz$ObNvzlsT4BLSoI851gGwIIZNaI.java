package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kwz$ObNvzlsT4BLSo-I851gGwIIZNaI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwz$ObNvzlsT4BLSoI851gGwIIZNaI implements Function {
    public static final /* synthetic */ $$Lambda$kwz$ObNvzlsT4BLSoI851gGwIIZNaI INSTANCE = new $$Lambda$kwz$ObNvzlsT4BLSoI851gGwIIZNaI();

    private /* synthetic */ $$Lambda$kwz$ObNvzlsT4BLSoI851gGwIIZNaI() {
    }

    public final Object apply(Object obj) {
        return Completable.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_REMOVE_ENTRY_ERROR));
    }
}
