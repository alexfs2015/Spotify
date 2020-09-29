package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;

/* renamed from: hsu reason: default package */
public final class hsu implements hth {
    private final Context b;
    private final vqy c;

    public hsu(Context context, vqy vqy) {
        this.b = context;
        this.c = vqy;
    }

    private List<MediaBrowserItem> a() {
        return Lists.a((E[]) new MediaBrowserItem[]{hri.a(this.b), hrz.a(this.b), hrq.a(this.b), hsj.a(this.b)});
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        if (!this.c.a()) {
            return Single.b(a());
        }
        return Single.b(z ? a() : Collections.singletonList(hsj.a(this.b)));
    }
}
