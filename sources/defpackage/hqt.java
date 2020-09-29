package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import io.reactivex.SingleEmitter;
import java.util.List;

/* renamed from: hqt reason: default package */
public final class hqt {
    public static hqs a(SingleEmitter<List<MediaBrowserItem>> singleEmitter, gbt<List<hse>, List<MediaBrowserItem>> gbt, Runnable runnable) {
        return new hqs((SingleEmitter) a(singleEmitter, 1), (gbt) a(gbt, 2), (Runnable) a(runnable, 3));
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
