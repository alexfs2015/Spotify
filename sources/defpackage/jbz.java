package defpackage;

import java.util.Map.Entry;

/* renamed from: jbz reason: default package */
public final class jbz implements vua<Entry<Integer, jbn>> {
    static {
        new jbz();
    }

    public static Entry<Integer, jbn> a() {
        return (Entry) vuf.a(jbr.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
