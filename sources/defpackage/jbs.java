package defpackage;

import java.util.Map.Entry;

/* renamed from: jbs reason: default package */
public final class jbs implements vua<Entry<Integer, jbn>> {
    static {
        new jbs();
    }

    public static Entry<Integer, jbn> a() {
        return (Entry) vuf.a(jbr.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
