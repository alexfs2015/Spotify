package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;

@cey
/* renamed from: cur reason: default package */
public class cur extends cuo {
    private boolean a;
    private boolean e;

    public cur(cud cud) {
        super(cud);
        bjl.i().e();
    }

    private final synchronized void a() {
        if (!this.e) {
            this.e = true;
            bjl.i().f();
        }
    }

    public final synchronized boolean D() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void O() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    public void f(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!D()) {
                    f(true);
                }
                a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!D()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!D()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!D()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !D() && super.onTouchEvent(motionEvent);
    }

    public void stopLoading() {
        if (!D()) {
            super.stopLoading();
        }
    }

    public synchronized void destroy() {
        if (!this.a) {
            this.a = true;
            f(false);
            clu.a();
            clu.a();
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e2) {
                bjl.i().a((Throwable) e2, "AdWebViewImpl.loadUrlUnsafe");
                clu.b("#007 Could not call remote method.", e2);
            }
        }
    }

    public final synchronized void a(cuq cuq) {
        if (D()) {
            clu.a();
            E();
            return;
        }
        super.a(cuq);
    }

    public final synchronized void E() {
        clu.a();
        a();
        cpx.a.execute(new cus(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.D()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0013
            r2 = 5
            defpackage.cow.a(r2)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0011
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0018 }
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cur.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!D()) {
            super.loadUrl(str);
        } else {
            cow.a(5);
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!D()) {
            super.loadData(str, str2, str3);
        } else {
            cow.a(5);
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!D()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            cow.a(5);
        }
    }
}
