package defpackage;

import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: kwz reason: default package */
public final class kwz implements kwy {
    private final AuthCacheRoomDatabase a;
    private final kww b;
    private final Scheduler c;

    public kwz(AuthCacheRoomDatabase authCacheRoomDatabase, kww kww, Scheduler scheduler) {
        this.b = kww;
        this.a = authCacheRoomDatabase;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list) {
        return list;
    }

    public final Single<List<kws>> a() {
        Observable c2 = this.a.i().a().c((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$kwz$YQwDgr7spuKAEm_AUTeAVBXxEP8.INSTANCE);
        kww kww = this.b;
        kww.getClass();
        return c2.c((Function<? super T, ? extends R>) new $$Lambda$vv5L9xQXrCOzqfD2wXQtewOz4FI<Object,Object>(kww)).b(16).h($$Lambda$kwz$Ie4GJfVWAT2HpIoFavui3_Lc9Zo.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$kwz$Sy6erja9EwC62EqomkFevPUVoDU.INSTANCE).b(this.c);
    }

    public final Single<kws> a(kws kws) {
        Single a2 = this.a.i().a(kws.a(), kws.b(), kws.e(), kws.f());
        kww kww = this.b;
        kww.getClass();
        return a2.f(new $$Lambda$vv5L9xQXrCOzqfD2wXQtewOz4FI(kww)).h($$Lambda$kwz$nYlplOSLEZUg0gXcEp4b9vvwzQ.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$kwz$0Wd3dfQKx3OgVBp5cN4qu6BVoio.INSTANCE).b(this.c);
    }

    public final Completable b(kws kws) {
        return this.a.i().a(kwt.a(kws)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$kwz$g0Q7xEBQGZp2I5uX4nlNZUKzNr0.INSTANCE).a((Consumer<? super Throwable>) $$Lambda$kwz$Luyo9qFp0TiNGTkx_73hewvBHs.INSTANCE).b(this.c);
    }

    public final Single<Integer> b() {
        return this.a.i().b().a(Single.b(Integer.valueOf(-1))).c((Consumer<? super Throwable>) $$Lambda$kwz$_mNFzbLkYFJ4IJmTWxE9V8StY7k.INSTANCE).b(this.c);
    }

    public final Completable c(kws kws) {
        return this.a.i().b(kwt.a(kws)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$kwz$ObNvzlsT4BLSoI851gGwIIZNaI.INSTANCE).b(this.c);
    }
}
