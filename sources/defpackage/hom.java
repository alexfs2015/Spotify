package defpackage;

import android.content.Intent;
import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hom reason: default package */
final class hom implements SpotifyServiceIntentProcessor {
    private final Optional<OrbitServiceInterface> a;
    private final Handler b;

    hom(Optional<OrbitServiceInterface> optional, Handler handler) {
        this.a = optional;
        this.b = handler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        ((OrbitServiceInterface) this.a.c()).crash();
    }

    public final Result a(boolean z, Intent intent) {
        Logger.b("ACTION_CRASH_SERVICE received", new Object[0]);
        if (this.a.b()) {
            this.b.postDelayed(new $$Lambda$hom$DlK4bJYchQmphQCD9ON4VR57Is(this), 100);
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
