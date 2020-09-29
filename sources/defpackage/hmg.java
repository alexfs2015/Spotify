package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hmg reason: default package */
final class hmg implements SpotifyServiceIntentProcessor {
    private final hfo a;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    hmg(hfo hfo) {
        this.a = hfo;
    }

    public final Result a(boolean z, Intent intent) {
        this.a.a(intent.getIntExtra("position", 0));
        return Result.IGNORABLE;
    }
}
