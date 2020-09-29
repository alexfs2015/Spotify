package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vba reason: default package */
public final class vba {
    Observable<Boolean> a;
    private final vbu b;
    private final vav c;

    public vba(vbu vbu, vav vav) {
        this.b = vbu;
        this.c = vav;
    }

    /* access modifiers changed from: 0000 */
    public c<vbg, vbe, vbd> a(vbw vbw) {
        return klb.a((kjz<M, E, F>) $$Lambda$X22xKt7Pg7DZRsk0cuqh1LY8jSY.INSTANCE, vbi.a(vbw, this.b, this.c, AndroidSchedulers.a())).a((kjo<M, F>) $$Lambda$fLp2QZWwtxyguUS0dRZhltZQuU.INSTANCE).b($$Lambda$vba$3HOfthlAgLcIIcsOqGJHJwqdhXo.INSTANCE).a((kkp<kkv>) $$Lambda$vba$wWMZlXBRsSnK_14MD0c1oIl9Is.INSTANCE).a(vbj.a(), a()).a(kkh.a("Podcastonboarding Feature"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv c() {
        return new kld(Schedulers.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv b() {
        return new kld(Schedulers.a());
    }

    private kjm<vbe> a() {
        return kla.a(this.a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vba$4JMUrzL9gLfGPPMXyTjDuCjpV28.INSTANCE, false));
    }
}
