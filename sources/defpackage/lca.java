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

/* renamed from: lca reason: default package */
final class lca implements lcc {
    private final Context a;
    private final hit b;
    private final Random c;

    lca(Application application, hit hit, Random random) {
        this.a = application;
        this.b = hit;
        this.c = random;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (((double) this.c.nextFloat()) < 0.01d) {
            Assertion.c("Unable to start service, see https://issuetracker.google.com/issues/113122354");
        }
    }

    public final void a() {
        boolean z;
        Context context = this.a;
        Intent a2 = this.b.a(context, "com.spotify.mobile.android.service.action.START_SERVICE");
        $$Lambda$lca$iv7TNA_5AST31ivGB3wpwh9quIc r2 = new $$Lambda$lca$iv7TNA_5AST31ivGB3wpwh9quIc(this);
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
}
