package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;
    private final ery b;
    private final Object c = new Object();

    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    a = new FirebaseAnalytics(ery.a(context, (eqr) null));
                }
            }
        }
        return a;
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!evt.a()) {
            this.b.q().f.a("setCurrentScreen must be called from the main thread");
            return;
        }
        etp h = this.b.h();
        if (h.b == null) {
            h.q().f.a("setCurrentScreen cannot be called while no activity active");
        } else if (h.d.get(activity) == null) {
            h.q().f.a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = etp.a(activity.getClass().getCanonicalName());
            }
            boolean equals = h.b.b.equals(str2);
            boolean c2 = evm.c(h.b.a, str);
            if (equals && c2) {
                h.q().h.a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h.q().f.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                h.q().k.a("Setting current screen to name, class", str == null ? "null" : str, str2);
                eto eto = new eto(str, str2, h.o().f());
                h.d.put(activity, eto);
                h.a(activity, eto, true);
            } else {
                h.q().f.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    private FirebaseAnalytics(ery ery) {
        bwx.a(ery);
        this.b = ery;
    }

    public final String getFirebaseInstanceId() {
        FirebaseInstanceId.a().b();
        return FirebaseInstanceId.d();
    }
}
