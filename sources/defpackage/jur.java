package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.spotify.music.feedback.service.FeedbackService;

/* renamed from: jur reason: default package */
public final class jur {
    public static PendingIntent a(Context context, String str, String str2, String str3) {
        return PendingIntent.getService(context, 1, FeedbackService.c(context, str, str2, str3), 134217728);
    }
}
