package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hpa reason: default package */
final class hpa implements SpotifyServiceIntentProcessor {
    hpa() {
    }

    public final Result a(boolean z, Intent intent) {
        Logger.c("Start service action received.", new Object[0]);
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
