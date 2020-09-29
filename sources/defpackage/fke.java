package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fke reason: default package */
public final class fke {
    static final fke a = new fke(0);
    private static volatile boolean b = false;
    private final Map<Object, Object<?, ?>> c;

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    static {
        b();
    }

    public static fke a() {
        return fkd.a();
    }

    fke() {
        this.c = new HashMap();
    }

    private fke(byte b2) {
        this.c = Collections.emptyMap();
    }
}
