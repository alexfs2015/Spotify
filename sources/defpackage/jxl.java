package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.music.R;

/* renamed from: jxl reason: default package */
final class jxl {
    static jxi a(hwq hwq, Context context, boolean z) {
        return a(hwq.k() && !hwq.n(), R.drawable.icn_notification_new_prev, R.drawable.icn_notification_new_prev_disabled, R.string.content_description_previous_track, R.string.content_description_previous_track_disabled, jxa.b(context), null, z);
    }

    static jxi a(boolean z, int i, int i2, int i3, int i4, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z2) {
        return z ? new jxi(new jxj(i, i3), pendingIntent, z2) : new jxi(new jxj(i2, i4), pendingIntent2, z2);
    }

    static jxi b(hwq hwq, Context context, boolean z) {
        PendingIntent a = jxa.a(context);
        return a(hwq.g(), R.drawable.icn_notification_new_play, R.drawable.icn_notification_new_pause, R.string.content_description_play_button, R.string.content_description_pause_button, a, a, true);
    }

    static jxi c(hwq hwq, Context context, boolean z) {
        return a(hwq.l(), R.drawable.icn_notification_new_next, R.drawable.icn_notification_new_next_disabled, R.string.content_description_next_track, R.string.content_description_next_track_disabled, jxa.c(context), null, z);
    }
}
