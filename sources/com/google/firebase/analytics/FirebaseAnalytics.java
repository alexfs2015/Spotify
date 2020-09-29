package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;
    private final esp b;
    private final Object c = new Object();

    private FirebaseAnalytics(esp esp) {
        bxo.a(esp);
        this.b = esp;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    a = new FirebaseAnalytics(esp.a(context, (eri) null));
                }
            }
        }
        return a;
    }

    public final String getFirebaseInstanceId() {
        FirebaseInstanceId.a().b();
        return FirebaseInstanceId.d();
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!ewk.a()) {
            this.b.q().f.a("setCurrentScreen must be called from the main thread");
            return;
        }
        eug h = this.b.h();
        if (h.b == null) {
            h.q().f.a("setCurrentScreen cannot be called while no activity active");
        } else if (h.d.get(activity) == null) {
            h.q().f.a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = eug.a(activity.getClass().getCanonicalName());
            }
            boolean equals = h.b.b.equals(str2);
            boolean c2 = ewd.c(h.b.a, str);
            if (equals && c2) {
                h.q().h.a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h.q().f.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                h.q().k.a("Setting current screen to name, class", str == null ? "null" : str, str2);
                euf euf = new euf(str, str2, h.o().f());
                h.d.put(activity, euf);
                h.a(activity, euf, true);
            } else {
                h.q().f.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }
}
