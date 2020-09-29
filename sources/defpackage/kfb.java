package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: kfb reason: default package */
public final class kfb {
    public final Context a;
    public final vwu b;

    public kfb(Context context, vwu vwu) {
        this.a = context;
        this.b = vwu;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.spotify.mobile.android.spotlets.waze.WazeService"));
        return intent;
    }

    public final void a() {
        Logger.c("Start WazeService by launch", new Object[0]);
        Intent a2 = a(this.a);
        a2.setAction("com.spotify.music.internal.service.waze.LAUNCH");
        this.b.a(this.a, a2, "WazeLauncher", new Object[0]);
    }

    public final void a(boolean z, String str) {
        Logger.c("Start WazeService noConnection: %b", Boolean.valueOf(z));
        Intent a2 = a(this.a);
        a2.setAction(str);
        if (z) {
            a2.putExtra("com.spotify.music.internal.service.waze.EXTRA_NO_WAZE_CONNECTION", true);
        }
        this.b.a(this.a, a2, "WazeLauncher", new Object[0]);
    }

    public final void b() {
        Logger.c("Stop WazeService", new Object[0]);
        Context context = this.a;
        context.stopService(a(context));
    }
}
