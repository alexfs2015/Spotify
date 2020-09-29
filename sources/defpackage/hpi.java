package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.playlist.models.Show;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hpi reason: default package */
public final class hpi implements hqx {
    private final Observable<uyy<uyq>> b;
    private final Observable<uyy<uys>> c;
    private final Observable<uyv> d;
    private final hpb e;

    public hpi(Observable<uyy<uyq>> observable, Observable<uyy<uys>> observable2, Observable<uyv> observable3, hpb hpb) {
        this.b = observable;
        this.c = observable2;
        this.d = observable3;
        this.e = hpb;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        return Observable.b(this.d.c((Function<? super T, ? extends R>) new $$Lambda$hpi$3PWOzm6yNdaKaH89yBrx48J0Gfw<Object,Object>(this)), this.b.c((Function<? super T, ? extends R>) new $$Lambda$hpi$b_n63xcK5jw0UN75fw4m7gg3EfA<Object,Object>(this)), this.c.c((Function<? super T, ? extends R>) new $$Lambda$hpi$2bpRFqQP0vYHO3HySLuUM3GPnVE<Object,Object>(this)), $$Lambda$hpi$InzxU_bJxzEg69Pr7Zy5zLEvRFQ.INSTANCE).a(0, Collections.emptyList());
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
    public List<MediaBrowserItem> a(uyv uyv) {
        ArrayList arrayList = new ArrayList(uyv.getUnfilteredLength());
        for (uyz a : (uyz[]) uyv.getItems()) {
            arrayList.add(this.e.a(a));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(uyy<uyq> uyy) {
        ArrayList arrayList = new ArrayList(uyy.getUnfilteredLength());
        for (uyq a : (uyq[]) uyy.getItems()) {
            arrayList.add(this.e.a(a));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> b(uyy<uys> uyy) {
        ArrayList arrayList = new ArrayList(uyy.getUnfilteredLength());
        for (uys a : (uys[]) uyy.getItems()) {
            arrayList.add(this.e.a(a, $$Lambda$hpi$_mdhnecVU5JNhfdqzHXOmFy1U9w.INSTANCE));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(uys uys) {
        Show t = uys.t();
        if (t != null) {
            return t.getTitle();
        }
        return uys.d();
    }
}
