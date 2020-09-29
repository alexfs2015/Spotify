package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.SingleEmitter;
import java.util.List;

/* renamed from: htb reason: default package */
public final class htb {
    public static hta a(SingleEmitter<List<MediaBrowserItem>> singleEmitter, gcr<List<huw>, List<MediaBrowserItem>> gcr, Runnable runnable) {
        return new hta((SingleEmitter) a(singleEmitter, 1), (gcr) a(gcr, 2), (Runnable) a(runnable, 3));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
