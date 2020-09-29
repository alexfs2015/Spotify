package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: div reason: default package */
public final class div implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final Handler c = new Handler(Looper.getMainLooper());
    WeakReference<View> a;
    long b = -3;
    private final Context d;
    private Application e;
    private final PowerManager f;
    private final KeyguardManager g;
    private final dil h;
    private BroadcastReceiver i;
    private WeakReference<ViewTreeObserver> j;
    private dia k;
    private boolean l = false;
    private int m = -1;

    public div(dil dil, View view) {
        this.h = dil;
        this.d = dil.a;
        this.f = (PowerManager) this.d.getSystemService("power");
        this.g = (KeyguardManager) this.d.getSystemService("keyguard");
        Context context = this.d;
        if (context instanceof Application) {
            this.e = (Application) context;
            this.k = new dia((Application) context, this);
        }
        a(view);
    }

    private final void a() {
        c.post(new diw(this));
    }

    private final void a(Activity activity, int i2) {
        if (this.a != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.a.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.m = i2;
                }
            }
        }
    }

    private final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.j = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.i == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.i = new dix(this);
            this.d.registerReceiver(this.i, intentFilter);
        }
        Application application = this.e;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.k);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.j     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.j     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.j = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002e }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x002f
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002e }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.content.BroadcastReceiver r4 = r3.i
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r3.d     // Catch:{ Exception -> 0x0038 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.i = r0
        L_0x003a:
            android.app.Application r4 = r3.e
            if (r4 == 0) goto L_0x0043
            dia r0 = r3.k     // Catch:{ Exception -> 0x0043 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.div.c(android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view) {
        long j2;
        WeakReference<View> weakReference = this.a;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            c(view2);
        }
        this.a = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.b = j2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        b();
    }

    public final void onActivityDestroyed(Activity activity) {
        b();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        b();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        b();
        a();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        b();
    }

    public final void onActivityStopped(Activity activity) {
        b();
    }

    public final void onGlobalLayout() {
        b();
    }

    public final void onScrollChanged() {
        b();
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        b(view);
        b();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        b();
        a();
        c(view);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r4 == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            r2 = -3
            r9.b = r2
            r9.l = r1
            return
        L_0x0015:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            dil r4 = r9.h
            boolean r4 = r4.l
            r5 = 1
            if (r4 != 0) goto L_0x0059
            android.app.KeyguardManager r4 = r9.g
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x0057
            android.app.Activity r4 = defpackage.dit.a(r0)
            if (r4 == 0) goto L_0x0053
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0044
            r4 = 0
            goto L_0x0048
        L_0x0044:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x0048:
            if (r4 == 0) goto L_0x0053
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r4 = 0
            goto L_0x005a
        L_0x0059:
            r4 = 1
        L_0x005a:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.m
            r8 = -1
            if (r7 == r8) goto L_0x0064
            r6 = r7
        L_0x0064:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0081
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0081
            android.os.PowerManager r0 = r9.f
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0081
            if (r4 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x0081
            if (r2 == 0) goto L_0x0081
            if (r6 != 0) goto L_0x0081
            r1 = 1
        L_0x0081:
            boolean r0 = r9.l
            if (r0 == r1) goto L_0x0092
            if (r1 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x008e
        L_0x008c:
            r2 = -2
        L_0x008e:
            r9.b = r2
            r9.l = r1
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.div.b():void");
    }
}
