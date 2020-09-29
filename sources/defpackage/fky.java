package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fky reason: default package */
public final class fky {
    static final fky a = new fky(0);
    private static volatile boolean b;
    private final Map<Object, Object<?, ?>> c;

    static {
        b();
    }

    fky() {
        this.c = new HashMap();
    }

    private fky(byte b2) {
        this.c = Collections.emptyMap();
    }

    public static fky a() {
        return fkx.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
