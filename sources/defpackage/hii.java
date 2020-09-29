package defpackage;

import com.spotify.mobile.android.service.StateRestoreFileDeleter;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Random;

/* renamed from: hii reason: default package */
public final class hii implements vua<StateRestoreFileDeleter> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<Random> b;

    private hii(wlc<SpSharedPreferences<Object>> wlc, wlc<Random> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hii a(wlc<SpSharedPreferences<Object>> wlc, wlc<Random> wlc2) {
        return new hii(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new StateRestoreFileDeleter((SpSharedPreferences) this.a.get(), (Random) this.b.get());
    }
}
