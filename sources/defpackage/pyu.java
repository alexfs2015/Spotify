package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.features.quicksilver.triggers.models.ClientEventTrigger;
import com.spotify.music.features.quicksilver.triggers.models.PlaybackStartedTrigger;
import com.spotify.music.features.quicksilver.triggers.models.UriTrigger;

/* renamed from: pyu reason: default package */
public final class pyu {
    final ObjectMapper a;

    public pyu(rwl rwl) {
        this.a = rwl.b();
    }

    static qag a(String str, String str2, String str3) {
        if ("URI".equals(str2)) {
            return UriTrigger.create(str, false, str3);
        }
        if ("PLAYBACK_STARTED".equals(str2)) {
            return PlaybackStartedTrigger.create(str, false, str3);
        }
        if ("CLIENT_EVENT".equals(str2)) {
            return ClientEventTrigger.create(str, false, str3);
        }
        return null;
    }
}
