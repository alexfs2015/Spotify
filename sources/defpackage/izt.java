package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: izt reason: default package */
public final class izt implements vua<Map<Integer, izr>> {
    private final wlc<Set<Entry<Integer, izr>>> a;

    public static Map<Integer, izr> a(Set<Entry<Integer, izr>> set) {
        return (Map) vuf.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
