package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: enc reason: default package */
public class enc {
    static final enc a = new enc(0);
    private static volatile boolean c;
    private static volatile enc d;
    final Map<a, d<?, ?>> b;

    /* renamed from: enc$a */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.b;
        }
    }

    static {
        d();
    }

    enc() {
        this.b = new HashMap();
    }

    private enc(byte b2) {
        this.b = Collections.emptyMap();
    }

    public static enc a() {
        return enb.a();
    }

    public static enc b() {
        enc enc = d;
        if (enc == null) {
            synchronized (enc.class) {
                enc = d;
                if (enc == null) {
                    enc = enb.b();
                    d = enc;
                }
            }
        }
        return enc;
    }

    static enc c() {
        return enl.a(enc.class);
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
