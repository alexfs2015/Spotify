package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hoy reason: default package */
final class hoy implements SpotifyServiceIntentProcessor {
    private final hik a;

    hoy(hik hik) {
        this.a = hik;
    }

    public final Result a(boolean z, Intent intent) {
        this.a.a(intent.getIntExtra("position", 0));
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
