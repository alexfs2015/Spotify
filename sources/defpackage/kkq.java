package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kkq reason: default package */
public final class kkq {
    public static <T> Set<T> a(Set<? extends T> set) {
        kkr.a(set);
        return Collections.unmodifiableSet(new HashSet(set));
    }
}