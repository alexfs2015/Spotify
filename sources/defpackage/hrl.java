package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.RootListType;
import io.reactivex.Single;
import java.util.List;

/* renamed from: hrl reason: default package */
public final class hrl implements hqx {
    private final hrn b;

    public hrl(hrn hrn) {
        this.b = hrn;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        hrn hrn = this.b;
        RootListType b2 = hpk.b(hnd.a());
        if (b2 == null) {
            b2 = RootListType.DEFAULT;
        }
        return hrn.a(hnd.a(String.format("%spartner-recommendations:type:%s", new Object[]{"spotify:space_item:", b2.name})), str);
    }
}
