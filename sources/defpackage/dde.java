package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dde reason: default package */
public final class dde {
    static final dde a = new dde(0);
    private static volatile boolean c;
    final Map<ddf, d<?, ?>> b;

    static {
        b();
    }

    dde() {
        this.b = new HashMap();
    }

    private dde(byte b2) {
        this.b = Collections.emptyMap();
    }

    public static dde a() {
        return ddd.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
