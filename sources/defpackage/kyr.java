package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: kyr reason: default package */
final class kyr implements kyt {
    private final Context a;
    private final hfx b;
    private final Random c;

    kyr(Application application, hfx hfx, Random random) {
        this.a = application;
        this.b = hfx;
        this.c = random;
    }

    public final void a() {
        boolean z;
        Context context = this.a;
        Intent a2 = this.b.a(context, "com.spotify.mobile.android.service.action.START_SERVICE");
        $$Lambda$kyr$v7vvA6Geh9v9VGa6yWFrPDef5M r2 = new $$Lambda$kyr$v7vvA6Geh9v9VGa6yWFrPDef5M(this);
        if (VERSION.SDK_INT < 26) {
            context.startService(a2);
            return;
        }
        List runningAppProcesses = ((ActivityManager) context.getSystemService(ActivityManager.class)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((RunningAppProcessInfo) it.next()).importance <= 100) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            context.startService(a2);
        } else {
            r2.onFailure();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (((double) this.c.nextFloat()) < 0.01d) {
            Assertion.c("Unable to start service, see https://issuetracker.google.com/issues/113122354");
        }
    }
}
