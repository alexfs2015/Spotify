package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.music.R;

/* renamed from: jvd reason: default package */
final class jvd {
    static jva a(boolean z, int i, int i2, int i3, int i4, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z2) {
        return z ? new jva(new jvb(i, i3), pendingIntent, z2) : new jva(new jvb(i2, i4), pendingIntent2, z2);
    }

    static jva a(hue hue, Context context, boolean z) {
        return a(hue.k() && !hue.n(), R.drawable.icn_notification_new_prev, R.drawable.icn_notification_new_prev_disabled, R.string.content_description_previous_track, R.string.content_description_previous_track_disabled, jus.b(context), null, z);
    }

    static jva b(hue hue, Context context, boolean z) {
        PendingIntent a = jus.a(context);
        return a(hue.g(), R.drawable.icn_notification_new_play, R.drawable.icn_notification_new_pause, R.string.content_description_play_button, R.string.content_description_pause_button, a, a, true);
    }

    static jva c(hue hue, Context context, boolean z) {
        return a(hue.l(), R.drawable.icn_notification_new_next, R.drawable.icn_notification_new_next_disabled, R.string.content_description_next_track, R.string.content_description_next_track_disabled, jus.c(context), null, z);
    }
}
