package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: jck reason: default package */
public final class jck implements wig<Entry<Integer, jcd>> {
    private final wzi<Context> a;
    private final wzi<jaw> b;

    public static Entry<Integer, jcd> a(Context context, jaw jaw) {
        return (Entry) wil.a(CC.a(context, jaw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (jaw) this.b.get());
    }
}
