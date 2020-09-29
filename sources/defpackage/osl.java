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

/* renamed from: osl reason: default package */
public class osl {
    public static final String a = osl.class.getName();
    public final SerialDisposable b = new SerialDisposable();
    public Optional<LicenseLayout> c = Optional.e();
    private final hec d;
    private final hed e;
    private final gjb f;
    private final hbj g;
    private final osj h;
    private final ofd i;

    /* access modifiers changed from: private */
    public static /* synthetic */ uza a(fpt fpt, Map map, uza uza) {
        return uza;
    }

    public osl(hec hec, hed hed, gjb gjb, hbj hbj, osj osj, ofd ofd) {
        this.d = hec;
        this.e = hed;
        this.f = gjb;
        this.g = hbj;
        this.h = osj;
        this.i = ofd;
    }

    public final void a() {
        SerialDisposable serialDisposable = this.b;
        Observable j = this.d.a().j();
        Observable<Map<String, String>> observable = this.e.a;
        osj osj = this.h;
        serialDisposable.a(Observable.a((ObservableSource<? extends T1>) j, (ObservableSource<? extends T2>) observable, (ObservableSource<? extends T3>) osj.b.b(osj.a, osj.c).a((Predicate<? super T>) $$Lambda$osl$ZoxCl1a8gq3rjHFfwvGYqYqwbI.INSTANCE), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$osl$AxPDw91AI680D_l4bRkJ6rtBRUA.INSTANCE).a((Consumer<? super T>) new $$Lambda$osl$U6C9ClAEqLYuq9ClfCpnojjxI_o<Object>(this), (Consumer<? super Throwable>) $$Lambda$osl$40Tv8Wxucbuw6_LbGupzMwL1lxY.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(uza uza) {
        return (uza == null || uza.a() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uza uza) {
        this.i.a = uza;
        if (!this.c.b()) {
            this.c = Optional.b(this.i.a());
        } else if (this.i.a() != this.c.c()) {
            this.g.a(uza.a().getUri(), this.f);
        }
    }
}
