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

/* renamed from: kwm reason: default package */
public final class kwm {
    final kwy a;
    final kww b;
    private final jtz c;

    kwm(kwy kwy, kww kww, jtz jtz) {
        this.a = kwy;
        this.b = kww;
        this.c = jtz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Exception exc, Boolean bool) {
        return bool.booleanValue() ? Completable.a((Throwable) exc) : Completable.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Exception exc, Integer num) {
        return num.intValue() == -1 ? Completable.a((Throwable) exc) : Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(kws kws, Boolean bool) {
        return RxJavaPlugins.a((Single<T>) new MaybeIsEmptySingle<T>(this.a.a(kws).a((Predicate<? super T>) new $$Lambda$kwm$kq3Hs6sQ69E49JToUlx8ZjDU2Lk<Object>(this)).a((Predicate<? super T>) new $$Lambda$kwm$mvpnCUTF6vG57W4VkmScR1T4G_E<Object>(kws))));
    }

    /* access modifiers changed from: private */
    public boolean a(kws kws) {
        return kws.d() >= this.c.a() - 86400000;
    }

    /* access modifiers changed from: 0000 */
    public final Completable a() {
        return this.a.b().e(new $$Lambda$kwm$LraaQUqAJCoZIV5FuFZMeQOj5zE(new OfflineAuthCacheException(ErrorMessage.CACHE_CLEAR_ERROR)));
    }

    /* access modifiers changed from: 0000 */
    public final Completable a(AuthorizationRequest authorizationRequest) {
        BuiltInAuthException builtInAuthException = new BuiltInAuthException(AuthError.ERROR_OFFLINE_MODE_ACTIVE);
        return Single.b(Boolean.FALSE).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$kwm$tlAsRwZB_NbtKlo1vlqEyDsvpIQ<Object,Object>(this, this.b.a(authorizationRequest))).g($$Lambda$kwm$sJQDdQQfjw8515bD3BhQRDFCwZ4.INSTANCE).e(new $$Lambda$kwm$Om9v6X269PnnCnp7AvlfnH0gle0(builtInAuthException));
    }
}
