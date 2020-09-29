package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jbl reason: default package */
public final class jbl implements vua<Map<Integer, jbi>> {
    private final wlc<Set<Entry<Integer, jbi>>> a;

    public static Map<Integer, jbi> a(Set<Entry<Integer, jbi>> set) {
        return (Map) vuf.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
