package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dcn reason: default package */
public final class dcn {
    static final dcn a = new dcn(0);
    private static volatile boolean c = false;
    final Map<dco, d<?, ?>> b;

    static {
        b();
    }

    dcn() {
        this.b = new HashMap();
    }

    private dcn(byte b2) {
        this.b = Collections.emptyMap();
    }

    public static dcn a() {
        return dcm.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
