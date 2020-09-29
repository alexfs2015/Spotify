package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@cfp
/* renamed from: cov reason: default package */
public final class cov {
    public static boolean a(dpp dpp) {
        Bundle bundle = dpp.m != null ? dpp.m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}
