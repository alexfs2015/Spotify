package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.IOException;

/* renamed from: ioe reason: default package */
public final class ioe {
    public static final b<Object, String> a = b.b("com.spotify.music.features.bixbyhomecards.STREAMING_CARD_DATA_CACHE");
    public final SpSharedPreferences<Object> b;
    public final ObjectMapper c;

    public ioe(SpSharedPreferences<Object> spSharedPreferences, rwl rwl) {
        this.b = spSharedPreferences;
        this.c = rwl.b();
    }

    /* access modifiers changed from: 0000 */
    public StreamingCardData a(String str) {
        try {
            return (StreamingCardData) this.c.readValue(str, StreamingCardData.class);
        } catch (IOException e) {
            Logger.e(e, "Failed parsing recommended playlists cached response", new Object[0]);
            return null;
        }
    }
}
