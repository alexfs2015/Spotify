package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jcf reason: default package */
public final class jcf implements wig<Map<Integer, jcd>> {
    private final wzi<Set<Entry<Integer, jcd>>> a;

    public static Map<Integer, jcd> a(Set<Entry<Integer, jcd>> set) {
        return (Map) wil.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
