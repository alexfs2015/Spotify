package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ip reason: default package */
public final class ip {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;
    private static WeakHashMap<View, String> e;
    private static WeakHashMap<View, is> f = null;
    private static Field g;
    private static boolean h = false;
    private static ThreadLocal<Rect> i;

    /* renamed from: ip$a */
    static class a implements OnAttachStateChangeListener, OnGlobalLayoutListener {
        private WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        public final void onViewDetachedFromWindow(View view) {
        }

        a() {
        }

        public final void onGlobalLayout() {
            for (Entry entry : this.a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z = view.getVisibility() == 0;
                if (booleanValue != z) {
                    if (z) {
                        ip.h(view, 16);
                    }
                    this.a.put(view, Boolean.valueOf(z));
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: ip$b */
    static abstract class b<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        /* access modifiers changed from: 0000 */
        public abstract T a(View view);

        b(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        /* access modifiers changed from: 0000 */
        public final T b(View view) {
            if (a()) {
                return a(view);
            }
            if (b()) {
                T tag = view.getTag(this.a);
                if (this.b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        private boolean a() {
            return VERSION.SDK_INT >= this.c;
        }

        private static boolean b() {
            return VERSION.SDK_INT >= 19;
        }
    }

    /* renamed from: ip$c */
    public interface c {
        boolean a();
    }

    /* renamed from: ip$d */
    static class d {
        private static final ArrayList<WeakReference<View>> b = new ArrayList<>();
        WeakReference<KeyEvent> a = null;
        private WeakHashMap<View, Boolean> c = null;
        private SparseArray<WeakReference<View>> d = null;

        d() {
        }

        /* access modifiers changed from: 0000 */
        public SparseArray<WeakReference<View>> a() {
            if (this.d == null) {
                this.d = new SparseArray<>();
            }
            return this.d;
        }

        static d a(View view) {
            d dVar = (d) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(R.id.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        /* access modifiers changed from: 0000 */
        public View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.c;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((c) arrayList.get(size)).a()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.c;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!b.isEmpty()) {
                synchronized (b) {
                    if (this.c == null) {
                        this.c = new WeakHashMap<>();
                    }
                    for (int size = b.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) b.get(size)).get();
                        if (view == null) {
                            b.remove(size);
                        } else {
                            this.c.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.c.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new AtomicInteger(1);
        new a();
    }

    private static Rect a() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = (Rect) i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void a(View view, ht htVar) {
        if (htVar == null && (K(view) instanceof a)) {
            htVar = new ht();
        }
        view.setAccessibilityDelegate(htVar == null ? null : htVar.b);
    }

    public static int a(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void a(View view, int i2) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static boolean b(View view) {
        return K(view) != null;
    }

    private static AccessibilityDelegate K(View view) {
        if (h) {
            return null;
        }
        if (g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                h = true;
                return null;
            }
        }
        try {
            Object obj = g.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            h = true;
            return null;
        }
    }

    public static boolean c(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void a(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void d(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        } else {
            view.postInvalidate(i2, i3, i4, i5);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static int e(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void b(View view, int i2) {
        if (VERSION.SDK_INT < 19) {
            if (VERSION.SDK_INT < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void a(View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static int f(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static ViewParent g(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static <T extends View> T c(View view, int i2) {
        if (VERSION.SDK_INT >= 28) {
            return view.requireViewById(i2);
        }
        T findViewById = view.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static int h(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void d(View view, int i2) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static int i(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static int j(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    @Deprecated
    public static float k(View view) {
        return view.getTranslationX();
    }

    public static int l(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static int m(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static is n(View view) {
        if (f == null) {
            f = new WeakHashMap<>();
        }
        is isVar = (is) f.get(view);
        if (isVar != null) {
            return isVar;
        }
        is isVar2 = new is(view);
        f.put(view, isVar2);
        return isVar2;
    }

    @Deprecated
    public static void a(View view, float f2) {
        view.setTranslationX(f2);
    }

    @Deprecated
    public static void b(View view, float f2) {
        view.setAlpha(f2);
    }

    @Deprecated
    public static void c(View view, float f2) {
        view.setScaleX(1.2f);
    }

    @Deprecated
    public static void d(View view, float f2) {
        view.setScaleY(1.2f);
    }

    public static void e(View view, float f2) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static float o(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void f(View view, float f2) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    public static float p(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static void a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (e == null) {
            e = new WeakHashMap<>();
        }
        e.put(view, str);
    }

    public static String q(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = e;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    public static int r(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void s(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static boolean t(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    public static void b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void a(View view, final il ilVar) {
        if (VERSION.SDK_INT >= 21) {
            if (ilVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) iw.a(ilVar.onApplyWindowInsets(view, iw.a((Object) windowInsets)));
                }
            });
        }
    }

    public static iw a(View view, iw iwVar) {
        if (VERSION.SDK_INT < 21) {
            return iwVar;
        }
        WindowInsets windowInsets = (WindowInsets) iw.a(iwVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return iw.a((Object) windowInsets);
    }

    public static iw b(View view, iw iwVar) {
        if (VERSION.SDK_INT < 21) {
            return iwVar;
        }
        WindowInsets windowInsets = (WindowInsets) iw.a(iwVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return iw.a((Object) windowInsets);
    }

    public static boolean u(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean v(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static ColorStateList w(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof io) {
            return ((io) view).b_();
        }
        return null;
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof io) {
            ((io) view).a(colorStateList);
        }
    }

    public static Mode x(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof io) {
            return ((io) view).aA_();
        }
        return null;
    }

    public static void a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof io) {
            ((io) view).a(mode);
        }
    }

    public static boolean y(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof id) {
            return ((id) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static void z(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
            return;
        }
        if (view instanceof id) {
            ((id) view).stopNestedScroll();
        }
    }

    public static void e(View view, int i2) {
        if (view instanceof ie) {
            ((ie) view).a(1);
        }
    }

    public static boolean A(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    public static boolean B(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float C(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void f(View view, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a2 = a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            i(view, i2);
            if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a2);
            }
        } else {
            i(view, i2);
        }
    }

    private static void i(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                L((View) parent);
            }
        }
    }

    public static void g(View view, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a2 = a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            j(view, i2);
            if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a2);
            }
        } else {
            j(view, i2);
        }
    }

    private static void j(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                L((View) parent);
            }
        }
    }

    private static void L(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static Rect D(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean E(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean F(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void a(View view, int i2, int i3) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void a(View view, in inVar) {
        Object obj;
        if (VERSION.SDK_INT >= 24) {
            if (inVar != null) {
                obj = inVar.a;
            } else {
                obj = null;
            }
            view.setPointerIcon((PointerIcon) obj);
        }
    }

    public static Display G(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (E(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (a2.a == null || a2.a.get() != keyEvent) {
            a2.a = new WeakReference<>(keyEvent);
            WeakReference weakReference = null;
            SparseArray a3 = a2.a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a3.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference) a3.valueAt(indexOfKey);
                    a3.removeAt(indexOfKey);
                }
            }
            if (weakReference == null) {
                weakReference = (WeakReference) a3.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 != null && E(view2)) {
                    d.b(view2, keyEvent);
                }
                return true;
            }
        }
        return false;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (keyEvent.getAction() == 0) {
            a2.b();
        }
        View a3 = a2.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                a2.a().put(keyCode, new WeakReference(a3));
            }
        }
        if (a3 != null) {
            return true;
        }
        return false;
    }

    static void h(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = I(view) != null;
            if (h(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(16);
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 16);
                } catch (AbstractMethodError e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e2);
                }
            }
        }
    }

    public static void a(View view, ja jaVar) {
        view.onInitializeAccessibilityNodeInfo(jaVar.a);
    }

    public static boolean H(View view) {
        Boolean bool = (Boolean) new b<Boolean>(R.id.tag_screen_reader_focusable, Boolean.class, 28) {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ Object a(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }
        }.b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static CharSequence I(View view) {
        return (CharSequence) new b<CharSequence>(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28) {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ Object a(View view) {
                return view.getAccessibilityPaneTitle();
            }
        }.b(view);
    }

    public static boolean J(View view) {
        Boolean bool = (Boolean) new b<Boolean>(R.id.tag_accessibility_heading, Boolean.class, 28) {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ Object a(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }
        }.b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
