package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

/* renamed from: mjw reason: default package */
public final class mjw implements mju {
    private final mjv a;

    public mjw(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = new mjo(spSharedPreferences);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final Optional<DiscoveryConfiguration> b() {
        return this.a.a() ? this.a.b() : Optional.e();
    }
}
