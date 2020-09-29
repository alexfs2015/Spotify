package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* renamed from: ask reason: default package */
public final class ask {
    public static Pair<Long, Long> a(DrmSession<?> drmSession) {
        Map h = drmSession.h();
        if (h == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h, "LicenseDurationRemaining")), Long.valueOf(a(h, "PlaybackDurationRemaining")));
    }

    private static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -9223372036854775807L;
    }
}
