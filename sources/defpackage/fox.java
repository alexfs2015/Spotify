package defpackage;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.spotify.messages.BackgroundRestricted;

/* renamed from: fox reason: default package */
public final class fox {
    private final ActivityManager a;
    private final fpc b;
    private final foz c;

    public fox(ActivityManager activityManager, fpc fpc, foz foz) {
        this.a = activityManager;
        this.b = fpc;
        this.c = foz;
    }

    public final void a() {
        if (VERSION.SDK_INT >= 28) {
            if (this.a.isBackgroundRestricted()) {
                fpc fpc = this.b;
                fpc.a.a(BackgroundRestricted.k().a("Android background restriction enabled").g());
                foz foz = this.c;
                if (foz.a.a()) {
                    foz.a.b();
                    foz.a();
                }
                return;
            }
            this.c.a.c();
        }
    }
}
