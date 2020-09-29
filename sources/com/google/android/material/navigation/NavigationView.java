package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.spotify.music.R;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] c = {16842912};
    private static final int[] d = {-16842910};
    private final fad e;
    private final fae f;
    private final int g;
    private MenuInflater h;

    public static class a extends jt {
        public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public Bundle a;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f = new fae();
        this.e = new fad(context);
        cp b = faj.b(context, attributeSet, defpackage.eyt.a.bI, i, 2132017907, new int[0]);
        ip.a((View) this, b.a(defpackage.eyt.a.bJ));
        if (b.f(defpackage.eyt.a.bM)) {
            ip.e((View) this, (float) b.e(defpackage.eyt.a.bM, 0));
        }
        ip.b((View) this, b.a(defpackage.eyt.a.bK, false));
        this.g = b.e(defpackage.eyt.a.bL, 0);
        ColorStateList e2 = b.f(defpackage.eyt.a.bR) ? b.e(defpackage.eyt.a.bR) : a(16842808);
        if (b.f(defpackage.eyt.a.bS)) {
            i2 = b.g(defpackage.eyt.a.bS, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList = null;
        if (b.f(defpackage.eyt.a.bT)) {
            colorStateList = b.e(defpackage.eyt.a.bT);
        }
        if (!z && colorStateList == null) {
            colorStateList = a(16842806);
        }
        Drawable a2 = b.a(defpackage.eyt.a.bO);
        if (b.f(defpackage.eyt.a.bP)) {
            this.f.b(b.e(defpackage.eyt.a.bP, 0));
        }
        int e3 = b.e(defpackage.eyt.a.bQ, 0);
        this.e.a((defpackage.ax.a) new defpackage.ax.a() {
            public final void a(ax axVar) {
            }

            public final boolean a(ax axVar, MenuItem menuItem) {
                return false;
            }
        });
        fae fae = this.f;
        fae.d = 1;
        fae.a(context, (ax) this.e);
        this.f.a(e2);
        if (z) {
            this.f.a(i2);
        }
        this.f.b(colorStateList);
        this.f.a(a2);
        this.f.c(e3);
        this.e.a((bd) this.f);
        fae fae2 = this.f;
        if (fae2.a == null) {
            fae2.a = (NavigationMenuView) fae2.f.inflate(R.layout.design_navigation_menu, this, false);
            if (fae2.e == null) {
                fae2.e = new b();
            }
            fae2.b = (LinearLayout) fae2.f.inflate(R.layout.design_navigation_item_header, fae2.a, false);
            fae2.a.a((androidx.recyclerview.widget.RecyclerView.a) fae2.e);
        }
        addView(fae2.a);
        if (b.f(defpackage.eyt.a.bU)) {
            int g2 = b.g(defpackage.eyt.a.bU, 0);
            this.f.b(true);
            if (this.h == null) {
                this.h = new ao(getContext());
            }
            this.h.inflate(g2, this.e);
            this.f.b(false);
            this.f.a(false);
        }
        if (b.f(defpackage.eyt.a.bN)) {
            int g3 = b.g(defpackage.eyt.a.bN, 0);
            fae fae3 = this.f;
            fae3.b.addView(fae3.f.inflate(g3, fae3.b, false));
            fae3.a.setPadding(0, 0, 0, fae3.a.getPaddingBottom());
        }
        b.a.recycle();
    }

    private ColorStateList a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = ab.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        return new ColorStateList(new int[][]{d, c, EMPTY_STATE_SET}, new int[]{a2.getColorForState(d, defaultColor), i2, defaultColor});
    }

    public final void a(iw iwVar) {
        fae fae = this.f;
        int b = iwVar.b();
        if (fae.n != b) {
            fae.n = b;
            if (fae.b.getChildCount() == 0) {
                fae.a.setPadding(0, fae.n, 0, fae.a.getPaddingBottom());
            }
        }
        ip.b((View) fae.b, iwVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.g), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.d);
        this.e.b(aVar.a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = new Bundle();
        this.e.a(aVar.a);
        return aVar;
    }
}
