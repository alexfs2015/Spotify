package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: aa reason: default package */
public class aa extends ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.a {
    private static final Interpolator n = new AccelerateInterpolator();
    private static final Interpolator o = new DecelerateInterpolator();
    private boolean A = true;
    private boolean B;
    private it C = new iu() {
        public final void b(View view) {
            if (aa.this.j && aa.this.f != null) {
                aa.this.f.setTranslationY(0.0f);
                aa.this.c.setTranslationY(0.0f);
            }
            aa.this.c.setVisibility(8);
            aa.this.c.a(false);
            aa aaVar = aa.this;
            aaVar.l = null;
            if (aaVar.i != null) {
                aaVar.i.a(aaVar.h);
                aaVar.h = null;
                aaVar.i = null;
            }
            if (aa.this.b != null) {
                ip.s(aa.this.b);
            }
        }
    };
    private it D = new iu() {
        public final void b(View view) {
            aa aaVar = aa.this;
            aaVar.l = null;
            aaVar.c.requestLayout();
        }
    };
    private iv E = new iv() {
        public final void a() {
            ((View) aa.this.c.getParent()).invalidate();
        }
    };
    Context a;
    ActionBarOverlayLayout b;
    ActionBarContainer c;
    bz d;
    ActionBarContextView e;
    View f;
    a g;
    aj h;
    defpackage.aj.a i;
    boolean j = true;
    boolean k;
    ap l;
    boolean m;
    private Context p;
    private Activity q;
    private Dialog r;
    private ArrayList<Object> s = new ArrayList<>();
    private int t = -1;
    private boolean u;
    private boolean v;
    private ArrayList<Object> w = new ArrayList<>();
    private boolean x;
    private int y = 0;
    private boolean z;

    /* renamed from: aa$a */
    public class a extends aj implements defpackage.ax.a {
        final ax a;
        private final Context d;
        private defpackage.aj.a e;
        private WeakReference<View> f;

        public a(Context context, defpackage.aj.a aVar) {
            this.d = context;
            this.e = aVar;
            ax axVar = new ax(context);
            this.a = axVar;
            this.a.a((defpackage.ax.a) this);
        }

        public final MenuInflater a() {
            return new ao(this.d);
        }

        public final Menu b() {
            return this.a;
        }

        public final void c() {
            if (aa.this.g == this) {
                if (!aa.a(false, aa.this.k, false)) {
                    aa aaVar = aa.this;
                    aaVar.h = this;
                    aaVar.i = this.e;
                } else {
                    this.e.a(this);
                }
                this.e = null;
                aa.this.h(false);
                aa.this.e.b();
                aa.this.d.a().sendAccessibilityEvent(32);
                aa.this.b.a(aa.this.m);
                aa.this.g = null;
            }
        }

        public final void d() {
            if (aa.this.g == this) {
                this.a.e();
                try {
                    this.e.b(this, this.a);
                } finally {
                    this.a.f();
                }
            }
        }

        public final boolean e() {
            this.a.e();
            try {
                return this.e.a((aj) this, (Menu) this.a);
            } finally {
                this.a.f();
            }
        }

        public final void a(View view) {
            aa.this.e.a(view);
            this.f = new WeakReference<>(view);
        }

        public final void a(CharSequence charSequence) {
            aa.this.e.b(charSequence);
        }

        public final void b(CharSequence charSequence) {
            aa.this.e.a(charSequence);
        }

        public final void a(int i) {
            b((CharSequence) aa.this.a.getResources().getString(i));
        }

        public final void b(int i) {
            a((CharSequence) aa.this.a.getResources().getString(i));
        }

        public final CharSequence f() {
            return aa.this.e.f;
        }

        public final CharSequence g() {
            return aa.this.e.g;
        }

        public final void a(boolean z) {
            super.a(z);
            aa.this.e.a(z);
        }

        public final boolean h() {
            return aa.this.e.h;
        }

        public final View i() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public final boolean a(ax axVar, MenuItem menuItem) {
            defpackage.aj.a aVar = this.e;
            if (aVar != null) {
                return aVar.a((aj) this, menuItem);
            }
            return false;
        }

        public final void a(ax axVar) {
            if (this.e != null) {
                d();
                aa.this.e.a();
            }
        }
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    static {
        aa.class.desiredAssertionStatus();
    }

    public aa(Activity activity, boolean z2) {
        this.q = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public aa(Dialog dialog) {
        this.r = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view) {
        this.b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.a((androidx.appcompat.widget.ActionBarOverlayLayout.a) this);
        }
        this.d = b(view.findViewById(R.id.action_bar));
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        bz bzVar = this.d;
        if (bzVar == null || this.e == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.a = bzVar.b();
        if ((this.d.l() & 4) != 0) {
            this.u = true;
        }
        ai a2 = ai.a(this.a);
        a2.c();
        i(a2.b());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, defpackage.o.a.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(defpackage.o.a.k, false)) {
            c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(defpackage.o.a.i, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private static bz b(View view) {
        if (view instanceof bz) {
            return (bz) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).i();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(float f2) {
        ip.e((View) this.c, f2);
    }

    public final void a(Configuration configuration) {
        i(ai.a(this.a).b());
    }

    private void i(boolean z2) {
        this.x = z2;
        if (!this.x) {
            this.d.a((cj) null);
            this.c.a((cj) null);
        } else {
            this.c.a((cj) null);
            this.d.a((cj) null);
        }
        boolean z3 = true;
        boolean z4 = k() == 2;
        this.d.a(!this.x && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (this.x || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.c = z3;
    }

    public final void a(int i2) {
        this.y = i2;
    }

    public final void e(boolean z2) {
        this.B = z2;
        if (!z2) {
            ap apVar = this.l;
            if (apVar != null) {
                apVar.b();
            }
        }
    }

    public final void f(boolean z2) {
        if (z2 != this.v) {
            this.v = z2;
            int size = this.w.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.w.get(i2);
            }
        }
    }

    public final void a(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    public final void b(boolean z2) {
        a(8, 8);
    }

    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    private void a(int i2, int i3) {
        int l2 = this.d.l();
        if ((i3 & 4) != 0) {
            this.u = true;
        }
        this.d.a((i2 & i3) | ((i3 ^ -1) & l2));
    }

    private int k() {
        return this.d.m();
    }

    public final int a() {
        return this.d.l();
    }

    public final aj a(defpackage.aj.a aVar) {
        a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.c();
        }
        this.b.a(false);
        this.e.c();
        a aVar3 = new a(this.e.getContext(), aVar);
        if (!aVar3.e()) {
            return null;
        }
        this.g = aVar3;
        aVar3.d();
        this.e.a((aj) aVar3);
        h(true);
        this.e.sendAccessibilityEvent(32);
        return aVar3;
    }

    public final void g(boolean z2) {
        this.j = z2;
    }

    private void l() {
        if (!this.z) {
            this.z = true;
            j(false);
        }
    }

    public final void h() {
        if (this.k) {
            this.k = false;
            j(true);
        }
    }

    private void m() {
        if (this.z) {
            this.z = false;
            j(false);
        }
    }

    public final void i() {
        if (!this.k) {
            this.k = true;
            j(true);
        }
    }

    public final void c(boolean z2) {
        if (this.b.b) {
            this.m = true;
            this.b.a(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    private void j(boolean z2) {
        if (a(false, this.k, this.z)) {
            if (!this.A) {
                this.A = true;
                k(z2);
            }
        } else if (this.A) {
            this.A = false;
            l(z2);
        }
    }

    private void k(boolean z2) {
        ap apVar = this.l;
        if (apVar != null) {
            apVar.b();
        }
        this.c.setVisibility(0);
        if (this.y != 0 || (!this.B && !z2)) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j) {
                View view = this.f;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.D.b(null);
        } else {
            this.c.setTranslationY(0.0f);
            float f2 = (float) (-this.c.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.c.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.c.setTranslationY(f2);
            ap apVar2 = new ap();
            is b2 = ip.n(this.c).b(0.0f);
            b2.a(this.E);
            apVar2.a(b2);
            if (this.j) {
                View view2 = this.f;
                if (view2 != null) {
                    view2.setTranslationY(f2);
                    apVar2.a(ip.n(this.f).b(0.0f));
                }
            }
            apVar2.a(o);
            apVar2.a(250);
            apVar2.a(this.D);
            this.l = apVar2;
            apVar2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            ip.s(actionBarOverlayLayout);
        }
    }

    private void l(boolean z2) {
        ap apVar = this.l;
        if (apVar != null) {
            apVar.b();
        }
        if (this.y != 0 || (!this.B && !z2)) {
            this.C.b(null);
            return;
        }
        this.c.setAlpha(1.0f);
        this.c.a(true);
        ap apVar2 = new ap();
        float f2 = (float) (-this.c.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.c.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        is b2 = ip.n(this.c).b(f2);
        b2.a(this.E);
        apVar2.a(b2);
        if (this.j) {
            View view = this.f;
            if (view != null) {
                apVar2.a(ip.n(view).b(f2));
            }
        }
        apVar2.a(n);
        apVar2.a(250);
        apVar2.a(this.C);
        this.l = apVar2;
        apVar2.a();
    }

    public final void h(boolean z2) {
        is isVar;
        is isVar2;
        if (z2) {
            l();
        } else {
            m();
        }
        if (ip.B(this.c)) {
            if (z2) {
                isVar = this.d.a(4, 100);
                isVar2 = this.e.a(0, 200);
            } else {
                isVar2 = this.d.a(0, 200);
                isVar = this.e.a(8, 100);
            }
            ap apVar = new ap();
            apVar.a(isVar, isVar2);
            apVar.a();
        } else if (z2) {
            this.d.b(4);
            this.e.setVisibility(0);
        } else {
            this.d.b(0);
            this.e.setVisibility(8);
        }
    }

    public final Context b() {
        if (this.p == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.p = new ContextThemeWrapper(this.a, i2);
            } else {
                this.p = this.a;
            }
        }
        return this.p;
    }

    public final void a(Drawable drawable) {
        this.d.a(drawable);
    }

    public final void j() {
        ap apVar = this.l;
        if (apVar != null) {
            apVar.b();
            this.l = null;
        }
    }

    public final boolean f() {
        bz bzVar = this.d;
        if (bzVar == null || !bzVar.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    public final void d(boolean z2) {
        if (!this.u) {
            a(z2);
        }
    }

    public final boolean a(int i2, KeyEvent keyEvent) {
        a aVar = this.g;
        if (aVar == null) {
            return false;
        }
        ax axVar = aVar.a;
        if (axVar == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        axVar.setQwertyMode(z2);
        return axVar.performShortcut(i2, keyEvent, 0);
    }
}
