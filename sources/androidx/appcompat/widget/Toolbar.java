package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView.d;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;
    private final ArrayList<View> J;
    private final int[] K;
    private final d L;
    private cq M;
    private bm N;
    private final Runnable O;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    ImageButton d;
    View e;
    public int f;
    public int g;
    int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public ci m;
    public CharSequence n;
    public CharSequence o;
    final ArrayList<View> p;
    public b q;
    public a r;
    public defpackage.bd.a s;
    public defpackage.ax.a t;
    public boolean u;
    private ImageButton v;
    private ImageView w;
    private Drawable x;
    private CharSequence y;
    private Context z;

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        int b;

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.b = 0;
            this.a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.b = 0;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
            this.b = 0;
            this.b = layoutParams.b;
        }
    }

    public class a implements bd {
        public az a;
        private ax b;

        a() {
        }

        public final void a(Context context, ax axVar) {
            ax axVar2 = this.b;
            if (axVar2 != null) {
                az azVar = this.a;
                if (azVar != null) {
                    axVar2.b(azVar);
                }
            }
            this.b = axVar;
        }

        public final void a(Parcelable parcelable) {
        }

        public final void a(ax axVar, boolean z) {
        }

        public final void a(defpackage.bd.a aVar) {
        }

        public final void a(boolean z) {
            if (this.a != null) {
                ax axVar = this.b;
                boolean z2 = false;
                if (axVar != null) {
                    int size = axVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.b.getItem(i) == this.a) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    c(this.a);
                }
            }
        }

        public final boolean a() {
            return false;
        }

        public final boolean a(bi biVar) {
            return false;
        }

        public final int b() {
            return 0;
        }

        public final boolean b(az azVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.d.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.d);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.d);
            }
            Toolbar.this.e = azVar.getActionView();
            this.a = azVar;
            ViewParent parent2 = Toolbar.this.e.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.e);
                }
                LayoutParams h = Toolbar.h();
                h.a = 8388611 | (Toolbar.this.h & ContentType.LONG_FORM_ON_DEMAND);
                h.b = 2;
                Toolbar.this.e.setLayoutParams(h);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.e);
            }
            Toolbar toolbar5 = Toolbar.this;
            for (int childCount = toolbar5.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar5.getChildAt(childCount);
                if (!(((LayoutParams) childAt.getLayoutParams()).b == 2 || childAt == toolbar5.a)) {
                    toolbar5.removeViewAt(childCount);
                    toolbar5.p.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            azVar.e(true);
            if (Toolbar.this.e instanceof ak) {
                ((ak) Toolbar.this.e).a();
            }
            return true;
        }

        public final boolean c(az azVar) {
            if (Toolbar.this.e instanceof ak) {
                ((ak) Toolbar.this.e).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.e);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.d);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.e = null;
            toolbar3.j();
            this.a = null;
            Toolbar.this.requestLayout();
            azVar.e(false);
            return true;
        }

        public final Parcelable f() {
            return null;
        }
    }

    public interface b {
        boolean a(MenuItem menuItem);
    }

    public static class c extends jt {
        public static final Creator<c> CREATOR = new ClassLoaderCreator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        };
        int a;
        boolean b;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.E = 8388627;
        this.J = new ArrayList<>();
        this.p = new ArrayList<>();
        this.K = new int[2];
        this.L = new d() {
            public final boolean a(MenuItem menuItem) {
                if (Toolbar.this.q != null) {
                    return Toolbar.this.q.a(menuItem);
                }
                return false;
            }
        };
        this.O = new Runnable() {
            public final void run() {
                Toolbar.this.b();
            }
        };
        cp a2 = cp.a(getContext(), attributeSet, defpackage.o.a.dd, i2, 0);
        this.f = a2.g(defpackage.o.a.dF, 0);
        this.g = a2.g(defpackage.o.a.dw, 0);
        this.E = a2.c(defpackage.o.a.de, this.E);
        this.h = a2.c(defpackage.o.a.df, 48);
        int d2 = a2.d(defpackage.o.a.dz, 0);
        if (a2.f(defpackage.o.a.dE)) {
            d2 = a2.d(defpackage.o.a.dE, d2);
        }
        this.l = d2;
        this.k = d2;
        this.j = d2;
        this.i = d2;
        int d3 = a2.d(defpackage.o.a.dC, -1);
        if (d3 >= 0) {
            this.i = d3;
        }
        int d4 = a2.d(defpackage.o.a.dB, -1);
        if (d4 >= 0) {
            this.j = d4;
        }
        int d5 = a2.d(defpackage.o.a.dD, -1);
        if (d5 >= 0) {
            this.k = d5;
        }
        int d6 = a2.d(defpackage.o.a.dA, -1);
        if (d6 >= 0) {
            this.l = d6;
        }
        this.B = a2.e(defpackage.o.a.dq, -1);
        int d7 = a2.d(defpackage.o.a.dm, Integer.MIN_VALUE);
        int d8 = a2.d(defpackage.o.a.di, Integer.MIN_VALUE);
        int e2 = a2.e(defpackage.o.a.dk, 0);
        int e3 = a2.e(defpackage.o.a.dl, 0);
        k();
        ci ciVar = this.m;
        ciVar.h = false;
        if (e2 != Integer.MIN_VALUE) {
            ciVar.e = e2;
            ciVar.a = e2;
        }
        if (e3 != Integer.MIN_VALUE) {
            ciVar.f = e3;
            ciVar.b = e3;
        }
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.m.a(d7, d8);
        }
        this.C = a2.d(defpackage.o.a.dn, Integer.MIN_VALUE);
        this.D = a2.d(defpackage.o.a.dj, Integer.MIN_VALUE);
        this.x = a2.a(defpackage.o.a.dh);
        this.y = a2.c(defpackage.o.a.dg);
        CharSequence c2 = a2.c(defpackage.o.a.dy);
        if (!TextUtils.isEmpty(c2)) {
            a(c2);
        }
        CharSequence c3 = a2.c(defpackage.o.a.dv);
        if (!TextUtils.isEmpty(c3)) {
            b(c3);
        }
        this.z = getContext();
        a(a2.g(defpackage.o.a.du, 0));
        Drawable a3 = a2.a(defpackage.o.a.dt);
        if (a3 != null) {
            b(a3);
        }
        CharSequence c4 = a2.c(defpackage.o.a.ds);
        if (!TextUtils.isEmpty(c4)) {
            c(c4);
        }
        Drawable a4 = a2.a(defpackage.o.a.f12do);
        if (a4 != null) {
            a(a4);
        }
        CharSequence c5 = a2.c(defpackage.o.a.dp);
        if (!TextUtils.isEmpty(c5)) {
            if (!TextUtils.isEmpty(c5)) {
                l();
            }
            ImageView imageView = this.w;
            if (imageView != null) {
                imageView.setContentDescription(c5);
            }
        }
        if (a2.f(defpackage.o.a.dG)) {
            ColorStateList e4 = a2.e(defpackage.o.a.dG);
            this.F = e4;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(e4);
            }
        }
        if (a2.f(defpackage.o.a.dx)) {
            ColorStateList e5 = a2.e(defpackage.o.a.dx);
            this.G = e5;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(e5);
            }
        }
        if (a2.f(defpackage.o.a.dr)) {
            new ao(getContext()).inflate(a2.g(defpackage.o.a.dr, 0), f());
        }
        a2.a.recycle();
    }

    private int a(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int c2 = c(layoutParams.a);
        if (c2 == 48) {
            return getPaddingTop() - i3;
        }
        if (c2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < layoutParams.topMargin) {
            i4 = layoutParams.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < layoutParams.bottomMargin) {
                i4 = Math.max(0, i4 - (layoutParams.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    private static LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof androidx.appcompat.app.ActionBar.LayoutParams ? new LayoutParams((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    private void a(View view, int i2, int i3, int i4, int i5, int i6) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void a(View view, boolean z2) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? a(layoutParams) : (LayoutParams) layoutParams;
        layoutParams2.b = 1;
        if (!z2 || this.e == null) {
            addView(view, layoutParams2);
            return;
        }
        view.setLayoutParams(layoutParams2);
        this.p.add(view);
    }

    private void a(List<View> list, int i2) {
        boolean z2 = ip.f(this) == 1;
        int childCount = getChildCount();
        int a2 = hx.a(i2, ip.f(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && a(childAt) && d(layoutParams.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && a(childAt2) && d(layoutParams2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return ia.a(marginLayoutParams) + ia.b(marginLayoutParams);
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    private int c(int i2) {
        int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.E & ContentType.LONG_FORM_ON_DEMAND;
    }

    private static int c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int d(int i2) {
        int f2 = ip.f(this);
        int a2 = hx.a(i2, f2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : f2 == 1 ? 5 : 3;
    }

    private boolean d(View view) {
        return view.getParent() == this || this.p.contains(view);
    }

    protected static LayoutParams h() {
        return new LayoutParams(-2, -2);
    }

    private void l() {
        if (this.w == null) {
            this.w = new AppCompatImageView(getContext());
        }
    }

    private void m() {
        n();
        if (this.a.a == null) {
            ax axVar = (ax) this.a.b();
            if (this.r == null) {
                this.r = new a();
            }
            this.a.a(true);
            axVar.a((bd) this.r, this.z);
        }
    }

    private void n() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.a(this.A);
            ActionMenuView actionMenuView = this.a;
            actionMenuView.e = this.L;
            actionMenuView.a(this.s, this.t);
            LayoutParams h2 = h();
            h2.a = 8388613 | (this.h & ContentType.LONG_FORM_ON_DEMAND);
            this.a.setLayoutParams(h2);
            a((View) this.a, false);
        }
    }

    private int o() {
        int i2;
        ci ciVar = this.m;
        if (ciVar == null) {
            i2 = 0;
        } else if (!ciVar.g) {
            return ciVar.a;
        } else {
            i2 = ciVar.b;
        }
        return i2;
    }

    private int p() {
        int i2;
        ci ciVar = this.m;
        if (ciVar == null) {
            i2 = 0;
        } else if (!ciVar.g) {
            return ciVar.b;
        } else {
            i2 = ciVar.a;
        }
        return i2;
    }

    private int q() {
        return e() != null ? Math.max(o(), Math.max(this.C, 0)) : o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int r() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            ax r0 = r0.a
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.p()
            int r2 = r3.D
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x0023:
            int r0 = r3.p()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.r():int");
    }

    private void s() {
        if (this.v == null) {
            this.v = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams h2 = h();
            h2.a = 8388611 | (this.h & ContentType.LONG_FORM_ON_DEMAND);
            this.v.setLayoutParams(h2);
        }
    }

    public final boolean N_() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            if (actionMenuView.c != null && actionMenuView.c.i()) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i2) {
        if (this.A != i2) {
            this.A = i2;
            if (i2 == 0) {
                this.z = getContext();
                return;
            }
            this.z = new ContextThemeWrapper(getContext(), i2);
        }
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!d((View) this.w)) {
                a((View) this.w, true);
            }
        } else {
            ImageView imageView = this.w;
            if (imageView != null && d((View) imageView)) {
                removeView(this.w);
                this.p.remove(this.w);
            }
        }
        ImageView imageView2 = this.w;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void a(OnClickListener onClickListener) {
        s();
        this.v.setOnClickListener(onClickListener);
    }

    public final void a(ax axVar, bm bmVar) {
        if (axVar != null || this.a != null) {
            n();
            ax axVar2 = this.a.a;
            if (axVar2 != axVar) {
                if (axVar2 != null) {
                    axVar2.b((bd) this.N);
                    axVar2.b((bd) this.r);
                }
                if (this.r == null) {
                    this.r = new a();
                }
                bmVar.h = true;
                if (axVar != null) {
                    axVar.a((bd) bmVar, this.z);
                    axVar.a((bd) this.r, this.z);
                } else {
                    bmVar.a(this.z, (ax) null);
                    this.r.a(this.z, (ax) null);
                    bmVar.a(true);
                    this.r.a(true);
                }
                this.a.a(this.A);
                this.a.a(bmVar);
                this.N = bmVar;
            }
        }
    }

    public void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new AppCompatTextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TruncateAt.END);
                int i2 = this.f;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!d((View) this.b)) {
                a((View) this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && d((View) textView)) {
                removeView(this.b);
                this.p.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.n = charSequence;
    }

    public final void b(int i2) {
        c(i2 != 0 ? getContext().getText(i2) : null);
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            s();
            if (!d((View) this.v)) {
                a((View) this.v, true);
            }
        } else {
            ImageButton imageButton = this.v;
            if (imageButton != null && d((View) imageButton)) {
                removeView(this.v);
                this.p.remove(this.v);
            }
        }
        ImageButton imageButton2 = this.v;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new AppCompatTextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TruncateAt.END);
                int i2 = this.g;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!d((View) this.c)) {
                a((View) this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && d((View) textView)) {
                removeView(this.c);
                this.p.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final boolean b() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            if (actionMenuView.c != null && actionMenuView.c.d()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        a aVar = this.r;
        az azVar = aVar == null ? null : aVar.a;
        if (azVar != null) {
            azVar.collapseActionView();
        }
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            s();
        }
        ImageButton imageButton = this.v;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final CharSequence d() {
        ImageButton imageButton = this.v;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final Drawable e() {
        ImageButton imageButton = this.v;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        m();
        return this.a.b();
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.d.setImageDrawable(this.x);
            this.d.setContentDescription(this.y);
            LayoutParams h2 = h();
            h2.a = 8388611 | (this.h & ContentType.LONG_FORM_ON_DEMAND);
            h2.b = 2;
            this.d.setLayoutParams(h2);
            this.d.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    Toolbar.this.c();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public final bz i() {
        if (this.M == null) {
            this.M = new cq(this, true);
        }
        return this.M;
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            addView((View) this.p.get(size));
        }
        this.p.clear();
    }

    public void k() {
        if (this.m == null) {
            this.m = new ci();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b8 A[LOOP:0: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02da A[LOOP:1: B:112:0x02d8->B:113:0x02da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0300 A[LOOP:2: B:115:0x02fe->B:116:0x0300, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0350 A[LOOP:3: B:123:0x034e->B:124:0x0350, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = defpackage.ip.f(r18)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = defpackage.ip.m(r18)
            if (r12 < 0) goto L_0x003a
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.v
            boolean r13 = r0.a(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.v
            int r13 = r0.b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.v
            int r13 = r0.a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.d
            boolean r15 = r0.a(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.d
            int r14 = r0.b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.d
            int r13 = r0.a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            boolean r15 = r0.a(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r13 = r0.a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r14 = r0.b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = defpackage.ip.f(r18)
            if (r15 != r2) goto L_0x0090
            int r15 = r18.r()
            goto L_0x0094
        L_0x0090:
            int r15 = r18.q()
        L_0x0094:
            int r3 = defpackage.ip.f(r18)
            if (r3 != r2) goto L_0x009f
            int r3 = r18.q()
            goto L_0x00a3
        L_0x009f:
            int r3 = r18.r()
        L_0x00a3:
            int r2 = r15 - r13
            r22 = r7
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            r11[r7] = r2
            int r2 = r10 - r14
            int r2 = r3 - r2
            int r2 = java.lang.Math.max(r7, r2)
            r7 = 1
            r11[r7] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r3
            int r3 = java.lang.Math.min(r14, r10)
            android.view.View r7 = r0.e
            boolean r7 = r0.a(r7)
            if (r7 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.view.View r7 = r0.e
            int r3 = r0.b(r7, r3, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.view.View r7 = r0.e
            int r2 = r0.a(r7, r2, r11, r12)
        L_0x00d9:
            android.widget.ImageView r7 = r0.w
            boolean r7 = r0.a(r7)
            if (r7 == 0) goto L_0x00f0
            if (r1 == 0) goto L_0x00ea
            android.widget.ImageView r7 = r0.w
            int r3 = r0.b(r7, r3, r11, r12)
            goto L_0x00f0
        L_0x00ea:
            android.widget.ImageView r7 = r0.w
            int r2 = r0.a(r7, r2, r11, r12)
        L_0x00f0:
            android.widget.TextView r7 = r0.b
            boolean r7 = r0.a(r7)
            android.widget.TextView r10 = r0.c
            boolean r10 = r0.a(r10)
            if (r7 == 0) goto L_0x0115
            android.widget.TextView r13 = r0.b
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r13 = (androidx.appcompat.widget.Toolbar.LayoutParams) r13
            int r14 = r13.topMargin
            android.widget.TextView r15 = r0.b
            int r15 = r15.getMeasuredHeight()
            int r14 = r14 + r15
            int r13 = r13.bottomMargin
            int r14 = r14 + r13
            r13 = 0
            int r14 = r14 + r13
            goto L_0x0116
        L_0x0115:
            r14 = 0
        L_0x0116:
            if (r10 == 0) goto L_0x0130
            android.widget.TextView r13 = r0.c
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r13 = (androidx.appcompat.widget.Toolbar.LayoutParams) r13
            int r15 = r13.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r13.bottomMargin
            int r15 = r15 + r4
            int r14 = r14 + r15
            goto L_0x0132
        L_0x0130:
            r16 = r4
        L_0x0132:
            if (r7 != 0) goto L_0x013d
            if (r10 == 0) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            r17 = r6
            r21 = r12
            goto L_0x02a8
        L_0x013d:
            if (r7 == 0) goto L_0x0142
            android.widget.TextView r4 = r0.b
            goto L_0x0144
        L_0x0142:
            android.widget.TextView r4 = r0.c
        L_0x0144:
            if (r10 == 0) goto L_0x0149
            android.widget.TextView r13 = r0.c
            goto L_0x014b
        L_0x0149:
            android.widget.TextView r13 = r0.b
        L_0x014b:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r13 = (androidx.appcompat.widget.Toolbar.LayoutParams) r13
            if (r7 == 0) goto L_0x0161
            android.widget.TextView r15 = r0.b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x016b
        L_0x0161:
            if (r10 == 0) goto L_0x016f
            android.widget.TextView r15 = r0.c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x016f
        L_0x016b:
            r17 = r6
            r15 = 1
            goto L_0x0172
        L_0x016f:
            r17 = r6
            r15 = 0
        L_0x0172:
            int r6 = r0.E
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01bb
            r12 = 80
            if (r6 == r12) goto L_0x01af
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r14
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.k
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0196
            int r2 = r4.topMargin
            int r4 = r0.k
            int r6 = r2 + r4
            goto L_0x01ad
        L_0x0196:
            int r5 = r5 - r9
            int r5 = r5 - r14
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r4 = r0.l
            int r2 = r2 + r4
            if (r5 >= r2) goto L_0x01ad
            int r2 = r13.bottomMargin
            int r4 = r0.l
            int r2 = r2 + r4
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x01ad:
            int r8 = r8 + r6
            goto L_0x01c8
        L_0x01af:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r13.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.l
            int r5 = r5 - r2
            int r8 = r5 - r14
            goto L_0x01c8
        L_0x01bb:
            r23 = r2
            int r2 = r18.getPaddingTop()
            int r4 = r4.topMargin
            int r2 = r2 + r4
            int r4 = r0.k
            int r8 = r2 + r4
        L_0x01c8:
            if (r1 == 0) goto L_0x023c
            if (r15 == 0) goto L_0x01cf
            int r1 = r0.i
            goto L_0x01d0
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            r2 = 1
            r4 = r11[r2]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r3 = r3 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x0207
            android.widget.TextView r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r3 - r2
            android.widget.TextView r4 = r0.b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.j
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0208
        L_0x0207:
            r2 = r3
        L_0x0208:
            if (r10 == 0) goto L_0x0230
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.c
            int r4 = r4.getMeasuredWidth()
            int r4 = r3 - r4
            android.widget.TextView r5 = r0.c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.c
            r6.layout(r4, r8, r3, r5)
            int r4 = r0.j
            int r4 = r3 - r4
            int r1 = r1.bottomMargin
            goto L_0x0231
        L_0x0230:
            r4 = r3
        L_0x0231:
            if (r15 == 0) goto L_0x0238
            int r1 = java.lang.Math.min(r2, r4)
            r3 = r1
        L_0x0238:
            r2 = r23
            goto L_0x02a8
        L_0x023c:
            if (r15 == 0) goto L_0x0241
            int r1 = r0.i
            goto L_0x0242
        L_0x0241:
            r1 = 0
        L_0x0242:
            r2 = 0
            r4 = r11[r2]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r2, r1)
            int r4 = r23 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x0278
            android.widget.TextView r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r4
            android.widget.TextView r5 = r0.b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.b
            r6.layout(r4, r8, r2, r5)
            int r6 = r0.j
            int r2 = r2 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0279
        L_0x0278:
            r2 = r4
        L_0x0279:
            if (r10 == 0) goto L_0x029f
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r5 = r1.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.c
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r4
            android.widget.TextView r6 = r0.c
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.c
            r7.layout(r4, r8, r5, r6)
            int r6 = r0.j
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            goto L_0x02a0
        L_0x029f:
            r5 = r4
        L_0x02a0:
            if (r15 == 0) goto L_0x02a7
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x02a8
        L_0x02a7:
            r2 = r4
        L_0x02a8:
            java.util.ArrayList<android.view.View> r1 = r0.J
            r4 = 3
            r0.a(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.J
            int r1 = r1.size()
            r4 = r2
            r2 = 0
        L_0x02b6:
            if (r2 >= r1) goto L_0x02c9
            java.util.ArrayList<android.view.View> r5 = r0.J
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.a(r5, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b6
        L_0x02c9:
            r12 = r21
            java.util.ArrayList<android.view.View> r1 = r0.J
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.J
            int r1 = r1.size()
            r2 = 0
        L_0x02d8:
            if (r2 >= r1) goto L_0x02e9
            java.util.ArrayList<android.view.View> r5 = r0.J
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r3 = r0.b(r5, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02d8
        L_0x02e9:
            java.util.ArrayList<android.view.View> r1 = r0.J
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.J
            r5 = 0
            r6 = r11[r5]
            r2 = r11[r2]
            int r5 = r1.size()
            r8 = r2
            r7 = r6
            r2 = 0
            r6 = 0
        L_0x02fe:
            if (r2 >= r5) goto L_0x0331
            java.lang.Object r9 = r1.get(r2)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r10 = (androidx.appcompat.widget.Toolbar.LayoutParams) r10
            int r13 = r10.leftMargin
            int r13 = r13 - r7
            int r7 = r10.rightMargin
            int r7 = r7 - r8
            r8 = 0
            int r10 = java.lang.Math.max(r8, r13)
            int r14 = java.lang.Math.max(r8, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r8, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r9.getMeasuredWidth()
            int r10 = r10 + r9
            int r10 = r10 + r14
            int r6 = r6 + r10
            int r2 = r2 + 1
            r8 = r7
            r7 = r13
            goto L_0x02fe
        L_0x0331:
            r8 = 0
            int r1 = r16 - r17
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r1 = r17 + r1
            int r2 = r6 / 2
            int r1 = r1 - r2
            int r6 = r6 + r1
            if (r1 >= r4) goto L_0x0341
            goto L_0x0348
        L_0x0341:
            if (r6 <= r3) goto L_0x0347
            int r6 = r6 - r3
            int r4 = r1 - r6
            goto L_0x0348
        L_0x0347:
            r4 = r1
        L_0x0348:
            java.util.ArrayList<android.view.View> r1 = r0.J
            int r1 = r1.size()
        L_0x034e:
            if (r8 >= r1) goto L_0x035f
            java.util.ArrayList<android.view.View> r2 = r0.J
            java.lang.Object r2 = r2.get(r8)
            android.view.View r2 = (android.view.View) r2
            int r4 = r0.a(r2, r4, r11, r12)
            int r8 = r8 + 1
            goto L_0x034e
        L_0x035f:
            java.util.ArrayList<android.view.View> r1 = r0.J
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.K;
        boolean z2 = true;
        if (cv.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (a((View) this.v)) {
            a((View) this.v, i2, 0, i3, 0, this.B);
            i6 = this.v.getMeasuredWidth() + b((View) this.v);
            i5 = Math.max(0, this.v.getMeasuredHeight() + c((View) this.v));
            i4 = View.combineMeasuredStates(0, this.v.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (a((View) this.d)) {
            a((View) this.d, i2, 0, i3, 0, this.B);
            i6 = this.d.getMeasuredWidth() + b((View) this.d);
            i5 = Math.max(i5, this.d.getMeasuredHeight() + c((View) this.d));
            i4 = View.combineMeasuredStates(i4, this.d.getMeasuredState());
        }
        int q2 = q();
        int max = Math.max(q2, i6) + 0;
        iArr[c3] = Math.max(0, q2 - i6);
        if (a((View) this.a)) {
            a((View) this.a, i2, max, i3, 0, this.B);
            i7 = this.a.getMeasuredWidth() + b((View) this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + c((View) this.a));
            i4 = View.combineMeasuredStates(i4, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int r2 = r();
        int max2 = max + Math.max(r2, i7);
        iArr[c2] = Math.max(0, r2 - i7);
        if (a(this.e)) {
            max2 += a(this.e, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.e.getMeasuredHeight() + c(this.e));
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        }
        if (a((View) this.w)) {
            max2 += a((View) this.w, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.w.getMeasuredHeight() + c((View) this.w));
            i4 = View.combineMeasuredStates(i4, this.w.getMeasuredState());
        }
        int childCount = getChildCount();
        int i11 = i5;
        int i12 = max2;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((LayoutParams) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                View view = childAt;
                i12 += a(childAt, i2, i12, i3, 0, iArr);
                i11 = Math.max(i11, view.getMeasuredHeight() + c(view));
                i4 = View.combineMeasuredStates(i4, view.getMeasuredState());
            }
        }
        int i14 = this.k + this.l;
        int i15 = this.i + this.j;
        if (a((View) this.b)) {
            a((View) this.b, i2, i12 + i15, i3, i14, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + b((View) this.b);
            i8 = this.b.getMeasuredHeight() + c((View) this.b);
            i10 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (a((View) this.c)) {
            int i16 = i8 + i14;
            int i17 = i10;
            i9 = Math.max(i9, a((View) this.c, i2, i12 + i15, i3, i16, iArr));
            i8 += this.c.getMeasuredHeight() + c((View) this.c);
            i10 = View.combineMeasuredStates(i17, this.c.getMeasuredState());
        } else {
            int i18 = i10;
        }
        int i19 = i12 + i9;
        int max3 = Math.max(i11, i8) + getPaddingTop() + getPaddingBottom();
        int i20 = i2;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i19 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i20, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.u) {
            int childCount2 = getChildCount();
            int i21 = 0;
            while (true) {
                if (i21 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i21);
                if (a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i21++;
            }
        }
        z2 = false;
        if (z2) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        ActionMenuView actionMenuView = this.a;
        ax axVar = actionMenuView != null ? actionMenuView.a : null;
        if (!(cVar.a == 0 || this.r == null || axVar == null)) {
            MenuItem findItem = axVar.findItem(cVar.a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (cVar.b) {
            removeCallbacks(this.O);
            post(this.O);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        k();
        ci ciVar = this.m;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != ciVar.g) {
            ciVar.g = z2;
            if (!ciVar.h) {
                ciVar.a = ciVar.e;
                ciVar.b = ciVar.f;
            } else if (z2) {
                ciVar.a = ciVar.d != Integer.MIN_VALUE ? ciVar.d : ciVar.e;
                ciVar.b = ciVar.c != Integer.MIN_VALUE ? ciVar.c : ciVar.f;
            } else {
                ciVar.a = ciVar.c != Integer.MIN_VALUE ? ciVar.c : ciVar.e;
                ciVar.b = ciVar.d != Integer.MIN_VALUE ? ciVar.d : ciVar.f;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        a aVar = this.r;
        if (!(aVar == null || aVar.a == null)) {
            cVar.a = this.r.a.getItemId();
        }
        cVar.b = N_();
        return cVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }
}
