package defpackage;

import android.app.NotificationManager;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.music.R;

/* renamed from: hkv reason: default package */
public final class hkv implements wig<vwy> {
    private final wzi<SpotifyService> a;
    private final wzi<NotificationManager> b;
    private final wzi<vwz> c;

    private hkv(wzi<SpotifyService> wzi, wzi<NotificationManager> wzi2, wzi<vwz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hkv a(wzi<SpotifyService> wzi, wzi<NotificationManager> wzi2, wzi<vwz> wzi3) {
        return new hkv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        vwy vwy = new vwy((SpotifyService) this.a.get(), (NotificationManager) this.b.get(), (vwz) this.c.get(), R.string.spotify_notification_channel_name, R.string.spotify_notification_channel_description);
        return (vwy) wil.a(vwy, "Cannot return null from a non-@Nullable @Provides method");
    }
}
