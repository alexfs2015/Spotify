package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hud reason: default package */
public final class hud implements hth {
    private final iqq b;
    private final hrc c;

    public hud(iqq iqq, hrc hrc) {
        this.b = iqq;
        this.c = hrc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(vlb vlb) {
        vkt[] vktArr = (vkt[]) vlb.getItems();
        ArrayList arrayList = new ArrayList(vktArr.length);
        for (vkt a : vktArr) {
            arrayList.add(this.c.a(a));
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        iqp a = this.b.a();
        a.a(false, false, false);
        return a.a().h().f(new $$Lambda$hud$399NygatbxBtefgMFtSihzTdiA(this));
    }
}
