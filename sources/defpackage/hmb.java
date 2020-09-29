package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hmb reason: default package */
public final class hmb implements SpotifyServiceIntentProcessor {
    private final jhz a;
    private final hfo b;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    hmb(jhz jhz, hfo hfo) {
        this.a = jhz;
        this.b = hfo;
    }

    public final Result a(boolean z, Intent intent) {
        if (this.a.p.g()) {
            this.b.a(true);
        }
        this.a.k.e();
        return Result.IGNORABLE;
    }
}
