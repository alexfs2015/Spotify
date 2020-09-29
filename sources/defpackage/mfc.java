package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mfc reason: default package */
final class mfc implements mfj {
    private static final ObjectMapper a = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();
    private static b<Object, JSONObject> b = b.b("device_discovery_configuration");
    private SpSharedPreferences<Object> c;

    mfc(SpSharedPreferences<Object> spSharedPreferences) {
        this.c = spSharedPreferences;
    }

    public final boolean a() {
        return c() && !d();
    }

    private boolean c() {
        return this.c.e(b);
    }

    private boolean d() {
        boolean z = true;
        try {
            DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) a.readValue(this.c.d(b).toString(), DiscoveryConfiguration.class);
            if (discoveryConfiguration.b.size() == 0 && discoveryConfiguration.a.size() == 0) {
                return true;
            }
            z = false;
            return z;
        } catch (IOException | JSONException unused) {
        }
    }

    public final Optional<DiscoveryConfiguration> b() {
        if (c()) {
            try {
                DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) a.readValue(this.c.d(b).toString(), DiscoveryConfiguration.class);
                if (!discoveryConfiguration.c) {
                    return Optional.b(discoveryConfiguration);
                }
                e();
                return Optional.e();
            } catch (IOException | JSONException unused) {
                e();
            }
        }
        return Optional.e();
    }

    private void e() {
        this.c.a().a(b).b();
    }
}
