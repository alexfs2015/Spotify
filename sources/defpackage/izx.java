package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: izx reason: default package */
public final class izx implements vua<Entry<Integer, izr>> {
    private final wlc<Context> a;
    private final wlc<iyg> b;

    public static Entry<Integer, izr> a(Context context, iyg iyg) {
        return (Entry) vuf.a(CC.a(context, iyg), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (iyg) this.b.get());
    }
}
