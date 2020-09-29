package defpackage;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.spotify.messages.BackgroundRestricted;

/* renamed from: fpr reason: default package */
public final class fpr {
    private final ActivityManager a;
    private final fpw b;
    private final fpt c;

    public fpr(ActivityManager activityManager, fpw fpw, fpt fpt) {
        this.a = activityManager;
        this.b = fpw;
        this.c = fpt;
    }

    public final void a() {
        if (VERSION.SDK_INT >= 28) {
            if (this.a.isBackgroundRestricted()) {
                fpw fpw = this.b;
                fpw.a.a(BackgroundRestricted.k().a("Android background restriction enabled").g());
                fpt fpt = this.c;
                if (fpt.a.a()) {
                    fpt.a.b();
                    fpt.a();
                }
                return;
            }
            this.c.a.c();
        }
    }
}
