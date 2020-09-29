package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: izy reason: default package */
public final class izy implements vua<Entry<Integer, izr>> {
    private final wlc<Context> a;
    private final wlc<iyl> b;

    public static Entry<Integer, izr> a(Context context, iyl iyl) {
        return (Entry) vuf.a(CC.a(context, iyl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (iyl) this.b.get());
    }
}
