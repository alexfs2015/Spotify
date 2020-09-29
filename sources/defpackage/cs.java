package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: cs reason: default package */
final class cs implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    private static cs j;
    private static cs k;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new Runnable() {
        public final void run() {
            cs.this.a(false);
        }
    };
    private final Runnable e = new Runnable() {
        public final void run() {
            cs.this.a();
        }
    };
    private int f;
    private int g;
    private ct h;
    private boolean i;

    public final void onViewAttachedToWindow(View view) {
    }

    public static void a(View view, CharSequence charSequence) {
        cs csVar = j;
        if (csVar != null && csVar.a == view) {
            a((cs) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            cs csVar2 = k;
            if (csVar2 != null && csVar2.a == view) {
                csVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new cs(view, charSequence);
    }

    private cs(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = iq.a(ViewConfiguration.get(this.a.getContext()));
        d();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                d();
                a();
            }
        } else if (this.a.isEnabled() && this.h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f) > this.c || Math.abs(y - this.g) > this.c) {
                this.f = x;
                this.g = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a(this);
            }
        }
        return false;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        long j2;
        int i2;
        long j3;
        if (ip.E(this.a)) {
            a((cs) null);
            cs csVar = k;
            if (csVar != null) {
                csVar.a();
            }
            k = this;
            this.i = z;
            this.h = new ct(this.a.getContext());
            this.h.a(this.a, this.f, this.g, this.i, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                if ((ip.r(this.a) & 1) == 1) {
                    j3 = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i2);
            }
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, j2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (k == this) {
            k = null;
            ct ctVar = this.h;
            if (ctVar != null) {
                ctVar.a();
                this.h = null;
                d();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (j == this) {
            a((cs) null);
        }
        this.a.removeCallbacks(this.e);
    }

    private static void a(cs csVar) {
        cs csVar2 = j;
        if (csVar2 != null) {
            csVar2.c();
        }
        j = csVar;
        if (csVar != null) {
            j.b();
        }
    }

    private void b() {
        this.a.postDelayed(this.d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void c() {
        this.a.removeCallbacks(this.d);
    }

    private void d() {
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
    }
}
