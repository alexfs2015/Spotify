package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kjk reason: default package */
public final class kjk {
    @SafeVarargs
    public static <F, G extends F> Set<F> a(G... gArr) {
        HashSet hashSet = new HashSet(gArr.length);
        Collections.addAll(hashSet, kkr.a((T[]) (Object[]) gArr));
        return hashSet;
    }
}
