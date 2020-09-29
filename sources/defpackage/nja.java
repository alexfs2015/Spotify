package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;

/* renamed from: nja reason: default package */
public final class nja {
    private final vit<gzz> a;
    private final vit<gzz> b;
    private final niy c;
    private final ndd d;
    private final njl e;
    private final wud<RecentlyPlayedItems> f;
    private final wud<String> g;
    private final boolean h;

    nja(ndd ndd, njl njl, wud<RecentlyPlayedItems> wud, vit<gzz> vit, vit<gzz> vit2, wud<String> wud2, niy niy, boolean z) {
        this.d = ndd;
        this.e = njl;
        this.f = wud;
        this.a = vit;
        this.b = vit2;
        this.g = wud2;
        this.h = z;
        this.c = niy;
    }

    public final wud<gzz> a() {
        return this.g.i(new $$Lambda$nja$SubahPSP7YLTeaPe4dfM6WcBUk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str) {
        return wud.a(this.d.a().f($$Lambda$91iFJHMNfTL0YnqvWEV8irWRJ38.INSTANCE).h($$Lambda$owbpxmGK0VqpX2OShOyfDxAeLHg.INSTANCE).f(this.e), this.f, (wuu<? super T1, ? super T2, ? extends R>) this.c).b((wun<? super T>) $$Lambda$nja$oJsJROP7TcfNzJgu786UnaJcUw.INSTANCE).a(vun.a((ObservableTransformer<T, R>) (!"1".equals(str) || !this.h) ? this.a : this.b, BackpressureStrategy.LATEST));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gzz gzz) {
        Object[] objArr = new Object[2];
        Object obj = "NULL";
        objArr[0] = gzz != null ? gzz.id() : obj;
        if (gzz != null) {
            obj = Integer.valueOf(gzz.body().size());
        }
        objArr[1] = obj;
        Logger.b("HomeLoad: fetch(). Got after combineLatest HubsVM: id %s body.size %s", objArr);
    }
}
