package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hto reason: default package */
public final class hto implements hth {
    private final htb b;
    private final htu c;
    private final hre d;
    private final hts e;
    private final hgz f;
    private final jty g;
    private Optional<hvd<huw>> h = Optional.e();

    public hto(htb htb, htu htu, hre hre, hts hts, hgz hgz, jty jty) {
        this.b = htb;
        this.c = htu;
        this.d = hre;
        this.e = hts;
        this.f = hgz;
        this.g = jty;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(huo huo, String str) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$hto$2IrD8UiO1AdwWf4rvoxPfFlpr0<T>(this, huo, str));
    }

    private List<MediaBrowserItem> a(hux hux) {
        ArrayList arrayList = new ArrayList();
        if (hux.b != null) {
            for (huv a : hux.b) {
                arrayList.add(hur.a(a, "", this.d, this.g));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(List<huw> list) {
        MediaBrowserItem mediaBrowserItem;
        ArrayList arrayList = new ArrayList(list.size());
        for (huw huw : list) {
            if (huw instanceof hux) {
                arrayList.addAll(a((hux) huw));
            }
            if (huw instanceof hus) {
                hus hus = (hus) huw;
                if (hus.a != null) {
                    mediaBrowserItem = hur.a(hus.a, "", this.d, this.g);
                } else {
                    mediaBrowserItem = null;
                }
                if (mediaBrowserItem != null) {
                    arrayList.add(mediaBrowserItem);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.h.b()) {
            ((hvd) this.h.c()).a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(huo huo, String str, SingleEmitter singleEmitter) {
        singleEmitter.a((Cancellable) new $$Lambda$hto$pHXB1fVuzNjv2xnsKvenopdKqc(this));
        hvd a = this.c.a(htb.a(singleEmitter, new $$Lambda$hto$67drdpxaBEPNuWzEJRk3DfDyVVo(this), new $$Lambda$hto$q14eHED2R6Ho2mcZAOrbdqYyXqM(this)), "/vanilla/v1/views/hub2/partner-recommendations", str, hts.a(huo));
        a.a(0, 50);
        this.h = Optional.b(a);
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.f.b("country_code").c(1).h().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hto$58ijBeNFLn3ByFbS7c599tYtwUI<Object,Object>(this, huo));
    }
}
