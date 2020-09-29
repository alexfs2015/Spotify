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

    public static UUID a(aqv aqv) {
        if (aqv.i != null) {
            for (int i = 0; i < aqv.i.c; i++) {
                for (UUID uuid : b) {
                    if (aqv.i.a[i].a(uuid)) {
                        return uuid;
                    }
                }
            }
        }
        return null;
    }

    public static kbq a(Looper looper, a aVar, ata ata) {
        UUID uuid = a;
        ata ata2 = ata;
        kbq kbq = new kbq(uuid, asz.a(uuid), ata, null, new Handler(looper), aVar);
        String str = "securityLevel";
        String str2 = "L3";
        if (!str2.equals(kbq.a(str))) {
            kbq.a(str, str2);
        }
        return kbq;
    }

    public static kbq a(Looper looper, xah xah, a aVar, String str) {
        kbr kbr = new kbr(xah, str);
        if (VERSION.SDK_INT >= 18) {
            int i = 2;
            while (i > 0) {
                i--;
                try {
                    return VERSION.SDK_INT >= 23 ? kbp.a(looper, aVar, kbr) : VERSION.SDK_INT >= 21 ? kbo.a(looper, aVar, kbr) : a(looper, aVar, kbr);
                } catch (UnsupportedDrmException unused) {
                } catch (UnexpectedDrmException unused2) {
                } catch (Exception unused3) {
                    return null;
                }
            }
        }
        return null;
    }
}
