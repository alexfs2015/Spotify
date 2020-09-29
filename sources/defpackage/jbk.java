package defpackage;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jbk reason: default package */
public final class jbk implements vua<Set<Entry<Integer, jbi>>> {
    static {
        new jbk();
    }

    public static Set<Entry<Integer, jbi>> a() {
        return (Set) vuf.a(new HashSet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
