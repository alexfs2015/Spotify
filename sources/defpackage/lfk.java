package defpackage;

import android.app.NotificationManager;
import com.spotify.music.R;
import com.spotify.music.storage.CacheMovingIntentService;

/* renamed from: lfk reason: default package */
public interface lfk {

    /* renamed from: lfk$a */
    public interface a {

        /* renamed from: lfk$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static vwy a(CacheMovingIntentService cacheMovingIntentService, NotificationManager notificationManager, vwz vwz) {
                vwy vwy = new vwy(cacheMovingIntentService, notificationManager, vwz, R.string.spotify_notification_channel_name, R.string.spotify_notification_channel_description);
                return vwy;
            }
        }
    }
}
