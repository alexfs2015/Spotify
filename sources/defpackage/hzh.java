package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.messages.InAppBrowserEvent.a;
import com.spotify.mobile.android.spotlets.ads.InAppBrowserLogEvent;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hzh reason: default package */
public final class hzh {
    final WeakReference<Activity> a;
    final Uri b;
    final gfk<fli> c;
    final jtz d;
    Handler e;
    private final fqa f;
    private final dc g = new dc() {
        public final void a(int i, Bundle bundle) {
            super.a(i, bundle);
            a b = InAppBrowserEvent.k().a(hzh.this.d.a()).b("");
            if (i == 2) {
                b.a(InAppBrowserLogEvent.PAGE_LOADED.a());
            } else if (i == 3) {
                b.a(InAppBrowserLogEvent.ERROR.a());
            } else if (i == 5) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("browserType", "customTabs");
                } catch (JSONException e) {
                    Logger.e(e, "Unable to create json data", new Object[0]);
                }
                b.a(InAppBrowserLogEvent.OPENED.a()).b(jSONObject.toString());
            } else if (i == 6) {
                b.a(InAppBrowserLogEvent.CLOSED.a());
            }
            if (!TextUtils.isEmpty(b.h())) {
                hzh.this.c.a(b.g());
            }
            Logger.b("[AdBrowser] CustomTabsCallBack: %d", Integer.valueOf(i));
        }
    };

    public hzh(Activity activity, fqa fqa, Uri uri, gfk<fli> gfk, jtz jtz) {
        this.a = new WeakReference<>(activity);
        this.f = fqa;
        this.b = uri;
        this.c = gfk;
        this.d = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        this.f.a(activity, this.b);
    }

    public final void a() {
        Activity activity = (Activity) this.a.get();
        int c2 = fr.c(activity, R.color.webview_toolbar_color);
        this.f.a((fpz) new fqi(true));
        this.f.a((fpz) new fqj(c2));
        this.f.a.b = this.g;
        this.f.a(this.b);
        this.e.postDelayed(new $$Lambda$hzh$8c9Gk_5sW1Gjvy_rRUy38nPd4SU(this, activity), 500);
    }
}
