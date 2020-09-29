package defpackage;

import android.app.NotificationManager;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;

/* renamed from: lbk reason: default package */
public final class lbk implements vua<vjs> {
    private final wlc<BixbyHomeCardService> a;
    private final wlc<NotificationManager> b;
    private final wlc<vjt> c;

    public static vjs a(BixbyHomeCardService bixbyHomeCardService, NotificationManager notificationManager, vjt vjt) {
        return (vjs) vuf.a(CC.a(bixbyHomeCardService, notificationManager, vjt), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((BixbyHomeCardService) this.a.get(), (NotificationManager) this.b.get(), (vjt) this.c.get());
    }
}
