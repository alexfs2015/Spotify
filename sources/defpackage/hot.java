package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hot reason: default package */
public final class hot implements SpotifyServiceIntentProcessor {
    private final jkp a;
    private final hik b;

    hot(jkp jkp, hik hik) {
        this.a = jkp;
        this.b = hik;
    }

    public final Result a(boolean z, Intent intent) {
        if (this.a.p.g()) {
            this.b.a(true);
        }
        this.a.k.e();
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
