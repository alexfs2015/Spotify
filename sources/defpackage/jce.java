package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: jce reason: default package */
public final class jce implements vua<Entry<Integer, jbn>> {
    private final wlc<Context> a;

    public static Entry<Integer, jbn> a(Context context) {
        return (Entry) vuf.a(jbr.d(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
