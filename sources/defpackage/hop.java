package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hop reason: default package */
public final class hop implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final jkp b;

    public hop(Context context, jkp jkp) {
        this.a = context;
        this.b = jkp;
    }

    public final Result a(boolean z, Intent intent) {
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
