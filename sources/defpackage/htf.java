package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: htf reason: default package */
public final class htf implements hth {
    private final hrg b;
    private final htx c;

    public htf(hrg hrg, htx htx) {
        this.b = hrg;
        this.c = htx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(boolean z, huo huo, List list) {
        return (z || list.isEmpty()) ? this.c.a(huo, z) : Single.b(list);
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.b.a(huo, z).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$htf$DAHLRUFKPspPKZLfDyJ6YgZMSpw<Object,Object>(this, z, huo));
    }
}
