package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vno reason: default package */
public final class vno {
    Observable<Boolean> a;
    private final voi b;
    private final vnj c;

    public vno(voi voi, vnj vnj) {
        this.b = voi;
        this.c = vnj;
    }

    private kmv<vns> a() {
        return koj.a(this.a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vno$b6Yrg6RI4Cotixm8p3DndmduoU.INSTANCE, false));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe b() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe c() {
        return new kom(Schedulers.b());
    }

    /* access modifiers changed from: 0000 */
    public c<vnu, vns, vnr> a(vok vok) {
        return kok.a((kni<M, E, F>) $$Lambda$ojkOmKn8rJ7NjeLjRA0RgCTRx2c.INSTANCE, vnw.a(vok, this.b, this.c, AndroidSchedulers.a())).a((kmx<M, F>) $$Lambda$5xRrKKrBYh4KZ3lCaAR0t8u8sq0.INSTANCE).b($$Lambda$vno$bUZBA31Za7YkO_8uyfGAZ7aueU4.INSTANCE).a((kny<koe>) $$Lambda$vno$yonqzMpwPcYePU7kjQwGzrAtL0.INSTANCE).a(vnx.a(), a()).a(knq.a("Podcastonboarding Feature"));
    }
}
