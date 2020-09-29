package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwW-iSc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwWiSc implements Function {
    public static final /* synthetic */ $$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwWiSc INSTANCE = new $$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwWiSc();

    private /* synthetic */ $$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwWiSc() {
    }

    public final Object apply(Object obj) {
        return Completable.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_REMOVE_ENTRY_ERROR));
    }
}
