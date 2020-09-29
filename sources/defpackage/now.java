package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;

/* renamed from: now reason: default package */
public final class now {
    private final vvy<hcs> a;
    private final vvy<hcs> b;
    private final nou c;
    private final nis d;
    private final nph e;
    private final xii<RecentlyPlayedItems> f;
    private final xii<String> g;
    private final boolean h;

    now(nis nis, nph nph, xii<RecentlyPlayedItems> xii, vvy<hcs> vvy, vvy<hcs> vvy2, xii<String> xii2, nou nou, boolean z) {
        this.d = nis;
        this.e = nph;
        this.f = xii;
        this.a = vvy;
        this.b = vvy2;
        this.g = xii2;
        this.h = z;
        this.c = nou;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str) {
        return xii.a(this.d.a().e((xiy<? super T, ? extends R>) $$Lambda$vp6pQk2Hb4KLKNSbSFyD8sbnG0.INSTANCE).g($$Lambda$2dALB1GGtYiFdzqzsURmkT1t7ok.INSTANCE).e((xiy<? super T, ? extends R>) this.e), this.f, (xiz<? super T1, ? super T2, ? extends R>) this.c).b((xis<? super T>) $$Lambda$now$mHB8XlR6ntJUL0hZ6GZHT4l5Zww.INSTANCE).a(wit.a((ObservableTransformer<T, R>) (!"1".equals(str) || !this.h) ? this.a : this.b, BackpressureStrategy.LATEST));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hcs hcs) {
        Object[] objArr = new Object[2];
        Object obj = "NULL";
        objArr[0] = hcs != null ? hcs.id() : obj;
        if (hcs != null) {
            obj = Integer.valueOf(hcs.body().size());
        }
        objArr[1] = obj;
        Logger.b("HomeLoad: fetch(). Got after combineLatest HubsVM: id %s body.size %s", objArr);
    }

    public final xii<hcs> a() {
        return this.g.h(new $$Lambda$now$TOzDBazvHtUm3htUN1VK7PXTHgU(this));
    }
}
