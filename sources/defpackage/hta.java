package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.SingleEmitter;
import java.io.IOException;
import java.util.List;

/* renamed from: hta reason: default package */
public final class hta implements hva<huw> {
    private final SingleEmitter<List<MediaBrowserItem>> a;
    private final gcr<List<huw>, List<MediaBrowserItem>> b;
    private final Runnable c;

    hta(SingleEmitter<List<MediaBrowserItem>> singleEmitter, gcr<List<huw>, List<MediaBrowserItem>> gcr, Runnable runnable) {
        this.a = singleEmitter;
        this.b = gcr;
        this.c = runnable;
    }

    public final void a(List<huw> list) {
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
