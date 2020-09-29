package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: gcm reason: default package */
public final class gcm {
    public static <K, V> Map<K, V> a() {
        return Collections.synchronizedMap(new WeakHashMap(16));
    }
}
