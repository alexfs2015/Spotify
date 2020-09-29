package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@cey
/* renamed from: coe reason: default package */
public final class coe {
    public static boolean a(doy doy) {
        Bundle bundle = doy.m != null ? doy.m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}
