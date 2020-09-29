package defpackage;

import android.app.NotificationManager;
import com.spotify.music.storage.CacheMovingIntentService;

/* renamed from: lfn reason: default package */
public final class lfn implements wig<vwy> {
    private final wzi<CacheMovingIntentService> a;
    private final wzi<NotificationManager> b;
    private final wzi<vwz> c;

    public static vwy a(CacheMovingIntentService cacheMovingIntentService, NotificationManager notificationManager, vwz vwz) {
        return (vwy) wil.a(CC.a(cacheMovingIntentService, notificationManager, vwz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((CacheMovingIntentService) this.a.get(), (NotificationManager) this.b.get(), (vwz) this.c.get());
    }
}
