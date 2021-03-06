package defpackage;

import android.os.Debug;
import com.comscore.util.crashreport.CrashReportManager;
import com.github.anrwatchdog.ANRError;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.Random;

/* renamed from: rla reason: default package */
public final class rla implements a {
    private final Random a;
    private boolean b;

    public rla(Random random) {
        this.a = random;
    }

    public final void a(ANRError aNRError) {
        if (!Debug.isDebuggerConnected()) {
            boolean z = false;
            if (!this.b) {
                Logger.d("ANR detected", new Object[0]);
                if (((double) this.a.nextFloat()) < 0.15d) {
                    z = true;
                }
                if (z) {
                    Assertion.a((Throwable) aNRError);
                }
            } else {
                Logger.e(aNRError, "ANR detected, but listener was muzzled", new Object[0]);
                c();
            }
        }
        b();
    }

    public final synchronized void a() {
        this.b = true;
        Logger.a("ANR listener has been muzzled", new Object[0]);
    }

    public final synchronized void b() {
        this.b = false;
        Logger.a("ANR listener has been unmuzzled", new Object[0]);
    }

    public final void c() {
        apg apg = new apg(CrashReportManager.TIME_WINDOW);
        apg.a = this;
        apg.start();
        Logger.a("ANR listener has been started with a timeout of %d", Integer.valueOf(CrashReportManager.TIME_WINDOW));
    }
}
