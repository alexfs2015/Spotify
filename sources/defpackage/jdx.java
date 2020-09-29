package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jdx reason: default package */
public final class jdx implements wig<Map<Integer, jdu>> {
    private final wzi<Set<Entry<Integer, jdu>>> a;

    public static Map<Integer, jdu> a(Set<Entry<Integer, jdu>> set) {
        return (Map) wil.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
