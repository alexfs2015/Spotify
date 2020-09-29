package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: ogn reason: default package */
public final class ogn {
    static final b<Object, Long> a = b.b("account_linking_dialog_time_first_shown");
    static final b<Object, Integer> b = b.b("account_linking_dialog_times_shown");
    static final b<Object, Boolean> c = b.b("account_linking_not_linked");
    Optional<SpSharedPreferences<Object>> d = Optional.e();
    private final jyg e;
    private final Context f;

    ogn(jyg jyg, Context context) {
        this.e = jyg;
        this.f = context;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        if (this.d.b()) {
            return ((SpSharedPreferences) this.d.c()).a(b, 0);
        }
        throw new RuntimeException("setup needs to be called first");
    }

    public final String a(String str) {
        this.d = Optional.b(this.e.a(this.f, str));
        return str;
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (this.d.b()) {
            ((SpSharedPreferences) this.d.c()).a().a(c, z).b();
            return;
        }
        throw new RuntimeException("setup needs to be called first");
    }
}
