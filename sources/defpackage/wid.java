package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: wid reason: default package */
public final class wid {
    public static <T> List<T> a(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    public static boolean a(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    public static <K, V> LinkedHashMap<K, V> b(int i) {
        return new LinkedHashMap<>(c(i));
    }

    static int c(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
