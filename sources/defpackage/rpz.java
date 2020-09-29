package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.HashSet;
import java.util.Set;
import rx.Emitter;

/* renamed from: rpz reason: default package */
public final class rpz {
    private static b<Object, Boolean> c = b.b("show-premium-language-onboarding-home-header");
    private final SpSharedPreferences<Object> a;
    private final Set<Emitter<Boolean>> b = new HashSet(1);

    public rpz(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = (SpSharedPreferences) fay.a(spSharedPreferences);
    }

    public final void a(boolean z) {
        this.a.a().a(c, false).b();
        for (Emitter onNext : this.b) {
            onNext.onNext(Boolean.FALSE);
        }
    }
}
