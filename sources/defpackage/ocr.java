package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.features.placebobanner.models.BannerConfiguration;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ocr reason: default package */
public final class ocr {
    public static final b<Object, JSONObject> a = b.b("placebo_banner_configuration");
    public final ObjectMapper b;
    public final SpSharedPreferences<Object> c;

    public ocr(ObjectMapper objectMapper, SpSharedPreferences<Object> spSharedPreferences) {
        this.b = objectMapper;
        this.c = spSharedPreferences;
    }

    public final void a() {
        Logger.b("clear", new Object[0]);
        this.c.a().a(a).b();
    }

    public final BannerConfiguration b() {
        BannerConfiguration bannerConfiguration;
        Logger.b("load", new Object[0]);
        if (this.c.e(a)) {
            try {
                bannerConfiguration = (BannerConfiguration) this.b.readValue(this.c.d(a).toString(), BannerConfiguration.class);
            } catch (IOException | JSONException e) {
                Logger.d(e, "error loading banner configuration", new Object[0]);
            }
            Logger.b("value loaded: %s", bannerConfiguration);
            return bannerConfiguration;
        }
        bannerConfiguration = null;
        Logger.b("value loaded: %s", bannerConfiguration);
        return bannerConfiguration;
    }
}
