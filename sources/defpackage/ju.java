package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ju reason: default package */
public abstract class ju extends ht {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final defpackage.jv.a<ja> n = new defpackage.jv.a<ja>() {
        public final /* bridge */ /* synthetic */ void a(Object obj, Rect rect) {
            ((ja) obj).a(rect);
        }
    };
    private static final b<dw<ja>, ja> o = new b<dw<ja>, ja>() {
        public final /* synthetic */ int a(Object obj) {
            return ((dw) obj).b();
        }

        public final /* synthetic */ Object a(Object obj, int i) {
            return (ja) ((dw) obj).c(i);
        }
    };
    int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private final AccessibilityManager k;
    private final View l;
    private a m;

    /* renamed from: ju$a */
    class a extends jb {
        a() {
        }

        public final ja a(int i) {
            return ja.a(ju.this.b(i));
        }

        public final boolean a(int i, int i2, Bundle bundle) {
            return ju.this.a(i, i2, bundle);
        }

        public final ja b(int i) {
            int i2 = i == 2 ? ju.this.c : ju.this.d;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }

    public ju(View view) {
        if (view != null) {
            this.l = view;
            this.k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ip.e(view) == 0) {
                ip.b(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect a(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private dw<ja> a() {
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        dw<ja> dwVar = new dw<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dwVar.b(i2, d(i2));
        }
        return dwVar;
    }

    private boolean a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.l.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.l.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private ja b() {
        ja a2 = ja.a(this.l);
        ip.a(this.l, a2);
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        if (a2.a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a2.b(this.l, ((Integer) arrayList.get(i2)).intValue());
            }
            return a2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private void b(int i2, Rect rect) {
        b(i2).a(rect);
    }

    private ja d(int i2) {
        ja a2 = ja.a();
        a2.i(true);
        a2.b(true);
        a2.b((CharSequence) "android.view.View");
        a2.b(f);
        a2.d(f);
        a2.d(this.l);
        a(a2);
        if (a2.d() == null && a2.a.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a2.a(this.h);
        if (!this.h.equals(f)) {
            int actions = a2.a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                a2.a((CharSequence) this.l.getContext().getPackageName());
                a2.a(this.l, i2);
                if (this.c == i2) {
                    a2.e(true);
                    a2.a(128);
                } else {
                    a2.e(false);
                    a2.a(64);
                }
                boolean z = this.d == i2;
                if (z) {
                    a2.a(2);
                } else if (a2.a.isFocusable()) {
                    a2.a(1);
                }
                a2.c(z);
                this.l.getLocationOnScreen(this.j);
                a2.c(this.g);
                if (this.g.equals(f)) {
                    a2.a(this.g);
                    if (a2.b != -1) {
                        ja a3 = ja.a();
                        for (int i3 = a2.b; i3 != -1; i3 = a3.b) {
                            a3.c(this.l, -1);
                            a3.b(f);
                            a(a3);
                            a3.a(this.h);
                            this.g.offset(this.h.left, this.h.top);
                        }
                        a3.a.recycle();
                    }
                    this.g.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                }
                if (this.l.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                    if (this.g.intersect(this.i)) {
                        a2.d(this.g);
                        if (a(this.g)) {
                            a2.d(true);
                        }
                    }
                }
                return a2;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private boolean e(int i2) {
        if (this.c != i2) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.l.invalidate();
        a(i2, 65536);
        return true;
    }

    private boolean f(int i2) {
        if (!this.l.isFocused() && !this.l.requestFocus()) {
            return false;
        }
        int i3 = this.d;
        if (i3 == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            c(i3);
        }
        this.d = i2;
        a(i2, 8);
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    public final jb a(View view) {
        if (this.m == null) {
            this.m = new a();
        }
        return this.m;
    }

    public void a(int i2) {
        int i3 = this.e;
        if (i3 != i2) {
            this.e = i2;
            a(i2, 128);
            a(i3, 256);
        }
    }

    public final void a(View view, ja jaVar) {
        super.a(view, jaVar);
        b(jaVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ja jaVar);

    /* access modifiers changed from: protected */
    public abstract void a(List<Integer> list);

    public final boolean a(int i2, int i3) {
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.k.isEnabled()) {
            return false;
        }
        ViewParent parent = this.l.getParent();
        if (parent == null) {
            return false;
        }
        if (i2 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            ja b = b(i2);
            accessibilityEvent.getText().add(b.d());
            accessibilityEvent.setContentDescription(b.a.getContentDescription());
            accessibilityEvent.setScrollable(b.a.isScrollable());
            accessibilityEvent.setPassword(b.a.isPassword());
            accessibilityEvent.setEnabled(b.a.isEnabled());
            accessibilityEvent.setChecked(b.a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(b.a.getClassName());
                View view = this.l;
                if (VERSION.SDK_INT >= 16) {
                    accessibilityEvent.setSource(view, i2);
                }
                accessibilityEvent.setPackageName(this.l.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            this.l.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.l, accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i2, int i3, Bundle bundle) {
        if (i2 == -1) {
            return ip.a(this.l, i3, bundle);
        }
        boolean z = true;
        if (i3 == 1) {
            return f(i2);
        }
        if (i3 == 2) {
            return c(i2);
        }
        if (i3 != 64) {
            if (i3 == 128) {
                return e(i2);
            }
            z = b(i2, i3);
        } else if (!this.k.isEnabled() || !this.k.isTouchExplorationEnabled()) {
            z = false;
        } else {
            int i4 = this.c;
            if (i4 == i2) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                e(i4);
            }
            this.c = i2;
            this.l.invalidate();
            a(i2, 32768);
        }
        return z;
    }

    public boolean a(int i2, Rect rect) {
        ja jaVar;
        dw a2 = a();
        int i3 = this.d;
        int i4 = Integer.MIN_VALUE;
        Object obj = i3 == Integer.MIN_VALUE ? null : (ja) a2.a(i3, null);
        if (i2 == 1 || i2 == 2) {
            jaVar = (ja) jv.a(a2, o, n, obj, i2, ip.f(this.l) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.d;
            if (i5 != Integer.MIN_VALUE) {
                b(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.l, i2, rect2);
            }
            jaVar = (ja) jv.a(a2, o, n, obj, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (jaVar != null) {
            i4 = a2.b(a2.a(jaVar));
        }
        return f(i4);
    }

    public final boolean a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            int i3 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        if (keyCode == 19) {
                            i3 = 33;
                        } else if (keyCode == 21) {
                            i3 = 17;
                        } else if (keyCode != 22) {
                            i3 = 130;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && a(i3, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            int i4 = this.d;
            if (i4 != Integer.MIN_VALUE) {
                boolean b = b(i4, 16);
            }
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return a(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return a(1, (Rect) null);
            }
            return false;
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.k.isEnabled() && this.k.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a2 = a(motionEvent.getX(), motionEvent.getY());
                a(a2);
                if (a2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.e == Integer.MIN_VALUE) {
                return false;
            } else {
                a(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final ja b(int i2) {
        return i2 == -1 ? b() : d(i2);
    }

    /* access modifiers changed from: protected */
    public void b(ja jaVar) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(int i2, int i3);

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final boolean c(int i2) {
        if (this.d != i2) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        a(i2, 8);
        return true;
    }
}
