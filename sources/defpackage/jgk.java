package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.waze.WazeReturnActivity;

/* renamed from: jgk reason: default package */
public final class jgk implements kff {
    public final PendingIntent a(Context context) {
        Intent intent = new Intent(context, WazeReturnActivity.class);
        intent.setFlags(268435456);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }
}
