package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eml reason: default package */
public class eml {
    static final eml a = new eml(0);
    private static volatile boolean c = false;
    private static volatile eml d;
    final Map<a, d<?, ?>> b;

    /* renamed from: eml$a */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static eml a() {
        return emk.a();
    }

    public static eml b() {
        eml eml = d;
        if (eml == null) {
            synchronized (eml.class) {
                eml = d;
                if (eml == null) {
                    eml = emk.b();
                    d = eml;
                }
            }
        }
        return eml;
    }

    static eml c() {
        return emu.a(eml.class);
    }

    eml() {
        this.b = new HashMap();
    }

    private eml(byte b2) {
        this.b = Collections.emptyMap();
    }

    static {
        d();
    }
}
