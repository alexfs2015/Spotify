package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hrr reason: default package */
public final class hrr implements hqx {
    private final iod b;
    private final hpb c;

    public hrr(iod iod, hpb hpb) {
        this.b = iod;
        this.c = hpb;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        ioc a = this.b.a();
        a.a(false, false, false);
        return a.a().h().f(new $$Lambda$hrr$THOSUribDBQ3SND9NLcyQSEhxNI(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(uyy uyy) {
        uyq[] uyqArr = (uyq[]) uyy.getItems();
        ArrayList arrayList = new ArrayList(uyqArr.length);
        for (uyq a : uyqArr) {
            arrayList.add(this.c.a(a));
        }
        return arrayList;
    }
}
