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

/* renamed from: ktq reason: default package */
public final class ktq implements ktp {
    private final AuthCacheRoomDatabase a;
    private final ktn b;
    private final Scheduler c;

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list) {
        return list;
    }

    public ktq(AuthCacheRoomDatabase authCacheRoomDatabase, ktn ktn, Scheduler scheduler) {
        this.b = ktn;
        this.a = authCacheRoomDatabase;
        this.c = scheduler;
    }

    public final Single<ktj> a(ktj ktj) {
        Single a2 = this.a.i().a(ktj.a(), ktj.b(), ktj.e(), ktj.f());
        ktn ktn = this.b;
        ktn.getClass();
        return a2.f(new $$Lambda$RCDtPfAMAm3T5VZruR8jezIS3Dw(ktn)).h($$Lambda$ktq$2aYh7M3qvuzMllmiLsxsgTHwDXA.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$ktq$9Jh2psF_H43N_yqO2lC28FHWSU.INSTANCE).b(this.c);
    }

    public final Completable b(ktj ktj) {
        return this.a.i().a(ktk.a(ktj)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$ktq$pgjNHfxizI4nIzzIA1SGvS4Qycg.INSTANCE).a((Consumer<? super Throwable>) $$Lambda$ktq$5AtgUIgT7bk8zVs2FOixDT5mRTY.INSTANCE).b(this.c);
    }

    public final Completable c(ktj ktj) {
        return this.a.i().b(ktk.a(ktj)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$ktq$ihjR8m4irB9WbCZIFymrKwWiSc.INSTANCE).b(this.c);
    }

    public final Single<List<ktj>> a() {
        Observable c2 = this.a.i().a().c((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$ktq$5TWdzITs9GgXyQvwBNtqrsaOTIY.INSTANCE);
        ktn ktn = this.b;
        ktn.getClass();
        return c2.c((Function<? super T, ? extends R>) new $$Lambda$RCDtPfAMAm3T5VZruR8jezIS3Dw<Object,Object>(ktn)).b(16).h($$Lambda$ktq$_iXVKS_ydcbSyOTaVG34rea5Tg4.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$ktq$iQVObviQoRUlAcBEwfs3GQZidT4.INSTANCE).b(this.c);
    }

    public final Single<Integer> b() {
        return this.a.i().b().a(Single.b(Integer.valueOf(-1))).c((Consumer<? super Throwable>) $$Lambda$ktq$oc6N1jGWu1KMww46bCanN2YXr8.INSTANCE).b(this.c);
    }
}
