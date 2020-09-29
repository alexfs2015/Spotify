package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ldu reason: default package */
public final class ldu implements wig<SpSharedPreferences<Object>> {
    private final wzi<Context> a;
    private final wzi<jyg> b;

    private ldu(wzi<Context> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ldu a(wzi<Context> wzi, wzi<jyg> wzi2) {
        return new ldu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (SpSharedPreferences) wil.a(((jyg) this.b.get()).b((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
