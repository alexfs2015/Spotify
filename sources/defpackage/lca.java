package defpackage;

import android.app.NotificationManager;
import com.spotify.music.storage.CacheMovingIntentService;

/* renamed from: lca reason: default package */
public final class lca implements vua<vjs> {
    private final wlc<CacheMovingIntentService> a;
    private final wlc<NotificationManager> b;
    private final wlc<vjt> c;

    public static vjs a(CacheMovingIntentService cacheMovingIntentService, NotificationManager notificationManager, vjt vjt) {
        return (vjs) vuf.a(CC.a(cacheMovingIntentService, notificationManager, vjt), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((CacheMovingIntentService) this.a.get(), (NotificationManager) this.b.get(), (vjt) this.c.get());
    }
}
