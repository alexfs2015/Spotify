package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jdd reason: default package */
public final class jdd implements wig<Map<Integer, jcu>> {
    private final wzi<Set<Entry<Integer, jcu>>> a;

    public static Map<Integer, jcu> a(Set<Entry<Integer, jcu>> set) {
        return (Map) wil.a(CC.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get());
    }
}
