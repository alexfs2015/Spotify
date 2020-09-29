package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: htz reason: default package */
public final class htz implements hth {
    private final Context b;
    private final htu c;
    private final htb d;
    private final hts e;
    private final hre f;
    private final hgz g;
    private hvd<huw> h;
    private final jty i;

    htz(Context context, htu htu, htb htb, hts hts, hre hre, hgz hgz, jty jty) {
        this.b = context;
        this.c = htu;
        this.d = htb;
        this.e = hts;
        this.f = hre;
        this.g = hgz;
        this.i = jty;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, htw htw, String str2) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$htz$KyHkcWjYGVeaPGTe9UV_GfTJaAM<T>(this, str, str2, htw));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(List<huw> list) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (huw huw : list) {
            MediaBrowserItem mediaBrowserItem = null;
            if (huw instanceof hux) {
                hux hux = (hux) huw;
                if (hux.a != null) {
                    String str = hux.a;
                    StringBuilder sb = new StringBuilder("spotify:space_item:");
                    sb.append(str);
                    obj = hur.a(hux, Uri.parse(sb.toString()), this.b);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            if (huw instanceof hus) {
                hus hus = (hus) huw;
                if (hus.a != null) {
                    mediaBrowserItem = hur.a(hus.a, "", this.f, this.i);
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
        hvd<huw> hvd = this.h;
        if (hvd != null) {
            hvd.a.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, htw htw, SingleEmitter singleEmitter) {
        singleEmitter.a((Cancellable) new $$Lambda$htz$DEKyTPTMRMkDJ3GyZmkClraJ0PA(this));
        hvd<huw> a = this.c.a(htb.a(singleEmitter, new $$Lambda$htz$eeTApzUM1UtrvjqknQW02HabqDs(this), new $$Lambda$htz$SD0QsyD9FyMFKQxzm96pVJikH1c(this)), str, str2, htw);
        a.a(0, 50);
        this.h = a;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.g.b("country_code").c(1).h().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$htz$wkytB_FNaePoLb0XWsUNXb2Et4g<Object,Object>(this, hts.b(huo), hts.a(huo)));
    }
}
