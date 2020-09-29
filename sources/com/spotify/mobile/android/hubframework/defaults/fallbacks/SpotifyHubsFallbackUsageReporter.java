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
        this.b = (a) fbp.a(aVar);
    }

    private static void a(String str) {
        Assertion.a((Throwable) new FallbackUsage(str));
    }

    public final void a(String str, hcm hcm) {
        if (!this.a.contains(hcm.id())) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = " :";
            sb.append(": ");
            sb.append(haw.a(hcm));
            sb.append(". Current ViewUri: ");
            sb.append(this.b.ae_());
            sb.append(']');
            a(sb.toString());
            this.a.add(hcm.id());
        }
    }
}
