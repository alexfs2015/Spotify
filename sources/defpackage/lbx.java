package defpackage;

import android.app.NotificationManager;
import com.spotify.music.R;
import com.spotify.music.storage.CacheMovingIntentService;

/* renamed from: lbx reason: default package */
public interface lbx {

    /* renamed from: lbx$a */
    public interface a {

        /* renamed from: lbx$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static vjs a(CacheMovingIntentService cacheMovingIntentService, NotificationManager notificationManager, vjt vjt) {
                vjs vjs = new vjs(cacheMovingIntentService, notificationManager, vjt, R.string.spotify_notification_channel_name, R.string.spotify_notification_channel_description);
                return vjs;
            }
        }
    }
}
