package com.spotify.mobile.android.hubframework.defaults.fallbacks;

import com.spotify.mobile.android.util.Assertion;
import java.util.HashSet;
import java.util.Set;

public final class SpotifyHubsFallbackUsageReporter {
    private final Set<String> a = new HashSet();
    private final a b;

    static final class FallbackUsage extends Exception {
        private static final long serialVersionUID = 9005131946731261203L;

        FallbackUsage(String str) {
            super(str);
        }
    }

    public SpotifyHubsFallbackUsageReporter(a aVar) {
        this.b = (a) fay.a(aVar);
    }

    public final void a(String str, gzt gzt) {
        if (!this.a.contains(gzt.id())) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(gyd.a(gzt));
            sb.append(". Current ViewUri: ");
            sb.append(this.b.ae_());
            sb.append(']');
            a(sb.toString());
            this.a.add(gzt.id());
        }
    }

    private static void a(String str) {
        Assertion.a((Throwable) new FallbackUsage(str));
    }
}
