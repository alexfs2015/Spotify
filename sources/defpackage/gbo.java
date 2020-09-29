package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: gbo reason: default package */
public final class gbo {
    public static <K, V> Map<K, V> a() {
        return Collections.synchronizedMap(new WeakHashMap(16));
    }
}
