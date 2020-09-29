package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: euc reason: default package */
final class euc implements ActivityLifecycleCallbacks {
    private final /* synthetic */ ett a;

    private euc(ett ett) {
        this.a = ett;
    }

    /* synthetic */ euc(ett ett, byte b) {
        this(ett);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.a.q().k.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    String str = "auto";
                    if (bundle == null) {
                        Bundle a2 = this.a.o().a(data);
                        this.a.o();
                        String str2 = ewd.a(intent) ? "gs" : str;
                        if (a2 != null) {
                            this.a.a(str2, "_cmp", a2);
                        }
                    }
                    String queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                            this.a.q().j.a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.a.q().j.a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.a.a(str, "_ldl", (Object) queryParameter, true);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.a.q().c.a("Throwable caught in onActivityCreated", e);
        }
        eug h = this.a.h();
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                h.d.put(activity, new euf(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.h().d.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        eug h = this.a.h();
        euf a2 = h.a(activity);
        h.c = h.b;
        h.b = null;
        h.p().a((Runnable) new eui(h, a2));
        evh j = this.a.j();
        j.p().a((Runnable) new evn(j, j.l().b()));
    }

    public final void onActivityResumed(Activity activity) {
        eug h = this.a.h();
        h.a(activity, h.a(activity), false);
        eqw d = h.d();
        d.p().a((Runnable) new etu(d, d.l().b()));
        evh j = this.a.j();
        j.p().a((Runnable) new evm(j, j.l().b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        eug h = this.a.h();
        if (bundle != null) {
            euf euf = (euf) h.d.get(activity);
            if (euf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", euf.c);
                bundle2.putString("name", euf.a);
                bundle2.putString("referrer_name", euf.b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
