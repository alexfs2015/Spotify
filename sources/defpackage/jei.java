package defpackage;

import android.content.Context;
import java.util.Map.Entry;

/* renamed from: jei reason: default package */
public final class jei implements wig<Entry<Integer, jdz>> {
    private final wzi<Context> a;

    public static Entry<Integer, jdz> a(Context context) {
        return (Entry) wil.a(jed.i(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
