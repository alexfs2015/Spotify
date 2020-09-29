package defpackage;

import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import io.reactivex.SingleEmitter;
import java.io.IOException;
import java.util.List;

/* renamed from: hqs reason: default package */
public final class hqs implements hsi<hse> {
    private final SingleEmitter<List<MediaBrowserItem>> a;
    private final gbt<List<hse>, List<MediaBrowserItem>> b;
    private final Runnable c;

    hqs(SingleEmitter<List<MediaBrowserItem>> singleEmitter, gbt<List<hse>, List<MediaBrowserItem>> gbt, Runnable runnable) {
        this.a = singleEmitter;
        this.b = gbt;
        this.c = runnable;
    }

    public final void a(List<hse> list) {
        this.c.run();
        SingleEmitter<List<MediaBrowserItem>> singleEmitter = this.a;
        if (!singleEmitter.b()) {
            if (list != null) {
                singleEmitter.a((List) this.b.apply(list));
                return;
            }
            singleEmitter.a((Throwable) new IOException("Failed to load items from space."));
        }
    }
}
