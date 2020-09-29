package defpackage;

import java.util.Map.Entry;

/* renamed from: jam reason: default package */
public final class jam implements vua<Entry<Integer, jai>> {
    private final wlc<iyb> a;
    private final wlc<jba> b;

    public static Entry<Integer, jai> a(iyb iyb, Object obj) {
        return (Entry) vuf.a(CC.a(iyb, (jba) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyb) this.a.get(), this.b.get());
    }
}
