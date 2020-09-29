package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: htq reason: default package */
public final class htq implements hth {
    private final hre b;
    private final htu c;
    private final htb d;
    private final hts e;
    private final hgz f;
    private hvd<huw> g;
    private final jty h;

    htq(hre hre, htu htu, htb htb, hts hts, hgz hgz, jty jty) {
        this.b = hre;
        this.c = htu;
        this.d = htb;
        this.e = hts;
        this.f = hgz;
        this.h = jty;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, htw htw, String str2) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$htq$2nJSg18X8LDHBC0UcZ8ytj8RU3E<T>(this, str, str2, htw));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(List<huw> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (huw huw : list) {
            hus hus = (hus) huw;
            if (hus.a != null) {
                arrayList.add(hur.a(hus.a, "", this.b, this.h));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void a() {
        hvd<huw> hvd = this.g;
        if (hvd != null) {
            hvd.a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, htw htw, SingleEmitter singleEmitter) {
        SingleEmitter singleEmitter2 = singleEmitter;
        singleEmitter2.a((Cancellable) new $$Lambda$htq$IG6fbYhtE506QXs1Vyk83Y85QnQ(this));
        hta a = htb.a(singleEmitter2, new $$Lambda$htq$h4UEQFfJ8dzmnZl1AP2t2MK190M(this), new $$Lambda$htq$TSPKR7ugNH4kykJn5hVBY6oegfI(this));
        htu htu = this.c;
        hvb hvb = new hvb(htu.b, a, str, str2, htu.d, htu.c, htu.a, wit.a(htu.e), htw, htu.f);
        hvb.a(0, 50);
        this.g = hvb;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.f.b("country_code").c(1).h().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$htq$Y6x2X6kmOYA8Ve5Bws3VDLVmbsw<Object,Object>(this, hts.b(huo), hts.a(huo)));
    }
}
