package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: jci reason: default package */
public final class jci implements wig<Entry<Integer, jcd>> {
    private final wzi<Context> a;
    private final wzi<jam> b;

    public static Entry<Integer, jcd> a(Context context, jam jam) {
        return (Entry) wil.a(CC.a(context, jam), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (jam) this.b.get());
    }
}
