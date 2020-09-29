package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: knz reason: default package */
public final class knz {
    public static <T> Set<T> a(Set<? extends T> set) {
        koa.a(set);
        return Collections.unmodifiableSet(new HashSet(set));
    }
}
