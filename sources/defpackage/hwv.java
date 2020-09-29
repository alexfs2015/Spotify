package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.InAppBrowserLogEvent;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hwv reason: default package */
public final class hwv {
    final WeakReference<Activity> a;
    final Uri b;
    final jjf c;
    final jrp d;
    Handler e;
    private final fpg f;
    private final dc g = new dc() {
        public final void a(int i, Bundle bundle) {
            ab abVar;
            super.a(i, bundle);
            long a2 = hwv.this.d.a();
            if (i == 2) {
                abVar = new ab(a2, "android", InAppBrowserLogEvent.PAGE_LOADED.a(), "");
            } else if (i == 3) {
                abVar = new ab(a2, "android", InAppBrowserLogEvent.ERROR.a(), "");
            } else if (i == 5) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("browserType", "customTabs");
                } catch (JSONException e) {
                    Logger.e(e, "Unable to create json data", new Object[0]);
                }
                ab abVar2 = new ab(a2, "android", InAppBrowserLogEvent.OPENED.a(), jSONObject.toString());
                abVar = abVar2;
            } else if (i != 6) {
                abVar = null;
            } else {
                abVar = new ab(a2, "android", InAppBrowserLogEvent.CLOSED.a(), "");
            }
            if (abVar != null) {
                hwv.this.c.a(abVar);
            }
            Logger.b("[AdBrowser] CustomTabsCallBack: %d", Integer.valueOf(i));
        }
    };

    public hwv(Activity activity, fpg fpg, Uri uri, jjf jjf, jrp jrp) {
        this.a = new WeakReference<>(activity);
        this.f = fpg;
        this.b = uri;
        this.c = jjf;
        this.d = jrp;
    }

    public final void a() {
        Activity activity = (Activity) this.a.get();
        int c2 = fr.c(activity, R.color.webview_toolbar_color);
        this.f.a((fpf) new fpo(true));
        this.f.a((fpf) new fpp(c2));
        this.f.a.b = this.g;
        this.f.a(this.b);
        this.e.postDelayed(new $$Lambda$hwv$I3dRSMcnxLuOw0BXHwE466nrraY(this, activity), 500);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        this.f.a(activity, this.b);
    }
}
