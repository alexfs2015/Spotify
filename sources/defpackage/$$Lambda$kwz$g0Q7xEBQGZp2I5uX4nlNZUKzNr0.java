package defpackage;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0 implements Function {
    public static final /* synthetic */ $$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0 INSTANCE = new $$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0();

    private /* synthetic */ $$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0() {
    }

    public final Object apply(Object obj) {
        return Completable.a((Throwable) new OfflineAuthCacheException(ErrorMessage.CACHE_UPDATE_ERROR));
    }
}
