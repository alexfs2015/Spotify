package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;

/* renamed from: ppt reason: default package */
public final class ppt extends jwp {
    private final SpSharedPreferences<Object> a;
    private final b<pqh, pqf> b;

    public ppt(SpSharedPreferences<Object> spSharedPreferences, ppv ppv) {
        this.a = spSharedPreferences;
        this.b = kjt.a(ppv.a(), pqh.a, kkd.a());
    }

    private boolean a() {
        return this.a.a(psf.j, false);
    }

    private static ViewGroup a(Activity activity) {
        return (ViewGroup) activity.findViewById(R.id.preview_container);
    }

    public final void onActivityResumed(Activity activity) {
        Logger.b("Resumed: %s", activity);
        if (a()) {
            ViewGroup a2 = a(activity);
            if (a2 != null && a2.findViewById(R.id.preview_tool) == null) {
                pqj pqj = new pqj(a2.getContext());
                pqj.setId(R.id.preview_tool);
                a2.addView(pqj);
                this.b.a(pqj);
                this.b.c();
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        Logger.b("Paused: %s", activity);
        if (a()) {
            ViewGroup a2 = a(activity);
            if (a2 != null) {
                a2.removeAllViews();
                if (this.b.a()) {
                    this.b.d();
                    this.b.b();
                }
            }
        }
    }
}
