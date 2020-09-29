package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: kym reason: default package */
public final class kym {
    private final kyo a;

    kym(kyo kyo) {
        this.a = kyo;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CappedOndemandStatus a(CappedOndemandStatus cappedOndemandStatus, CappedOndemandStatus cappedOndemandStatus2) {
        return cappedOndemandStatus.timestamp() > cappedOndemandStatus2.timestamp() ? cappedOndemandStatus : cappedOndemandStatus2;
    }

    public final Observable<Boolean> a(Boolean bool) {
        return (bool.booleanValue() ? this.a.c() : this.a.d()).a((ObservableSource<T>) Observable.b(bool));
    }

    public final Single<Boolean> a() {
        return this.a.a().c((Consumer<? super Throwable>) $$Lambda$kym$gpiUewvuBJseT2QprGKsglclP4.INSTANCE).f($$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE.INSTANCE);
    }

    public final Observable<Boolean> b() {
        return this.a.b().a((BiFunction<T, T, T>) $$Lambda$kym$yRJHIYRR3iIreelp0t3sZKsDOL4.INSTANCE).a((Consumer<? super Throwable>) $$Lambda$kym$It7PN510yMimYCnhF3sRLuFSrrc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo.INSTANCE).a(Functions.a());
    }
}
