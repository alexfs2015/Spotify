package defpackage;

import java.util.Map.Entry;

/* renamed from: jat reason: default package */
public final class jat implements vua<Entry<Integer, jai>> {
    private final wlc<iyl> a;
    private final wlc<jba> b;

    public static Entry<Integer, jai> a(iyl iyl, Object obj) {
        return (Entry) vuf.a(CC.a(iyl, (jba) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyl) this.a.get(), this.b.get());
    }
}
