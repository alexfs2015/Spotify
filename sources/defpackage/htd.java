package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: htd reason: default package */
public final class htd implements hth {
    private final Context b;
    private final hrg c;

    public htd(Context context, hrg hrg) {
        this.b = context;
        this.c = hrg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(boolean z, List list) {
        if (!z && !list.isEmpty()) {
            return Single.b(list);
        }
        return Single.b(Lists.a((E[]) new MediaBrowserItem[]{hrz.a(this.b), hsj.a(this.b), hrq.a(this.b)}));
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.c.a(huo, z).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$htd$WLzL5zgaRXEwdrVpReaVa7qn5iw<Object,Object>(this, z));
    }
}
