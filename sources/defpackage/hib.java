package defpackage;

import android.app.NotificationManager;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.music.R;

/* renamed from: hib reason: default package */
public final class hib implements vua<vjs> {
    private final wlc<SpotifyService> a;
    private final wlc<NotificationManager> b;
    private final wlc<vjt> c;

    private hib(wlc<SpotifyService> wlc, wlc<NotificationManager> wlc2, wlc<vjt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hib a(wlc<SpotifyService> wlc, wlc<NotificationManager> wlc2, wlc<vjt> wlc3) {
        return new hib(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        vjs vjs = new vjs((SpotifyService) this.a.get(), (NotificationManager) this.b.get(), (vjt) this.c.get(), R.string.spotify_notification_channel_name, R.string.spotify_notification_channel_description);
        return (vjs) vuf.a(vjs, "Cannot return null from a non-@Nullable @Provides method");
    }
}
