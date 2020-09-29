package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.ExternalIntegrationService;

/* renamed from: hqi reason: default package */
public final class hqi implements a {
    private final Context a;

    hqi(Context context) {
        this.a = context;
    }

    public final void a() {
    }

    public final void b() {
        ExternalIntegrationService.a(this.a);
    }

    public final String c() {
        return "ExternalIntegrationService";
    }
}
