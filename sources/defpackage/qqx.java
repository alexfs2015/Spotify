package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: qqx reason: default package */
final class qqx implements SpotifyServiceIntentProcessor {
    private final qqv a;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    qqx(qqv qqv) {
        this.a = qqv;
    }

    public final Result a(boolean z, Intent intent) {
        this.a.e();
        return Result.IGNORABLE;
    }
}
