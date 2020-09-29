package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

@cey
/* renamed from: dly reason: default package */
public final class dly extends Thread {
    boolean a = false;
    boolean b = false;
    final Object c;
    final dlt d;
    final cew e;
    final int f;
    final int g;
    final int h;
    final int i;
    final int j;
    final int k;
    final int l;
    final String m;
    final boolean n;
    private boolean o = false;
    private final int p;

    public dly(dlt dlt, cew cew) {
        this.d = dlt;
        this.e = cew;
        this.c = new Object();
        this.f = ((Integer) dpn.f().a(dsp.R)).intValue();
        this.g = ((Integer) dpn.f().a(dsp.S)).intValue();
        this.h = ((Integer) dpn.f().a(dsp.T)).intValue();
        this.i = ((Integer) dpn.f().a(dsp.U)).intValue();
        this.j = ((Integer) dpn.f().a(dsp.X)).intValue();
        this.k = ((Integer) dpn.f().a(dsp.Z)).intValue();
        this.l = ((Integer) dpn.f().a(dsp.aa)).intValue();
        this.p = ((Integer) dpn.f().a(dsp.V)).intValue();
        this.m = (String) dpn.f().a(dsp.ac);
        this.n = ((Boolean) dpn.f().a(dsp.ae)).booleanValue();
        setName("ContentFetchTask");
    }

    private static boolean a() {
        boolean z = false;
        try {
            Context b2 = bjl.h().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                            if (Process.myPid() == runningAppProcessInfo.pid) {
                                if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
            return z;
        } catch (Throwable th) {
            bjl.i().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final dmc a(View view, dls dls) {
        boolean z;
        if (view == null) {
            return new dmc(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new dmc(0, 0);
            }
            dls.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new dmc(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof csr)) {
            dls.b();
            WebView webView = (WebView) view;
            if (!bzo.e()) {
                z = false;
            } else {
                dls.b();
                webView.post(new dma(this, dls, webView, globalVisibleRect));
                z = true;
            }
            return z ? new dmc(0, 1) : new dmc(0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new dmc(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                dmc a2 = a(viewGroup.getChildAt(i4), dls);
                i2 += a2.a;
                i3 += a2.b;
            }
            return new dmc(i2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        defpackage.clu.a("Error in ContentFetchTask", r1);
        r5.e.a(r1, "ContentFetchTask.run");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        defpackage.clu.a("Error in ContentFetchTask", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[ExcHandler: InterruptedException (r1v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[LOOP:1: B:30:0x007c->B:41:0x007c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 3
            boolean r1 = a()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            if (r1 == 0) goto L_0x0056
            dlu r1 = defpackage.bjl.h()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            android.app.Activity r1 = r1.a()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            if (r1 != 0) goto L_0x0018
            defpackage.cow.a(r0)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            r5.b()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            goto L_0x005c
        L_0x0018:
            if (r1 == 0) goto L_0x005c
            r2 = 0
            android.view.Window r3 = r1.getWindow()     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            if (r3 == 0) goto L_0x0049
            android.view.Window r3 = r1.getWindow()     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            android.view.View r3 = r3.getDecorView()     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            if (r3 == 0) goto L_0x0049
            android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x003c, InterruptedException -> 0x0073 }
            r2 = r1
            goto L_0x0049
        L_0x003c:
            r1 = move-exception
            cle r3 = defpackage.bjl.i()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            java.lang.String r4 = "ContentFetchTask.extractContent"
            r3.a(r1, r4)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            defpackage.cow.a(r0)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
        L_0x0049:
            if (r2 == 0) goto L_0x005c
            if (r2 == 0) goto L_0x005c
            dlz r1 = new dlz     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            r1.<init>(r5, r2)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            r2.post(r1)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            goto L_0x005c
        L_0x0056:
            defpackage.cow.a(r0)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            r5.b()     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
        L_0x005c:
            int r1 = r5.p     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            int r1 = r1 * 1000
            long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0073, Exception -> 0x0065 }
            goto L_0x0079
        L_0x0065:
            r1 = move-exception
            java.lang.String r2 = "Error in ContentFetchTask"
            defpackage.clu.a(r2, r1)
            cew r2 = r5.e
            java.lang.String r3 = "ContentFetchTask.run"
            r2.a(r1, r3)
            goto L_0x0079
        L_0x0073:
            r1 = move-exception
            java.lang.String r2 = "Error in ContentFetchTask"
            defpackage.clu.a(r2, r1)
        L_0x0079:
            java.lang.Object r1 = r5.c
            monitor-enter(r1)
        L_0x007c:
            boolean r2 = r5.b     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0089
            defpackage.cow.a(r0)     // Catch:{ InterruptedException -> 0x007c }
            java.lang.Object r2 = r5.c     // Catch:{ InterruptedException -> 0x007c }
            r2.wait()     // Catch:{ InterruptedException -> 0x007c }
            goto L_0x007c
        L_0x0089:
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            goto L_0x0000
        L_0x008c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008f:
            throw r0
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dly.run():void");
    }

    private final void b() {
        synchronized (this.c) {
            this.b = true;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            sb.toString();
            cow.a(3);
        }
    }
}
