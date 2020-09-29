package defpackage;

import android.content.Context;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Observable;

/* renamed from: ijr reason: default package */
public final class ijr {
    private static b<Object, Boolean> a = b.b("key_voice_ads");
    private final SpSharedPreferences<Object> b;
    private final jxz c;
    private final hzx d;

    public ijr(SpSharedPreferences<Object> spSharedPreferences, jxz jxz, hzx hzx) {
        this.b = spSharedPreferences;
        this.c = jxz;
        this.d = hzx;
    }

    public static boolean a(fqn fqn) {
        return ((Boolean) fqn.a(hyn.a)).booleanValue() && fqn.a(hyn.k) == RolloutFlag.ENABLED;
    }

    public final Observable<Targetings> a(Context context, fqn fqn) {
        return this.d.a("voice_ads", Boolean.toString(a(fqn) && this.c.a(context, "android.permission.RECORD_AUDIO") && a()));
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).b();
    }

    public final boolean a() {
        return this.b.a(a, true);
    }
}
