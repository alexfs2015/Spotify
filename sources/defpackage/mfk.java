package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

/* renamed from: mfk reason: default package */
public final class mfk implements mfi {
    private final mfj a;

    public mfk(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = new mfc(spSharedPreferences);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final Optional<DiscoveryConfiguration> b() {
        if (this.a.a()) {
            return this.a.b();
        }
        return Optional.e();
    }
}
