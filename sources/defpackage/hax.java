package defpackage;

import com.spotify.mobile.android.hubframework.defaults.fallbacks.SpotifyHubsFallbackUsageReporter;

/* renamed from: hax reason: default package */
final class hax implements a {
    private final SpotifyHubsFallbackUsageReporter a;

    hax(a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    public final void a(hcm hcm, int i) {
        if (i != 0) {
            SpotifyHubsFallbackUsageReporter spotifyHubsFallbackUsageReporter = this.a;
            StringBuilder sb = new StringBuilder("Using fallback binder for category ");
            sb.append(hcm.componentId().category());
            spotifyHubsFallbackUsageReporter.a(sb.toString(), hcm);
        }
    }
}
