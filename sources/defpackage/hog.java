package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.ExternalIntegrationService;

/* renamed from: hog reason: default package */
public final class hog implements a {
    private final Context a;

    public final void a() {
    }

    public final String c() {
        return "ExternalIntegrationService";
    }

    hog(Context context) {
        this.a = context;
    }

    public final void b() {
        ExternalIntegrationService.a(this.a);
    }
}
