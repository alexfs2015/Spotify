package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.Lifecycle.State;
import com.spotify.music.R;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: t reason: default package */
final class t extends s implements Factory2, defpackage.ax.a {
    private static final Map<Class<?>, Integer> q = new dp();
    private static final boolean r = (VERSION.SDK_INT < 21);
    private static final int[] s = {16842836};
    private static boolean t = true;
    private static final boolean u;
    private by A;
    private a B;
    private i C;
    private boolean D;
    private ViewGroup E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private h[] O;
    private h P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private e Y;
    private e Z;
    private final Runnable aa;
    private boolean ab;
    private Rect ac;
    private Rect ad;
    private AppCompatViewInflater ae;
    final Context d;
    Window e;
    final r f;
    aj g;
    ActionBarContextView h;
    PopupWindow i;
    Runnable j;
    is k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    int p;
    private Object v;
    private c w;
    private ActionBar x;
    private MenuInflater y;
    private CharSequence z;

    /* renamed from: t$a */
    final class a implements defpackage.bd.a {
        a() {
        }

        public final void a(ax axVar, boolean z) {
            t.this.b(axVar);
        }

        public final boolean a(ax axVar) {
            Callback callback = t.this.e.getCallback();
            if (callback != null) {
                callback.onMenuOpened(108, axVar);
            }
            return true;
        }
    }

    /* renamed from: t$b */
    class b implements defpackage.aj.a {
        private defpackage.aj.a b;

        public b(defpackage.aj.a aVar) {
            this.b = aVar;
        }

        public final void a(aj ajVar) {
            this.b.a(ajVar);
            if (t.this.i != null) {
                t.this.e.getDecorView().removeCallbacks(t.this.j);
            }
            if (t.this.h != null) {
                t.this.o();
                t tVar = t.this;
                tVar.k = ip.n(tVar.h).a(0.0f);
                t.this.k.a((it) new iu() {
                    public final void b(View view) {
                        t.this.h.setVisibility(8);
                        if (t.this.i != null) {
                            t.this.i.dismiss();
                        } else if (t.this.h.getParent() instanceof View) {
                            ip.s((View) t.this.h.getParent());
                        }
                        t.this.h.removeAllViews();
                        t.this.k.a((it) null);
                        t.this.k = null;
                    }
                });
            }
            t.this.g = null;
        }

        public final boolean a(aj ajVar, Menu menu) {
            return this.b.a(ajVar, menu);
        }

        public final boolean a(aj ajVar, MenuItem menuItem) {
            return this.b.a(ajVar, menuItem);
        }

        public final boolean b(aj ajVar, Menu menu) {
            return this.b.b(ajVar, menu);
        }
    }

    /* renamed from: t$c */
    class c extends aq {
        c(Callback callback) {
            super(callback);
        }

        private ActionMode a(ActionMode.Callback callback) {
            defpackage.an.a aVar = new defpackage.an.a(t.this.d, callback);
            aj a = t.this.a((defpackage.aj.a) aVar);
            if (a != null) {
                return aVar.b(a);
            }
            return null;
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return t.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || t.this.a(keyEvent.getKeyCode(), keyEvent);
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof ax)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            t tVar = t.this;
            if (i == 108) {
                ActionBar a = tVar.a();
                if (a != null) {
                    a.f(true);
                }
            }
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            t.this.e(i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            ax axVar = menu instanceof ax ? (ax) menu : null;
            if (i == 0 && axVar == null) {
                return false;
            }
            if (axVar != null) {
                axVar.j = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (axVar != null) {
                axVar.j = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            h g = t.this.g(0);
            if (g == null || g.h == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, g.h, i);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            return t.this.l ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!t.this.l || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    /* renamed from: t$d */
    class d extends e {
        private final PowerManager a;

        d(Context context) {
            super();
            this.a = (PowerManager) context.getSystemService("power");
        }

        public final int a() {
            return (VERSION.SDK_INT < 21 || !this.a.isPowerSaveMode()) ? 1 : 2;
        }

        public final void b() {
            t.this.a(true);
        }

        /* access modifiers changed from: 0000 */
        public final IntentFilter c() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    /* renamed from: t$e */
    abstract class e {
        private BroadcastReceiver a;

        e() {
        }

        /* access modifiers changed from: 0000 */
        public abstract int a();

        /* access modifiers changed from: 0000 */
        public abstract void b();

        /* access modifiers changed from: 0000 */
        public abstract IntentFilter c();

        /* access modifiers changed from: 0000 */
        public final void d() {
            e();
            IntentFilter c = c();
            if (c != null && c.countActions() != 0) {
                if (this.a == null) {
                    this.a = new BroadcastReceiver() {
                        public final void onReceive(Context context, Intent intent) {
                            e.this.b();
                        }
                    };
                }
                t.this.d.registerReceiver(this.a, c);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            if (this.a != null) {
                try {
                    t.this.d.unregisterReceiver(this.a);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }
    }

    /* renamed from: t$f */
    class f extends e {
        private final z a;

        f(z zVar) {
            super();
            this.a = zVar;
        }

        public final int a() {
            long j;
            z zVar = this.a;
            a aVar = zVar.b;
            boolean z = false;
            if (zVar.b.f > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Location location = null;
                Location a2 = fs.a(zVar.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? zVar.a("network") : null;
                if (fs.a(zVar.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = zVar.a("gps");
                }
                if (location == null || a2 == null ? location != null : location.getTime() > a2.getTime()) {
                    a2 = location;
                }
                if (a2 != null) {
                    a aVar2 = zVar.b;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (y.a == null) {
                        y.a = new y();
                    }
                    y yVar = y.a;
                    y yVar2 = yVar;
                    yVar2.a(currentTimeMillis - 86400000, a2.getLatitude(), a2.getLongitude());
                    long j2 = yVar.b;
                    yVar2.a(currentTimeMillis, a2.getLatitude(), a2.getLongitude());
                    if (yVar.d == 1) {
                        z = true;
                    }
                    long j3 = yVar.c;
                    long j4 = yVar.b;
                    a aVar3 = aVar;
                    long j5 = j3;
                    yVar.a(currentTimeMillis + 86400000, a2.getLatitude(), a2.getLongitude());
                    long j6 = yVar.c;
                    long j7 = j4;
                    if (j5 == -1 || j7 == -1) {
                        j = 43200000 + currentTimeMillis;
                    } else {
                        long j8 = currentTimeMillis > j7 ? 0 + j6 : currentTimeMillis > j5 ? 0 + j7 : 0 + j5;
                        j = j8 + 60000;
                    }
                    aVar2.a = z;
                    aVar2.b = j2;
                    aVar2.c = j5;
                    aVar2.d = j7;
                    aVar2.e = j6;
                    aVar2.f = j;
                    z = aVar3.a;
                } else {
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        public final void b() {
            t.this.a(true);
        }

        /* access modifiers changed from: 0000 */
        public final IntentFilter c() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    /* renamed from: t$g */
    class g extends ContentFrameLayout {
        public g(Context context) {
            super(context);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return t.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    t.this.f(0);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(ab.b(getContext(), i));
        }
    }

    /* renamed from: t$h */
    public static final class h {
        int a;
        int b;
        int c;
        int d;
        ViewGroup e;
        View f;
        View g;
        ax h;
        Context i;
        boolean j;
        boolean k;
        boolean l;
        public boolean m;
        boolean n = false;
        boolean o;
        Bundle p;
        private av q;

        h(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: 0000 */
        public final be a(defpackage.bd.a aVar) {
            if (this.h == null) {
                return null;
            }
            if (this.q == null) {
                this.q = new av(this.i, (int) R.layout.abc_list_menu_item_layout);
                av avVar = this.q;
                avVar.d = aVar;
                this.h.a((bd) avVar);
            }
            return this.q.a(this.e);
        }

        /* access modifiers changed from: 0000 */
        public final void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(com.moat.analytics.mobile.R.style.Theme_AppCompat_CompactMenu, true);
            }
            al alVar = new al(context, 0);
            alVar.getTheme().setTo(newTheme);
            this.i = alVar;
            TypedArray obtainStyledAttributes = alVar.obtainStyledAttributes(defpackage.o.a.ax);
            this.b = obtainStyledAttributes.getResourceId(defpackage.o.a.aA, 0);
            this.d = obtainStyledAttributes.getResourceId(defpackage.o.a.az, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        public final void a(ax axVar) {
            ax axVar2 = this.h;
            if (axVar != axVar2) {
                if (axVar2 != null) {
                    axVar2.b((bd) this.q);
                }
                this.h = axVar;
                if (axVar != null) {
                    av avVar = this.q;
                    if (avVar != null) {
                        axVar.a((bd) avVar);
                    }
                }
            }
        }

        public final boolean a() {
            if (this.f == null) {
                return false;
            }
            return this.g != null || this.q.c().getCount() > 0;
        }
    }

    /* renamed from: t$i */
    final class i implements defpackage.bd.a {
        i() {
        }

        public final void a(ax axVar, boolean z) {
            ax l = axVar.l();
            boolean z2 = l != axVar;
            t tVar = t.this;
            if (z2) {
                axVar = l;
            }
            h a2 = tVar.a((Menu) axVar);
            if (a2 != null) {
                if (z2) {
                    t.this.a(a2.a, a2, l);
                    t.this.a(a2, true);
                    return;
                }
                t.this.a(a2, z);
            }
        }

        public final boolean a(ax axVar) {
            if (axVar == null && t.this.m) {
                Callback callback = t.this.e.getCallback();
                if (callback != null && !t.this.n) {
                    callback.onMenuOpened(108, axVar);
                }
            }
            return true;
        }
    }

    static {
        boolean z2 = false;
        if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT <= 25) {
            z2 = true;
        }
        u = z2;
        if (r && !t) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    boolean z = false;
                    if (th instanceof NotFoundException) {
                        String message = th.getMessage();
                        if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                            z = true;
                        }
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    t(Activity activity, r rVar) {
        this(activity, null, rVar, activity);
    }

    t(Dialog dialog, r rVar) {
        this(dialog.getContext(), dialog.getWindow(), rVar, dialog);
    }

    private t(Context context, Window window, r rVar, Object obj) {
        q qVar = null;
        this.k = null;
        this.l = true;
        this.U = -100;
        this.aa = new Runnable() {
            public final void run() {
                if ((t.this.p & 1) != 0) {
                    t.this.h(0);
                }
                if ((t.this.p & 4096) != 0) {
                    t.this.h(108);
                }
                t tVar = t.this;
                tVar.o = false;
                tVar.p = 0;
            }
        };
        this.d = context;
        this.f = rVar;
        this.v = obj;
        if (this.U == -100 && (this.v instanceof Dialog)) {
            Context context2 = this.d;
            while (true) {
                if (context2 != null) {
                    if (!(context2 instanceof q)) {
                        if (!(context2 instanceof ContextWrapper)) {
                            break;
                        }
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        qVar = (q) context2;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (qVar != null) {
                this.U = qVar.g().m();
            }
        }
        if (this.U == -100) {
            Integer num = (Integer) q.get(this.v.getClass());
            if (num != null) {
                this.U = num.intValue();
                q.remove(this.v.getClass());
            }
        }
        if (window != null) {
            a(window);
        }
        bq.a();
    }

    private e A() {
        if (this.Y == null) {
            this.Y = new f(z.a(this.d));
        }
        return this.Y;
    }

    private e B() {
        if (this.Z == null) {
            this.Z = new d(this.d);
        }
        return this.Z;
    }

    private boolean C() {
        if (!this.X && (this.v instanceof Activity)) {
            PackageManager packageManager = this.d.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.d, this.v.getClass()), 0);
                this.W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (NameNotFoundException unused) {
                this.W = false;
            }
        }
        this.X = true;
        return this.W;
    }

    private View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.ae == null) {
            String string = this.d.obtainStyledAttributes(defpackage.o.a.ax).getString(defpackage.o.a.aB);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.ae = new AppCompatViewInflater();
            } else {
                try {
                    this.ae = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.ae = new AppCompatViewInflater();
                }
            }
        }
        if (r) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.ae.createView(view, str, context, attributeSet, z2, r, true, cu.a());
    }

    private void a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.e == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof c)) {
                this.w = new c(callback);
                window.setCallback(this.w);
                cp a2 = cp.a(this.d, (AttributeSet) null, s);
                Drawable b2 = a2.b(0);
                if (b2 != null) {
                    window.setBackgroundDrawable(b2);
                }
                a2.a.recycle();
                this.e = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    private void a(h hVar, KeyEvent keyEvent) {
        int i2;
        if (!hVar.l && !this.n) {
            if (hVar.a == 0) {
                if ((this.d.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback callback = this.e.getCallback();
            if (callback == null || callback.onMenuOpened(hVar.a, hVar.h)) {
                WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
                if (windowManager != null && b(hVar, keyEvent)) {
                    if (hVar.e == null || hVar.n) {
                        if (hVar.e == null) {
                            a(hVar);
                            if (hVar.e == null) {
                                return;
                            }
                        } else if (hVar.n && hVar.e.getChildCount() > 0) {
                            hVar.e.removeAllViews();
                        }
                        if (c(hVar) && hVar.a()) {
                            LayoutParams layoutParams = hVar.f.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            hVar.e.setBackgroundResource(hVar.b);
                            ViewParent parent = hVar.f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(hVar.f);
                            }
                            hVar.e.addView(hVar.f, layoutParams);
                            if (!hVar.f.hasFocus()) {
                                hVar.f.requestFocus();
                            }
                        }
                    } else if (hVar.g != null) {
                        LayoutParams layoutParams2 = hVar.g.getLayoutParams();
                        if (layoutParams2 != null && layoutParams2.width == -1) {
                            i2 = -1;
                            hVar.k = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams3.gravity = hVar.c;
                            layoutParams3.windowAnimations = hVar.d;
                            windowManager.addView(hVar.e, layoutParams3);
                            hVar.l = true;
                        }
                    }
                    i2 = -2;
                    hVar.k = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams32.gravity = hVar.c;
                    layoutParams32.windowAnimations = hVar.d;
                    windowManager.addView(hVar.e, layoutParams32);
                    hVar.l = true;
                }
            } else {
                a(hVar, true);
            }
        }
    }

    private boolean a(int i2, boolean z2) {
        int i3 = this.d.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean C2 = C();
        boolean z3 = false;
        if ((u || i4 != i3) && !C2 && VERSION.SDK_INT >= 17 && !this.R && (this.v instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.v).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.d.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i5 != i4 && z2 && !C2 && this.R && (VERSION.SDK_INT >= 17 || this.S)) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                ez.d((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i5 == i4) {
            return z3;
        }
        Resources resources = this.d.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        if (VERSION.SDK_INT < 26 && VERSION.SDK_INT < 28) {
            if (VERSION.SDK_INT >= 24) {
                w.c(resources);
            } else if (VERSION.SDK_INT >= 23) {
                w.b(resources);
            } else if (VERSION.SDK_INT >= 21) {
                w.a(resources);
            }
        }
        int i6 = this.V;
        if (i6 != 0) {
            this.d.setTheme(i6);
            if (VERSION.SDK_INT >= 23) {
                this.d.getTheme().applyStyle(this.V, true);
            }
        }
        if (!C2) {
            return true;
        }
        Object obj2 = this.v;
        if (!(obj2 instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) obj2;
        if (activity instanceof lm) {
            if (!((lm) activity).Y_().a().a(State.STARTED)) {
                return true;
            }
            activity.onConfigurationChanged(configuration2);
            return true;
        } else if (!this.T) {
            return true;
        } else {
            activity.onConfigurationChanged(configuration2);
            return true;
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.e.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ip.E((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(h hVar) {
        hVar.a(r());
        hVar.e = new g(hVar.i);
        hVar.c = 81;
        return true;
    }

    private boolean a(h hVar, int i2, KeyEvent keyEvent, int i3) {
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((hVar.j || b(hVar, keyEvent)) && hVar.h != null) {
            z2 = hVar.h.performShortcut(i2, keyEvent, 1);
        }
        return z2;
    }

    private boolean b(h hVar) {
        Context context = this.d;
        if ((hVar.a == 0 || hVar.a == 108) && this.A != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context alVar = new al(context, 0);
                alVar.getTheme().setTo(theme2);
                context = alVar;
            }
        }
        ax axVar = new ax(context);
        axVar.a((defpackage.ax.a) this);
        hVar.a(axVar);
        return true;
    }

    private boolean b(h hVar, KeyEvent keyEvent) {
        if (this.n) {
            return false;
        }
        if (hVar.j) {
            return true;
        }
        h hVar2 = this.P;
        if (!(hVar2 == null || hVar2 == hVar)) {
            a(hVar2, false);
        }
        Callback callback = this.e.getCallback();
        if (callback != null) {
            hVar.g = callback.onCreatePanelView(hVar.a);
        }
        boolean z2 = hVar.a == 0 || hVar.a == 108;
        if (z2) {
            by byVar = this.A;
            if (byVar != null) {
                byVar.g();
            }
        }
        if (hVar.g == null && (!z2 || !(this.x instanceof x))) {
            if (hVar.h == null || hVar.o) {
                if (hVar.h == null) {
                    b(hVar);
                    if (hVar.h == null) {
                        return false;
                    }
                }
                if (z2 && this.A != null) {
                    if (this.B == null) {
                        this.B = new a();
                    }
                    this.A.a(hVar.h, this.B);
                }
                hVar.h.e();
                if (!callback.onCreatePanelMenu(hVar.a, hVar.h)) {
                    hVar.a((ax) null);
                    if (z2) {
                        by byVar2 = this.A;
                        if (byVar2 != null) {
                            byVar2.a(null, this.B);
                        }
                    }
                    return false;
                }
                hVar.o = false;
            }
            hVar.h.e();
            if (hVar.p != null) {
                hVar.h.d(hVar.p);
                hVar.p = null;
            }
            if (!callback.onPreparePanel(0, hVar.g, hVar.h)) {
                if (z2) {
                    by byVar3 = this.A;
                    if (byVar3 != null) {
                        byVar3.a(null, this.B);
                    }
                }
                hVar.h.f();
                return false;
            }
            hVar.m = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            hVar.h.setQwertyMode(hVar.m);
            hVar.h.f();
        }
        hVar.j = true;
        hVar.k = false;
        this.P = hVar;
        return true;
    }

    private boolean c(h hVar) {
        if (hVar.g != null) {
            hVar.f = hVar.g;
            return true;
        } else if (hVar.h == null) {
            return false;
        } else {
            if (this.C == null) {
                this.C = new i();
            }
            hVar.f = (View) hVar.a((defpackage.bd.a) this.C);
            return hVar.f != null;
        }
    }

    private void j(int i2) {
        this.p = (1 << i2) | this.p;
        if (!this.o) {
            ip.a(this.e.getDecorView(), this.aa);
            this.o = true;
        }
    }

    private static int k(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            i2 = 109;
        }
        return i2;
    }

    private int l(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        return B().a();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.d.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                i2 = A().a();
            }
        }
        return i2;
    }

    private void q() {
        u();
        if (this.m && this.x == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                this.x = new aa((Activity) obj, this.J);
            } else if (obj instanceof Dialog) {
                this.x = new aa((Dialog) obj);
            }
            ActionBar actionBar = this.x;
            if (actionBar != null) {
                actionBar.d(this.ab);
            }
        }
    }

    private Context r() {
        ActionBar a2 = a();
        Context b2 = a2 != null ? a2.b() : null;
        return b2 == null ? this.d : b2;
    }

    private void s() {
        e eVar = this.Y;
        if (eVar != null) {
            eVar.e();
        }
        e eVar2 = this.Z;
        if (eVar2 != null) {
            eVar2.e();
        }
    }

    private void t() {
        if (this.e == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void u() {
        if (!this.D) {
            this.E = v();
            CharSequence x2 = x();
            if (!TextUtils.isEmpty(x2)) {
                by byVar = this.A;
                if (byVar != null) {
                    byVar.a(x2);
                } else {
                    ActionBar actionBar = this.x;
                    if (actionBar != null) {
                        actionBar.b(x2);
                    } else {
                        TextView textView = this.F;
                        if (textView != null) {
                            textView.setText(x2);
                        }
                    }
                }
            }
            w();
            this.D = true;
            h g2 = g(0);
            if (this.n) {
                return;
            }
            if (g2 == null || g2.h == null) {
                j(108);
            }
        }
    }

    private ViewGroup v() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(defpackage.o.a.ax);
        if (obtainStyledAttributes.hasValue(defpackage.o.a.aC)) {
            if (obtainStyledAttributes.getBoolean(defpackage.o.a.aL, false)) {
                d(1);
            } else if (obtainStyledAttributes.getBoolean(defpackage.o.a.aC, false)) {
                d(108);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.o.a.aD, false)) {
                d(109);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.o.a.aE, false)) {
                d(10);
            }
            this.L = obtainStyledAttributes.getBoolean(defpackage.o.a.ay, false);
            obtainStyledAttributes.recycle();
            t();
            this.e.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.d);
            if (this.M) {
                viewGroup = this.K ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    ip.a((View) viewGroup, (il) new il() {
                        public final iw onApplyWindowInsets(View view, iw iwVar) {
                            int b = iwVar.b();
                            int i = t.this.i(b);
                            if (b != i) {
                                iwVar = iwVar.a(iwVar.a(), i, iwVar.c(), iwVar.d());
                            }
                            return ip.a(view, iwVar);
                        }
                    });
                } else {
                    ((cc) viewGroup).a(new defpackage.cc.a() {
                        public final void a(Rect rect) {
                            rect.top = t.this.i(rect.top);
                        }
                    });
                }
            } else if (this.L) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, null);
                this.J = false;
                this.m = false;
            } else if (this.m) {
                TypedValue typedValue = new TypedValue();
                this.d.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new al(this.d, typedValue.resourceId) : this.d).inflate(R.layout.abc_screen_toolbar, null);
                this.A = (by) viewGroup.findViewById(R.id.decor_content_parent);
                this.A.a(this.e.getCallback());
                if (this.J) {
                    this.A.a(109);
                }
                if (this.H) {
                    this.A.a(2);
                }
                if (this.I) {
                    this.A.a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.A == null) {
                    this.F = (TextView) viewGroup.findViewById(R.id.title);
                }
                cv.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.e.setContentView(viewGroup);
                contentFrameLayout.a = new androidx.appcompat.widget.ContentFrameLayout.a() {
                    public final void a() {
                        t.this.p();
                    }
                };
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.m);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.J);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.L);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.K);
            sb.append(", windowNoTitle: ");
            sb.append(this.M);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.E.findViewById(16908290);
        View decorView = this.e.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(defpackage.o.a.ax);
        obtainStyledAttributes.getValue(defpackage.o.a.aJ, contentFrameLayout.a());
        obtainStyledAttributes.getValue(defpackage.o.a.aK, contentFrameLayout.b());
        if (obtainStyledAttributes.hasValue(defpackage.o.a.aH)) {
            obtainStyledAttributes.getValue(defpackage.o.a.aH, contentFrameLayout.c());
        }
        if (obtainStyledAttributes.hasValue(defpackage.o.a.aI)) {
            obtainStyledAttributes.getValue(defpackage.o.a.aI, contentFrameLayout.d());
        }
        if (obtainStyledAttributes.hasValue(defpackage.o.a.aF)) {
            obtainStyledAttributes.getValue(defpackage.o.a.aF, contentFrameLayout.e());
        }
        if (obtainStyledAttributes.hasValue(defpackage.o.a.aG)) {
            obtainStyledAttributes.getValue(defpackage.o.a.aG, contentFrameLayout.f());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private CharSequence x() {
        Object obj = this.v;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.z;
    }

    private void y() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int z() {
        int i2 = this.U;
        return i2 != -100 ? i2 : s.a;
    }

    public final aj a(defpackage.aj.a aVar) {
        Context context;
        aj ajVar = this.g;
        if (ajVar != null) {
            ajVar.c();
        }
        b bVar = new b(aVar);
        ActionBar a2 = a();
        if (a2 != null) {
            this.g = a2.a((defpackage.aj.a) bVar);
        }
        if (this.g == null) {
            o();
            aj ajVar2 = this.g;
            if (ajVar2 != null) {
                ajVar2.c();
            }
            boolean z2 = true;
            if (this.h == null) {
                if (this.L) {
                    TypedValue typedValue = new TypedValue();
                    Theme theme = this.d.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Theme newTheme = this.d.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new al(this.d, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.d;
                    }
                    this.h = new ActionBarContextView(context);
                    this.i = new PopupWindow(context, null, R.attr.actionModePopupWindowStyle);
                    jl.a(this.i, 2);
                    this.i.setContentView(this.h);
                    this.i.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    this.h.a(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.i.setHeight(-2);
                    this.j = new Runnable() {
                        public final void run() {
                            t.this.i.showAtLocation(t.this.h, 55, 0, 0);
                            t.this.o();
                            if (t.this.n()) {
                                t.this.h.setAlpha(0.0f);
                                t tVar = t.this;
                                tVar.k = ip.n(tVar.h).a(1.0f);
                                t.this.k.a((it) new iu() {
                                    public final void a(View view) {
                                        t.this.h.setVisibility(0);
                                    }

                                    public final void b(View view) {
                                        t.this.h.setAlpha(1.0f);
                                        t.this.k.a((it) null);
                                        t.this.k = null;
                                    }
                                });
                                return;
                            }
                            t.this.h.setAlpha(1.0f);
                            t.this.h.setVisibility(0);
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.E.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(r());
                        this.h = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.h != null) {
                o();
                this.h.c();
                Context context2 = this.h.getContext();
                ActionBarContextView actionBarContextView = this.h;
                if (this.i != null) {
                    z2 = false;
                }
                am amVar = new am(context2, actionBarContextView, bVar, z2);
                if (bVar.a((aj) amVar, amVar.b())) {
                    amVar.d();
                    this.h.a((aj) amVar);
                    this.g = amVar;
                    if (n()) {
                        this.h.setAlpha(0.0f);
                        this.k = ip.n(this.h).a(1.0f);
                        this.k.a((it) new iu() {
                            public final void a(View view) {
                                t.this.h.setVisibility(0);
                                t.this.h.sendAccessibilityEvent(32);
                                if (t.this.h.getParent() instanceof View) {
                                    ip.s((View) t.this.h.getParent());
                                }
                            }

                            public final void b(View view) {
                                t.this.h.setAlpha(1.0f);
                                t.this.k.a((it) null);
                                t.this.k = null;
                            }
                        });
                    } else {
                        this.h.setAlpha(1.0f);
                        this.h.setVisibility(0);
                        this.h.sendAccessibilityEvent(32);
                        if (this.h.getParent() instanceof View) {
                            ip.s((View) this.h.getParent());
                        }
                    }
                    if (this.i != null) {
                        this.e.getDecorView().post(this.j);
                    }
                } else {
                    this.g = null;
                }
            }
            this.g = this.g;
        }
        return this.g;
    }

    public final ActionBar a() {
        q();
        return this.x;
    }

    /* access modifiers changed from: 0000 */
    public final h a(Menu menu) {
        h[] hVarArr = this.O;
        int length = hVarArr != null ? hVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            h hVar = hVarArr[i2];
            if (hVar != null && hVar.h == menu) {
                return hVar;
            }
        }
        return null;
    }

    public final void a(int i2) {
        this.V = i2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, h hVar, Menu menu) {
        if (menu == null) {
            if (hVar == null && i2 >= 0) {
                h[] hVarArr = this.O;
                if (i2 < hVarArr.length) {
                    hVar = hVarArr[i2];
                }
            }
            if (hVar != null) {
                menu = hVar.h;
            }
        }
        if ((hVar == null || hVar.l) && !this.n) {
            this.w.a.onPanelClosed(i2, menu);
        }
    }

    public final void a(Configuration configuration) {
        if (this.m && this.D) {
            ActionBar a2 = a();
            if (a2 != null) {
                a2.a(configuration);
            }
        }
        bq.b().a(this.d);
        a(false);
    }

    public final void a(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.w.a.onContentChanged();
    }

    public final void a(View view, LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.w.a.onContentChanged();
    }

    public final void a(Toolbar toolbar) {
        if (this.v instanceof Activity) {
            ActionBar a2 = a();
            if (!(a2 instanceof aa)) {
                this.y = null;
                if (a2 != null) {
                    a2.g();
                }
                if (toolbar != null) {
                    x xVar = new x(toolbar, x(), this.w);
                    this.x = xVar;
                    this.e.setCallback(xVar.c);
                } else {
                    this.x = null;
                    this.e.setCallback(this.w);
                }
                i();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void a(ax axVar) {
        by byVar = this.A;
        if (byVar == null || !byVar.b() || (ViewConfiguration.get(this.d).hasPermanentMenuKey() && !this.A.d())) {
            h g2 = g(0);
            g2.n = true;
            a(g2, false);
            a(g2, (KeyEvent) null);
        } else {
            Callback callback = this.e.getCallback();
            if (this.A.c()) {
                this.A.f();
                if (!this.n) {
                    callback.onPanelClosed(108, g(0).h);
                }
            } else if (callback != null && !this.n) {
                if (this.o && (1 & this.p) != 0) {
                    this.e.getDecorView().removeCallbacks(this.aa);
                    this.aa.run();
                }
                h g3 = g(0);
                if (g3.h != null && !g3.o && callback.onPreparePanel(0, g3.g, g3.h)) {
                    callback.onMenuOpened(108, g3.h);
                    this.A.e();
                }
            }
        }
    }

    public final void a(CharSequence charSequence) {
        this.z = charSequence;
        by byVar = this.A;
        if (byVar != null) {
            byVar.a(charSequence);
            return;
        }
        ActionBar actionBar = this.x;
        if (actionBar != null) {
            actionBar.b(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(h hVar, boolean z2) {
        if (z2 && hVar.a == 0) {
            by byVar = this.A;
            if (byVar != null && byVar.c()) {
                b(hVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
        if (!(windowManager == null || !hVar.l || hVar.e == null)) {
            windowManager.removeView(hVar.e);
            if (z2) {
                a(hVar.a, hVar, null);
            }
        }
        hVar.j = false;
        hVar.k = false;
        hVar.l = false;
        hVar.f = null;
        hVar.n = true;
        if (this.P == hVar) {
            this.P = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i2, KeyEvent keyEvent) {
        ActionBar a2 = a();
        if (a2 != null && a2.a(i2, keyEvent)) {
            return true;
        }
        h hVar = this.P;
        if (hVar == null || !a(hVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.P == null) {
                h g2 = g(0);
                b(g2, keyEvent);
                boolean a3 = a(g2, keyEvent.getKeyCode(), keyEvent, 1);
                g2.j = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        h hVar2 = this.P;
        if (hVar2 != null) {
            hVar2.k = true;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            boolean r1 = r0 instanceof defpackage.hy.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof defpackage.u
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.e
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = defpackage.hy.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            t$c r0 = r6.w
            android.view.Window$Callback r0 = r0.a
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0063
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0111
            t$h r0 = r6.g(r4)
            boolean r1 = r0.l
            if (r1 != 0) goto L_0x0111
            r6.b(r0, r7)
            goto L_0x0111
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r6.Q = r2
        L_0x0062:
            return r4
        L_0x0063:
            if (r0 == r5) goto L_0x00e2
            if (r0 == r1) goto L_0x0069
            goto L_0x0110
        L_0x0069:
            aj r0 = r6.g
            if (r0 == 0) goto L_0x006f
            goto L_0x00e1
        L_0x006f:
            t$h r0 = r6.g(r4)
            by r1 = r6.A
            if (r1 == 0) goto L_0x00a9
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00a9
            android.content.Context r1 = r6.d
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00a9
            by r1 = r6.A
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x00a2
            boolean r1 = r6.n
            if (r1 != 0) goto L_0x00c9
            boolean r7 = r6.b(r0, r7)
            if (r7 == 0) goto L_0x00c9
            by r7 = r6.A
            boolean r7 = r7.e()
            goto L_0x00d0
        L_0x00a2:
            by r7 = r6.A
            boolean r7 = r7.f()
            goto L_0x00d0
        L_0x00a9:
            boolean r1 = r0.l
            if (r1 != 0) goto L_0x00cb
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x00b2
            goto L_0x00cb
        L_0x00b2:
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x00c1
            r0.j = r4
            boolean r1 = r6.b(r0, r7)
            goto L_0x00c2
        L_0x00c1:
            r1 = 1
        L_0x00c2:
            if (r1 == 0) goto L_0x00c9
            r6.a(r0, r7)
            r7 = 1
            goto L_0x00d0
        L_0x00c9:
            r7 = 0
            goto L_0x00d0
        L_0x00cb:
            boolean r7 = r0.l
            r6.a(r0, r2)
        L_0x00d0:
            if (r7 == 0) goto L_0x00e1
            android.content.Context r7 = r6.d
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e1
            r7.playSoundEffect(r4)
        L_0x00e1:
            return r2
        L_0x00e2:
            boolean r7 = r6.Q
            r6.Q = r4
            t$h r0 = r6.g(r4)
            if (r0 == 0) goto L_0x00f6
            boolean r1 = r0.l
            if (r1 == 0) goto L_0x00f6
            if (r7 != 0) goto L_0x00f5
            r6.a(r0, r2)
        L_0x00f5:
            return r2
        L_0x00f6:
            aj r7 = r6.g
            if (r7 == 0) goto L_0x00ff
            r7.c()
        L_0x00fd:
            r7 = 1
            goto L_0x010d
        L_0x00ff:
            androidx.appcompat.app.ActionBar r7 = r6.a()
            if (r7 == 0) goto L_0x010c
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x010c
            goto L_0x00fd
        L_0x010c:
            r7 = 0
        L_0x010d:
            if (r7 == 0) goto L_0x0110
            return r2
        L_0x0110:
            r2 = 0
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t.a(android.view.KeyEvent):boolean");
    }

    public final boolean a(ax axVar, MenuItem menuItem) {
        Callback callback = this.e.getCallback();
        if (callback != null && !this.n) {
            h a2 = a((Menu) axVar.l());
            if (a2 != null) {
                return callback.onMenuItemSelected(a2.a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(boolean z2) {
        if (this.n) {
            return false;
        }
        int z3 = z();
        boolean a2 = a(l(z3), z2);
        if (z3 == 0) {
            A().d();
        } else {
            e eVar = this.Y;
            if (eVar != null) {
                eVar.e();
            }
        }
        if (z3 == 3) {
            B().d();
        } else {
            e eVar2 = this.Z;
            if (eVar2 != null) {
                eVar2.e();
            }
        }
        return a2;
    }

    public final MenuInflater b() {
        if (this.y == null) {
            q();
            ActionBar actionBar = this.x;
            this.y = new ao(actionBar != null ? actionBar.b() : this.d);
        }
        return this.y;
    }

    public final <T extends View> T b(int i2) {
        u();
        return this.e.findViewById(i2);
    }

    public final void b(View view, LayoutParams layoutParams) {
        u();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.w.a.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    public final void b(ax axVar) {
        if (!this.N) {
            this.N = true;
            this.A.h();
            Callback callback = this.e.getCallback();
            if (callback != null && !this.n) {
                callback.onPanelClosed(108, axVar);
            }
            this.N = false;
        }
    }

    public final void c() {
        this.R = true;
        a(false);
        t();
        Object obj = this.v;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = fg.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.x;
                if (actionBar == null) {
                    this.ab = true;
                } else {
                    actionBar.d(true);
                }
            }
        }
        this.S = true;
    }

    public final void c(int i2) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.d).inflate(i2, viewGroup);
        this.w.a.onContentChanged();
    }

    public final void d() {
        u();
    }

    public final boolean d(int i2) {
        int k2 = k(i2);
        if (this.M && k2 == 108) {
            return false;
        }
        if (this.m && k2 == 1) {
            this.m = false;
        }
        if (k2 == 1) {
            y();
            this.M = true;
            return true;
        } else if (k2 == 2) {
            y();
            this.H = true;
            return true;
        } else if (k2 == 5) {
            y();
            this.I = true;
            return true;
        } else if (k2 == 10) {
            y();
            this.K = true;
            return true;
        } else if (k2 == 108) {
            y();
            this.m = true;
            return true;
        } else if (k2 != 109) {
            return this.e.requestFeature(k2);
        } else {
            y();
            this.J = true;
            return true;
        }
    }

    public final void e() {
        this.T = true;
        a(true);
        synchronized (s.c) {
            s.b((s) this);
            s.b.add(new WeakReference(this));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e(int i2) {
        if (i2 == 108) {
            ActionBar a2 = a();
            if (a2 != null) {
                a2.f(false);
            }
            return;
        }
        if (i2 == 0) {
            h g2 = g(i2);
            if (g2.l) {
                a(g2, false);
            }
        }
    }

    public final void f() {
        this.T = false;
        a((s) this);
        ActionBar a2 = a();
        if (a2 != null) {
            a2.e(false);
        }
        if (this.v instanceof Dialog) {
            s();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f(int i2) {
        a(g(0), true);
    }

    /* access modifiers changed from: protected */
    public final h g(int i2) {
        h[] hVarArr = this.O;
        if (hVarArr == null || hVarArr.length <= i2) {
            h[] hVarArr2 = new h[(i2 + 1)];
            if (hVarArr != null) {
                System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
            }
            this.O = hVarArr2;
            hVarArr = hVarArr2;
        }
        h hVar = hVarArr[i2];
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(i2);
        hVarArr[i2] = hVar2;
        return hVar2;
    }

    public final void g() {
        ActionBar a2 = a();
        if (a2 != null) {
            a2.e(true);
        }
    }

    public final void h() {
        a(false);
        this.R = true;
    }

    /* access modifiers changed from: 0000 */
    public final void h(int i2) {
        h g2 = g(i2);
        if (g2.h != null) {
            Bundle bundle = new Bundle();
            g2.h.c(bundle);
            if (bundle.size() > 0) {
                g2.p = bundle;
            }
            g2.h.e();
            g2.h.clear();
        }
        g2.o = true;
        g2.n = true;
        if ((i2 == 108 || i2 == 0) && this.A != null) {
            h g3 = g(0);
            if (g3 != null) {
                g3.j = false;
                b(g3, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int i(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        ActionBarContextView actionBarContextView = this.h;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z2 = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.h.getLayoutParams();
            z2 = true;
            if (this.h.isShown()) {
                if (this.ac == null) {
                    this.ac = new Rect();
                    this.ad = new Rect();
                }
                Rect rect = this.ac;
                Rect rect2 = this.ad;
                rect.set(0, i2, 0, 0);
                cv.a(this.E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.G;
                    if (view == null) {
                        this.G = new View(this.d);
                        this.G.setBackgroundColor(this.d.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.E.addView(this.G, -1, new LayoutParams(-1, i2));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.G.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.G == null) {
                    z2 = false;
                }
                if (!this.K && z2) {
                    i2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z4 = true;
                } else {
                    z4 = false;
                }
                z2 = false;
            }
            if (z3) {
                this.h.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.G;
        if (view2 != null) {
            if (!z2) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        return i2;
    }

    public final void i() {
        ActionBar a2 = a();
        if (a2 == null || !a2.e()) {
            j(0);
        }
    }

    public final void j() {
        a((s) this);
        if (this.o) {
            this.e.getDecorView().removeCallbacks(this.aa);
        }
        this.T = false;
        this.n = true;
        ActionBar actionBar = this.x;
        if (actionBar != null) {
            actionBar.g();
        }
        s();
    }

    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.d);
        if (from.getFactory() == null) {
            hz.a(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final void l() {
        if (this.U != -100) {
            q.put(this.v.getClass(), Integer.valueOf(this.U));
        }
    }

    public final int m() {
        return this.U;
    }

    /* access modifiers changed from: 0000 */
    public final boolean n() {
        if (this.D) {
            ViewGroup viewGroup = this.E;
            if (viewGroup != null && ip.B(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void o() {
        is isVar = this.k;
        if (isVar != null) {
            isVar.b();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public final void p() {
        by byVar = this.A;
        if (byVar != null) {
            byVar.h();
        }
        if (this.i != null) {
            this.e.getDecorView().removeCallbacks(this.j);
            if (this.i.isShowing()) {
                try {
                    this.i.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.i = null;
        }
        o();
        h g2 = g(0);
        if (g2 != null && g2.h != null) {
            g2.h.close();
        }
    }
}
