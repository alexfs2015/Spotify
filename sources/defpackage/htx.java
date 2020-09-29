package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.Single;
import java.util.List;

/* renamed from: htx reason: default package */
public final class htx implements hth {
    private final htz b;

    public htx(htz htz) {
        this.b = htz;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.b.a(huo.a(String.format("%s%s", new Object[]{"spotify:space_item:", "partner-recommendations"}), huo.e()).a(huo.a()).c(huo.c()).d(huo.d()).a(), z);
    }
}
