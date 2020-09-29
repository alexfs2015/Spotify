package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jar reason: default package */
public final class jar implements vua<Map<Integer, jai>> {
    private final wlc<Set<Entry<Integer, jai>>> a;

    public static Map<Integer, jai> a(Set<Entry<Integer, jai>> set) {
        return (Map) vuf.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
