package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.playlist.models.Show;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hrg reason: default package */
public final class hrg implements hth {
    private final Observable<vlb<vkt>> b;
    private final Observable<vlb<vkv>> c;
    private final Observable<vky> d;
    private final hrc e;

    public hrg(Observable<vlb<vkt>> observable, Observable<vlb<vkv>> observable2, Observable<vky> observable3, hrc hrc) {
        this.b = observable;
        this.c = observable2;
        this.d = observable3;
        this.e = hrc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(vkv vkv) {
        Show t = vkv.t();
        return t != null ? t.getTitle() : vkv.d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(vky vky) {
        ArrayList arrayList = new ArrayList(vky.getUnfilteredLength());
        for (vlc a : (vlc[]) vky.getItems()) {
            arrayList.add(this.e.a(a));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(vlb<vkt> vlb) {
        ArrayList arrayList = new ArrayList(vlb.getUnfilteredLength());
        for (vkt a : (vkt[]) vlb.getItems()) {
            arrayList.add(this.e.a(a));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> b(vlb<vkv> vlb) {
        ArrayList arrayList = new ArrayList(vlb.getUnfilteredLength());
        for (vkv a : (vkv[]) vlb.getItems()) {
            arrayList.add(this.e.a(a, $$Lambda$hrg$d3BoqpdpUF2fysADzr61le6TKAo.INSTANCE));
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return Observable.b(this.d.c((Function<? super T, ? extends R>) new $$Lambda$hrg$UgPQwW_s7a94gQFKY8K594FXU<Object,Object>(this)), this.b.c((Function<? super T, ? extends R>) new $$Lambda$hrg$qEsq4ikwR3J0ybXQ_h6Z2sVks<Object,Object>(this)), this.c.c((Function<? super T, ? extends R>) new $$Lambda$hrg$ndNMoYl2TrPcnUfPQthSI1wRIrY<Object,Object>(this)), $$Lambda$hrg$TiQJV11NKR_T8ru3ZyAftxwQs.INSTANCE).a(0, Collections.emptyList());
    }
}
