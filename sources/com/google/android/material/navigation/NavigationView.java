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
    private final ezm e;
    private final ezn f;
    private final int g;
    private MenuInflater h;

    public static class a extends jt {
        public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
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
        ColorStateList colorStateList;
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f = new ezn();
        this.e = new ezm(context);
        cp b = ezs.b(context, attributeSet, defpackage.eyc.a.bI, i, 2132017904, new int[0]);
        ip.a((View) this, b.a(defpackage.eyc.a.bJ));
        if (b.f(defpackage.eyc.a.bM)) {
            ip.e((View) this, (float) b.e(defpackage.eyc.a.bM, 0));
        }
        ip.b((View) this, b.a(defpackage.eyc.a.bK, false));
        this.g = b.e(defpackage.eyc.a.bL, 0);
        if (b.f(defpackage.eyc.a.bR)) {
            colorStateList = b.e(defpackage.eyc.a.bR);
        } else {
            colorStateList = a(16842808);
        }
        if (b.f(defpackage.eyc.a.bS)) {
            i2 = b.g(defpackage.eyc.a.bS, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList2 = null;
        if (b.f(defpackage.eyc.a.bT)) {
            colorStateList2 = b.e(defpackage.eyc.a.bT);
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = a(16842806);
        }
        Drawable a2 = b.a(defpackage.eyc.a.bO);
        if (b.f(defpackage.eyc.a.bP)) {
            this.f.b(b.e(defpackage.eyc.a.bP, 0));
        }
        int e2 = b.e(defpackage.eyc.a.bQ, 0);
        this.e.a((defpackage.ax.a) new defpackage.ax.a() {
            public final void a(ax axVar) {
            }

            public final boolean a(ax axVar, MenuItem menuItem) {
                return false;
            }
        });
        ezn ezn = this.f;
        ezn.d = 1;
        ezn.a(context, (ax) this.e);
        this.f.a(colorStateList);
        if (z) {
            this.f.a(i2);
        }
        this.f.b(colorStateList2);
        this.f.a(a2);
        this.f.c(e2);
        this.e.a((bd) this.f);
        ezn ezn2 = this.f;
        if (ezn2.a == null) {
            ezn2.a = (NavigationMenuView) ezn2.f.inflate(R.layout.design_navigation_menu, this, false);
            if (ezn2.e == null) {
                ezn2.e = new b();
            }
            ezn2.b = (LinearLayout) ezn2.f.inflate(R.layout.design_navigation_item_header, ezn2.a, false);
            ezn2.a.a((androidx.recyclerview.widget.RecyclerView.a) ezn2.e);
        }
        addView(ezn2.a);
        if (b.f(defpackage.eyc.a.bU)) {
            int g2 = b.g(defpackage.eyc.a.bU, 0);
            this.f.b(true);
            if (this.h == null) {
                this.h = new ao(getContext());
            }
            this.h.inflate(g2, this.e);
            this.f.b(false);
            this.f.a(false);
        }
        if (b.f(defpackage.eyc.a.bN)) {
            int g3 = b.g(defpackage.eyc.a.bN, 0);
            ezn ezn3 = this.f;
            ezn3.b.addView(ezn3.f.inflate(g3, ezn3.b, false));
            ezn3.a.setPadding(0, 0, 0, ezn3.a.getPaddingBottom());
        }
        b.a.recycle();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = new Bundle();
        this.e.a(aVar.a);
        return aVar;
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
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.g), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void a(iw iwVar) {
        ezn ezn = this.f;
        int b = iwVar.b();
        if (ezn.n != b) {
            ezn.n = b;
            if (ezn.b.getChildCount() == 0) {
                ezn.a.setPadding(0, ezn.n, 0, ezn.a.getPaddingBottom());
            }
        }
        ip.b((View) ezn.b, iwVar);
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
}
