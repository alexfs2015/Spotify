package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qmj reason: default package */
public final class qmj implements wig<SpSharedPreferences<Object>> {
    private final wzi<jyg> a;
    private final wzi<Context> b;
    private final wzi<String> c;

    private qmj(wzi<jyg> wzi, wzi<Context> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qmj a(wzi<jyg> wzi, wzi<Context> wzi2, wzi<String> wzi3) {
        return new qmj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.c.get();
        return (SpSharedPreferences) wil.a(((jyg) this.a.get()).c((Context) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
