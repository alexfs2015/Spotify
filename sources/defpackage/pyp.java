package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;

/* renamed from: pyp reason: default package */
public final class pyp extends jyr {
    private final SpSharedPreferences<Object> a;
    private final b<pzd, pzb> b;

    public pyp(SpSharedPreferences<Object> spSharedPreferences, pyr pyr) {
        this.a = spSharedPreferences;
        this.b = knc.a(pyr.a(), pzd.a, knm.a());
    }

    private static ViewGroup a(Activity activity) {
        return (ViewGroup) activity.findViewById(R.id.preview_container);
    }

    private boolean a() {
        return this.a.a(qbb.j, false);
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

    public final void onActivityResumed(Activity activity) {
        Logger.b("Resumed: %s", activity);
        if (a()) {
            ViewGroup a2 = a(activity);
            if (a2 != null && a2.findViewById(R.id.preview_tool) == null) {
                pzf pzf = new pzf(a2.getContext());
                pzf.setId(R.id.preview_tool);
                a2.addView(pzf);
                this.b.a(pzf);
                this.b.c();
            }
        }
    }
}
