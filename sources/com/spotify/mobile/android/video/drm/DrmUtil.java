package com.spotify.mobile.android.video.drm;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class DrmUtil {
    public static final UUID a = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
    private static Set<UUID> b;

    public static class UnexpectedDrmException extends Exception {
        private static final long serialVersionUID = -9191534019891635782L;

        public UnexpectedDrmException(Throwable th) {
            super(th);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(a);
        b = Collections.unmodifiableSet(hashSet);
    }

    public static UUID a(aqe aqe) {
        if (aqe.i != null) {
            for (int i = 0; i < aqe.i.c; i++) {
                for (UUID uuid : b) {
                    if (aqe.i.a[i].a(uuid)) {
                        return uuid;
                    }
                }
            }
        }
        return null;
    }

    public static jzq a(Looper looper, wmb wmb, a aVar, String str) {
        jzr jzr = new jzr(wmb, str);
        if (VERSION.SDK_INT >= 18) {
            int i = 2;
            while (i > 0) {
                i--;
                try {
                    if (VERSION.SDK_INT >= 23) {
                        return jzp.a(looper, aVar, jzr);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        return jzo.a(looper, aVar, jzr);
                    }
                    return a(looper, aVar, jzr);
                } catch (UnsupportedDrmException unused) {
                } catch (UnexpectedDrmException unused2) {
                } catch (Exception unused3) {
                    return null;
                }
            }
        }
        return null;
    }

    public static jzq a(Looper looper, a aVar, asj asj) {
        UUID uuid = a;
        jzq jzq = new jzq(uuid, asi.a(uuid), asj, null, new Handler(looper), aVar);
        String str = "securityLevel";
        String str2 = "L3";
        if (!str2.equals(jzq.a(str))) {
            jzq.a(str, str2);
        }
        return jzq;
    }
}
