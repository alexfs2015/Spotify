package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hre reason: default package */
public final class hre implements hqx {
    private final hpg b;
    private final hri c;
    private final hqt d;
    private final hrg e;
    private hsl<hse> f;

    hre(hpg hpg, hri hri, hqt hqt, hrg hrg) {
        this.b = hpg;
        this.c = hri;
        this.d = hqt;
        this.e = hrg;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$hre$UW93MhAA8df8JMSCzjHZ0Teao<T>(this, hrg.b(hnd), str, hrg.a(hnd)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, hrk hrk, SingleEmitter singleEmitter) {
        singleEmitter.a((Cancellable) new $$Lambda$hre$XVPmoQJdR9y2D_N8szV9oxAUD4(this));
        hqs a = hqt.a(singleEmitter, new $$Lambda$hre$ZdIgKphmnLeS83IArtg08tlWFLU(this), new $$Lambda$hre$6dP03IPFDIAobnUqGXLGAVRWuE(this));
        hri hri = this.c;
        hsl<hse> b2 = hsl.b(hri.b, a, str, str2, hri.d, hri.c, hri.a, vun.a(hri.e), hrk);
        b2.a(0, 50);
        this.f = b2;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(List<hse> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (hse hse : list) {
            hsa hsa = (hsa) hse;
            if (hsa.b != null) {
                arrayList.add(hrx.a(hsa.b, "", this.b));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void a() {
        hsl<hse> hsl = this.f;
        if (hsl != null) {
            hsl.a.a();
        }
    }
}
