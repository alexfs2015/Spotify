package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: bh reason: default package */
final class bh extends bb implements OnKeyListener, OnItemClickListener, OnDismissListener, bd {
    private static final int e = 2131623955;
    final cf a;
    final OnGlobalLayoutListener b = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (bh.this.e() && !bh.this.a.o) {
                View view = bh.this.c;
                if (view == null || !view.isShown()) {
                    bh.this.d();
                } else {
                    bh.this.a.d_();
                }
            }
        }
    };
    View c;
    ViewTreeObserver d;
    private final Context f;
    private final ax h;
    private final aw i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private final OnAttachStateChangeListener n = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (bh.this.d != null) {
                if (!bh.this.d.isAlive()) {
                    bh.this.d = view.getViewTreeObserver();
                }
                bh.this.d.removeGlobalOnLayoutListener(bh.this.b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private OnDismissListener o;
    private View p;
    private a q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    public final void a(Parcelable parcelable) {
    }

    public final void a(ax axVar) {
    }

    public final boolean a() {
        return false;
    }

    public final Parcelable f() {
        return null;
    }

    public bh(Context context, ax axVar, View view, int i2, int i3, boolean z) {
        this.f = context;
        this.h = axVar;
        this.j = z;
        this.i = new aw(axVar, LayoutInflater.from(context), this.j, e);
        this.l = i2;
        this.m = i3;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.p = view;
        this.a = new cf(this.f, null, this.l, this.m);
        axVar.a((bd) this, context);
    }

    public final void b(boolean z) {
        this.i.b = z;
    }

    public final void a(int i2) {
        this.u = i2;
    }

    public final void d() {
        if (e()) {
            this.a.d();
        }
    }

    public final boolean e() {
        return !this.r && this.a.p.isShowing();
    }

    public final void onDismiss() {
        this.r = true;
        this.h.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.n);
        OnDismissListener onDismissListener = this.o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void a(boolean z) {
        this.s = false;
        this.i.notifyDataSetChanged();
    }

    public final void a(a aVar) {
        this.q = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bi r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x006f
            bc r0 = new bc
            android.content.Context r3 = r9.f
            android.view.View r5 = r9.c
            boolean r6 = r9.j
            int r7 = r9.l
            int r8 = r9.m
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            bd$a r2 = r9.q
            r0.a(r2)
            boolean r2 = defpackage.bb.b(r10)
            r0.a(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.o
            r0.c = r2
            r2 = 0
            r9.o = r2
            ax r2 = r9.h
            r2.a(r1)
            cf r2 = r9.a
            int r2 = r2.g
            cf r3 = r9.a
            int r3 = r3.c()
            int r4 = r9.u
            android.view.View r5 = r9.p
            int r5 = defpackage.ip.f(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0052
            android.view.View r4 = r9.p
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0052:
            boolean r4 = r0.e()
            r5 = 1
            if (r4 == 0) goto L_0x005b
        L_0x0059:
            r0 = 1
            goto L_0x0065
        L_0x005b:
            android.view.View r4 = r0.a
            if (r4 != 0) goto L_0x0061
            r0 = 0
            goto L_0x0065
        L_0x0061:
            r0.a(r2, r3, r5, r5)
            goto L_0x0059
        L_0x0065:
            if (r0 == 0) goto L_0x006f
            bd$a r0 = r9.q
            if (r0 == 0) goto L_0x006e
            r0.a(r10)
        L_0x006e:
            return r5
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.a(bi):boolean");
    }

    public final void a(ax axVar, boolean z) {
        if (axVar == this.h) {
            d();
            a aVar = this.q;
            if (aVar != null) {
                aVar.a(axVar, z);
            }
        }
    }

    public final void a(View view) {
        this.p = view;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public final void a(OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    public final ListView g() {
        return this.a.e;
    }

    public final void b(int i2) {
        this.a.g = i2;
    }

    public final void c(int i2) {
        this.a.a(i2);
    }

    public final void c(boolean z) {
        this.v = z;
    }

    public final void d_() {
        boolean z = true;
        if (!e()) {
            if (!this.r) {
                View view = this.p;
                if (view != null) {
                    this.c = view;
                    this.a.a((OnDismissListener) this);
                    cf cfVar = this.a;
                    cfVar.l = this;
                    cfVar.a(true);
                    View view2 = this.c;
                    boolean z2 = this.d == null;
                    this.d = view2.getViewTreeObserver();
                    if (z2) {
                        this.d.addOnGlobalLayoutListener(this.b);
                    }
                    view2.addOnAttachStateChangeListener(this.n);
                    cf cfVar2 = this.a;
                    cfVar2.k = view2;
                    cfVar2.h = this.u;
                    if (!this.s) {
                        this.t = a(this.i, null, this.f, this.k);
                        this.s = true;
                    }
                    this.a.d(this.t);
                    this.a.e(2);
                    this.a.a(this.g);
                    this.a.d_();
                    cb cbVar = this.a.e;
                    cbVar.setOnKeyListener(this);
                    if (this.v && this.h.f != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f).inflate(R.layout.abc_popup_menu_header_item_layout, cbVar, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(this.h.f);
                        }
                        frameLayout.setEnabled(false);
                        cbVar.addHeaderView(frameLayout, null, false);
                    }
                    this.a.a((ListAdapter) this.i);
                    this.a.d_();
                }
            }
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
