package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: jcj reason: default package */
public final class jcj implements wig<Entry<Integer, jcd>> {
    private final wzi<Context> a;
    private final wzi<jar> b;

    public static Entry<Integer, jcd> a(Context context, jar jar) {
        return (Entry) wil.a(CC.a(context, jar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (jar) this.b.get());
    }
}
