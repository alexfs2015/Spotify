package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import java.util.Map;

/* renamed from: ozr reason: default package */
public class ozr {
    public static final String a = ozr.class.getName();
    public final SerialDisposable b = new SerialDisposable();
    public Optional<LicenseLayout> c = Optional.e();
    private final hgy d;
    private final hgz e;
    private final gkm f;
    private final hec g;
    private final ozp h;
    private final omh i;

    public ozr(hgy hgy, hgz hgz, gkm gkm, hec hec, ozp ozp, omh omh) {
        this.d = hgy;
        this.e = hgz;
        this.f = gkm;
        this.g = hec;
        this.h = ozp;
        this.i = omh;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vld a(fqn fqn, Map map, vld vld) {
        return vld;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vld vld) {
        this.i.a = vld;
        if (!this.c.b()) {
            this.c = Optional.b(this.i.a());
        } else if (this.i.a() != this.c.c()) {
            this.g.a(vld.a().getUri(), this.f);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(vld vld) {
        return (vld == null || vld.a() == null) ? false : true;
    }

    public final void a() {
        SerialDisposable serialDisposable = this.b;
        Observable j = this.d.a().j();
        Observable<Map<String, String>> observable = this.e.a;
        ozp ozp = this.h;
        serialDisposable.a(Observable.a((ObservableSource<? extends T1>) j, (ObservableSource<? extends T2>) observable, (ObservableSource<? extends T3>) ozp.b.b(ozp.a, ozp.c).a((Predicate<? super T>) $$Lambda$ozr$y4vdSZ0PJWKGlz1nHD60PiArmcY.INSTANCE), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$ozr$KAnSeyc9DrHb1WEgbl2ybZvmA0c.INSTANCE).a((Consumer<? super T>) new $$Lambda$ozr$2QbUpw1F2dxKe1xLGe78dKWgc<Object>(this), (Consumer<? super Throwable>) $$Lambda$ozr$e_zlZtUedP6aXCagVFxIMYqx9e8.INSTANCE));
    }
}
