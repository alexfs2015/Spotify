package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException.ErrorMessage;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.maybe.MaybeIsEmptySingle;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: ktd reason: default package */
public final class ktd {
    final ktp a;
    final ktn b;
    private final jrp c;

    ktd(ktp ktp, ktn ktn, jrp jrp) {
        this.a = ktp;
        this.b = ktn;
        this.c = jrp;
    }

    /* access modifiers changed from: 0000 */
    public final Completable a(AuthorizationRequest authorizationRequest) {
        BuiltInAuthException builtInAuthException = new BuiltInAuthException(AuthError.ERROR_OFFLINE_MODE_ACTIVE);
        return Single.b(Boolean.FALSE).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ktd$uj_DXqzobPWo8usRTSgDo2a9AuM<Object,Object>(this, this.b.a(authorizationRequest))).g($$Lambda$ktd$wP2EgK3sgeQA77GTCGlTLw41eHA.INSTANCE).e(new $$Lambda$ktd$YPXddWxgsEHMo78XScSzCMKiMxw(builtInAuthException));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Exception exc, Boolean bool) {
        if (bool.booleanValue()) {
            return Completable.a((Throwable) exc);
        }
        return Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(ktj ktj, Boolean bool) {
        return RxJavaPlugins.a((Single<T>) new MaybeIsEmptySingle<T>(this.a.a(ktj).a((Predicate<? super T>) new $$Lambda$ktd$p7jCZB4YmTOk0b3OnWStGjrxS4k<Object>(this)).a((Predicate<? super T>) new $$Lambda$ktd$Gyufw5YOVYNSryiEYvHI5WKtWg<Object>(ktj))));
    }

    /* access modifiers changed from: private */
    public boolean a(ktj ktj) {
        return ktj.d() >= this.c.a() - 86400000;
    }

    /* access modifiers changed from: 0000 */
    public final Completable a() {
        return this.a.b().e(new $$Lambda$ktd$91P_AEGFaOdDcbmJHWpSEV9GSWQ(new OfflineAuthCacheException(ErrorMessage.CACHE_CLEAR_ERROR)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Exception exc, Integer num) {
        if (num.intValue() == -1) {
            return Completable.a((Throwable) exc);
        }
        return Completable.a();
    }
}
