package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

@cey
/* renamed from: dld reason: default package */
public final class dld implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final long a = ((Long) dpn.f().a(dsp.bl)).longValue();
    private final Context b;
    private Application c;
    private final WindowManager d;
    private final PowerManager e;
    private final KeyguardManager f;
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private dli j;
    private cob k = new cob(a);
    private boolean l = false;
    private int m = -1;
    private final HashSet<dlh> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public dld(Context context, View view) {
        this.b = context.getApplicationContext();
        this.d = (WindowManager) context.getSystemService("window");
        this.e = (PowerManager) this.b.getSystemService("power");
        this.f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.b;
        if (context2 instanceof Application) {
            this.c = (Application) context2;
            this.j = new dli((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        this.p = new Rect();
        this.p.right = this.d.getDefaultDisplay().getWidth();
        this.p.bottom = this.d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (bjl.g().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    private final void a() {
        bjl.e();
        cmd.a.post(new dle(this));
    }

    private final void a(Activity activity, int i2) {
        if (this.i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.m = i2;
                }
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.g = new dlf(this);
            bjl.E().a(this.b, this.g, intentFilter);
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                clu.a("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b(View view) {
        try {
            if (this.h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception e2) {
            clu.a("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            clu.a("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.g != null) {
            try {
                bjl.E().a(this.b, this.g);
            } catch (IllegalStateException e4) {
                clu.a("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                bjl.i().a((Throwable) e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.g = null;
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                clu.a("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0114 A[LOOP:0: B:56:0x010e->B:58:0x0114, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            java.util.HashSet<dlh> r0 = r1.n
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.i
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r4 = 1
            r5 = 0
            if (r2 != r4) goto L_0x001f
            r6 = 1
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r0 = 2
            int[] r12 = new int[r0]
            int[] r0 = new int[r0]
            if (r3 == 0) goto L_0x0077
            boolean r13 = r3.getGlobalVisibleRect(r9)
            boolean r14 = r3.getLocalVisibleRect(r10)
            r3.getHitRect(r11)
            r3.getLocationOnScreen(r12)     // Catch:{ Exception -> 0x0052 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r0 = move-exception
            java.lang.String r15 = "Failure getting view location."
            defpackage.clu.a(r15, r0)
        L_0x0058:
            r0 = r12[r5]
            r8.left = r0
            r0 = r12[r4]
            r8.top = r0
            int r0 = r8.left
            int r12 = r3.getWidth()
            int r0 = r0 + r12
            r8.right = r0
            int r0 = r8.top
            int r12 = r3.getHeight()
            int r0 = r0 + r12
            r8.bottom = r0
            r24 = r13
            r26 = r14
            goto L_0x007b
        L_0x0077:
            r24 = 0
            r26 = 0
        L_0x007b:
            r0 = 8
            if (r3 == 0) goto L_0x0084
            int r12 = r3.getWindowVisibility()
            goto L_0x0086
        L_0x0084:
            r12 = 8
        L_0x0086:
            int r13 = r1.m
            r14 = -1
            if (r13 == r14) goto L_0x008c
            r12 = r13
        L_0x008c:
            if (r7 != 0) goto L_0x00a3
            defpackage.bjl.e()
            android.os.PowerManager r7 = r1.e
            android.app.KeyguardManager r13 = r1.f
            boolean r7 = defpackage.cmd.a(r3, r7, r13)
            if (r7 == 0) goto L_0x00a3
            if (r24 == 0) goto L_0x00a3
            if (r26 == 0) goto L_0x00a3
            if (r12 != 0) goto L_0x00a3
            r7 = 1
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x00b3
            cob r6 = r1.k
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x00b3
            boolean r6 = r1.l
            if (r7 != r6) goto L_0x00b3
            return
        L_0x00b3:
            if (r7 != 0) goto L_0x00bc
            boolean r6 = r1.l
            if (r6 != 0) goto L_0x00bc
            if (r2 != r4) goto L_0x00bc
            return
        L_0x00bc:
            dlg r2 = new dlg
            bzg r4 = defpackage.bjl.l()
            long r16 = r4.b()
            android.os.PowerManager r4 = r1.e
            boolean r18 = r4.isScreenOn()
            if (r3 == 0) goto L_0x00d9
            cmj r4 = defpackage.bjl.g()
            boolean r5 = r4.a(r3)
            r19 = r5
            goto L_0x00db
        L_0x00d9:
            r19 = 0
        L_0x00db:
            if (r3 == 0) goto L_0x00e4
            int r0 = r3.getWindowVisibility()
            r20 = r0
            goto L_0x00e6
        L_0x00e4:
            r20 = 8
        L_0x00e6:
            android.graphics.Rect r0 = r1.p
            android.graphics.Rect r21 = r1.a(r0)
            android.graphics.Rect r22 = r1.a(r8)
            android.graphics.Rect r23 = r1.a(r9)
            android.graphics.Rect r25 = r1.a(r10)
            android.graphics.Rect r27 = r1.a(r11)
            android.util.DisplayMetrics r0 = r1.o
            float r0 = r0.density
            r15 = r2
            r28 = r0
            r29 = r7
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.util.HashSet<dlh> r0 = r1.n
            java.util.Iterator r0 = r0.iterator()
        L_0x010e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r0.next()
            dlh r3 = (defpackage.dlh) r3
            r3.a(r2)
            goto L_0x010e
        L_0x011e:
            r1.l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.a(int):void");
    }

    public final void a(dlh dlh) {
        this.n.add(dlh);
        a(3);
    }

    public final void b(dlh dlh) {
        this.n.remove(dlh);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        a();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        a();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        a();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        a();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        a();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        a();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        a();
    }

    public final void onGlobalLayout() {
        a(2);
        a();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        a(3);
        a();
        b(view);
    }
}
