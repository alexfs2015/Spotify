package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hlx reason: default package */
public final class hlx implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final jhz b;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public hlx(Context context, jhz jhz) {
        this.a = context;
        this.b = jhz;
    }

    public final Result a(boolean z, Intent intent) {
        return Result.IGNORABLE;
    }
}
