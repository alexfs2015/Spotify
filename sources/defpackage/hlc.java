package defpackage;

import com.spotify.mobile.android.service.StateRestoreFileDeleter;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Random;

/* renamed from: hlc reason: default package */
public final class hlc implements wig<StateRestoreFileDeleter> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<Random> b;

    private hlc(wzi<SpSharedPreferences<Object>> wzi, wzi<Random> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hlc a(wzi<SpSharedPreferences<Object>> wzi, wzi<Random> wzi2) {
        return new hlc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new StateRestoreFileDeleter((SpSharedPreferences) this.a.get(), (Random) this.b.get());
    }
}
