package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: izw reason: default package */
public final class izw implements vua<Entry<Integer, izr>> {
    private final wlc<Context> a;
    private final wlc<iyb> b;

    public static Entry<Integer, izr> a(Context context, iyb iyb) {
        return (Entry) vuf.a(CC.a(context, iyb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (iyb) this.b.get());
    }
}
