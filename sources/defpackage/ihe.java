package defpackage;

import android.content.Context;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Observable;

/* renamed from: ihe reason: default package */
public final class ihe {
    private static b<Object, Boolean> a = b.b("key_voice_ads");
    private final SpSharedPreferences<Object> b;
    private final jvr c;
    private final hxl d;

    public ihe(SpSharedPreferences<Object> spSharedPreferences, jvr jvr, hxl hxl) {
        this.b = spSharedPreferences;
        this.c = jvr;
        this.d = hxl;
    }

    public static boolean a(fpt fpt) {
        return ((Boolean) fpt.a(hwb.a)).booleanValue() && fpt.a(hwb.k) == RolloutFlag.ENABLED;
    }

    public final boolean a() {
        return this.b.a(a, true);
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).b();
    }

    public final Observable<Targetings> a(Context context, fpt fpt) {
        return this.d.a("voice_ads", Boolean.toString(a(fpt) && this.c.a(context, "android.permission.RECORD_AUDIO") && a()));
    }
}
