package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hrn reason: default package */
public final class hrn implements hqx {
    private final Context b;
    private final hri c;
    private final hqt d;
    private final hrg e;
    private final hpg f;
    private hsl<hse> g;

    hrn(Context context, hri hri, hqt hqt, hrg hrg, hpg hpg) {
        this.b = context;
        this.c = hri;
        this.d = hqt;
        this.e = hrg;
        this.f = hpg;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$hrn$ONYtKaQn18ckQPCMRiCeStux1xs<T>(this, hrg.b(hnd), str, hrg.a(hnd)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, hrk hrk, SingleEmitter singleEmitter) {
        singleEmitter.a((Cancellable) new $$Lambda$hrn$xYw0RHYXlIKsXPVm3H2C_oGEPGQ(this));
        hqs a = hqt.a(singleEmitter, new $$Lambda$hrn$rNT2DOLBvYNHJ4s6bsrnubPIowg(this), new $$Lambda$hrn$K4l37URnQ3huUfdm54dOvxdF5k(this));
        hri hri = this.c;
        hsl<hse> a2 = hsl.a(hri.b, a, str, str2, hri.d, hri.c, hri.a, vun.a(hri.e), hrk);
        a2.a(0, 50);
        this.g = a2;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(List<hse> list) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (hse hse : list) {
            MediaBrowserItem mediaBrowserItem = null;
            if (hse instanceof hsf) {
                hsf hsf = (hsf) hse;
                if (hsf.a != null) {
                    String str = hsf.a;
                    StringBuilder sb = new StringBuilder("spotify:space_item:");
                    sb.append(str);
                    obj = hrx.a(hsf, Uri.parse(sb.toString()), this.b);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            if (hse instanceof hsa) {
                hsa hsa = (hsa) hse;
                if (hsa.b != null) {
                    mediaBrowserItem = hrx.a(hsa.b, "", this.f);
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
        hsl<hse> hsl = this.g;
        if (hsl != null) {
            hsl.a.a();
        }
    }
}
