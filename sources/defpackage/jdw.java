package defpackage;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jdw reason: default package */
public final class jdw implements wig<Set<Entry<Integer, jdu>>> {
    static {
        new jdw();
    }

    public static Set<Entry<Integer, jdu>> a() {
        return (Set) wil.a(new HashSet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
